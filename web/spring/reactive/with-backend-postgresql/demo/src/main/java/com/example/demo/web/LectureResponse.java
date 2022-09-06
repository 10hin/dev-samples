package com.example.demo.web;

import java.time.ZonedDateTime;
import java.util.Objects;

public class LectureResponse {

    private final String courseId;


    private final Integer day;

    private final ZonedDateTime start;

    private final ZonedDateTime end;

    public LectureResponse(String courseId, Integer day, ZonedDateTime start, ZonedDateTime end) {
        this.courseId = courseId;
        this.day = day;
        this.start = start;
        this.end = end;
    }

    public String getCourseId() {
        return courseId;
    }

    public Integer getDay() {
        return day;
    }

    public ZonedDateTime getStart() {
        return start;
    }

    public ZonedDateTime getEnd() {
        return end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LectureResponse that = (LectureResponse) o;
        return courseId.equals(that.courseId) && day.equals(that.day) && start.equals(that.start) && end.equals(that.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, day, start, end);
    }
}
