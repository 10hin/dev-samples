package com.example.demo.domain;

import reactor.core.publisher.Mono;

public interface CourseRepository {
    Mono<Course> findByCourseId(final Long courseId);
}
