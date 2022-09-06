package com.example.demo.domain;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface LectureRepository {
    Mono<Lecture> findByCourseIdAndDay(final Long courseId, final Integer day);
    Flux<Lecture> findByCourseId(final Long courseId);
}
