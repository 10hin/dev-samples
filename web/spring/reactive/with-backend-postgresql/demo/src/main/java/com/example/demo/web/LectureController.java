package com.example.demo.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class LectureController {

    @GetMapping("/course/{courseId}/{day}")
    public ResponseEntity<Mono<LectureResponse>> getLecture(
            @PathVariable("courseId")
            final String courseId,
            @PathVariable("day")
            final int day
    ) {



    }

}
