package com.example.demo.domain;

import java.time.ZonedDateTime;

public class Lecture {

    private final Long lectureId;

    private final Long courseId;

    private final Integer day;

    private ZonedDateTime start;

    private ZonedDateTime end;

    public Lecture(
            final Long lectureId,
            final Long courseId,
            final Integer day,
            final ZonedDateTime start,
            final ZonedDateTime end
    ) {

        this.lectureId = lectureId;
        this.courseId = courseId;
        this.day = day;
        this.start = start;
        this.end = end;

    }

    public Long getLectureId() {
        return lectureId;
    }

    public Long getCourseId() {
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

    public void setStart(ZonedDateTime start) {
        this.start = start;
    }

    public void setEnd(ZonedDateTime end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "lectureId=" + lectureId +
                ", courseId=" + courseId +
                ", day=" + day +
                ", start=" + start +
                ", end=" + end +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lecture lecture = (Lecture) o;

        if (!lectureId.equals(lecture.lectureId)) return false;
        if (!courseId.equals(lecture.courseId)) return false;
        return day.equals(lecture.day);
    }

    @Override
    public int hashCode() {
        int result = lectureId.hashCode();
        result = 31 * result + courseId.hashCode();
        result = 31 * result + day.hashCode();
        return result;
    }

}
