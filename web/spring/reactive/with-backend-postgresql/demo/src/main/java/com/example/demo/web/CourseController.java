package com.example.demo.web;

import com.example.demo.domain.Course;
import com.example.demo.domain.CourseRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController("/course")
public class CourseController {

    private final CourseRepository courseRepository;

    public CourseController(
            final CourseRepository courseRepository
    ) {

        this.courseRepository = courseRepository;

    }

    @GetMapping("/{courseId}")
    public Mono<ResponseEntity<CourseResponse>> getCourse(
            @PathVariable("courseId")
            final String courseIdStr
    ) {

        final Long courseId;
        try {
            courseId = CourseResponse.courseIdToLong(courseIdStr);
        } catch (final Exception err) {
            return Mono.just(ResponseEntity.badRequest().build());
        }

        return this.courseRepository.findByCourseId(courseId)
                .map(CourseResponse::fromDomain)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build())
                .onErrorResume((err) -> Mono.just(ResponseEntity.internalServerError().build()));

    }

}
