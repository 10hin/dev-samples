package com.example.demo.web;

import com.example.demo.domain.LectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class LectureController {

    private final LectureRepository lectureRepository;

    @Autowired
    public LectureController(

            final LectureRepository lectureRepository

    ) {

        this.lectureRepository = lectureRepository;

    }

    @GetMapping(path={
            "/courses/{courseId}/lectures/{day}",
            "/courses/{courseId}/lectures/{day}/",
    })
    public Mono<ResponseEntity<LectureResponse>> getLecture(
            @PathVariable("courseId")
            final String courseId,
            @PathVariable("day")
            final Integer day
    ) {

        return this.lectureRepository.findByCourseIdAndDay(CourseResponse.courseIdToLong(courseId), day)
                .map(LectureResponse::fromDomain)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build())
                .onErrorResume((err) -> Mono.just(ResponseEntity.internalServerError().build()));

    }

}
