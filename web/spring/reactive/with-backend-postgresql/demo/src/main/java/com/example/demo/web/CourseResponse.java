package com.example.demo.web;

import com.example.demo.domain.Course;

public class CourseResponse {

    private final String courseId;

    private final String title;

    private final String description;

    public CourseResponse(String courseId, String title, String description) {
        this.courseId = courseId;
        this.title = title;
        this.description = description;
    }

    public String getCourseId() {
        return this.courseId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseResponse that = (CourseResponse) o;

        if (!this.courseId.equals(that.courseId)) return false;
        if (!this.title.equals(that.title)) return false;
        return this.description.equals(that.description);
    }

    @Override
    public int hashCode() {
        int result = this.courseId.hashCode();
        result = 31 * result + this.title.hashCode();
        result = 31 * result + this.description.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "CourseResponse{" +
                "courseId=" + this.courseId +
                ", title='" + this.title + '\'' +
                ", description='" + this.description + '\'' +
                '}';
    }

    public static CourseResponse fromDomain(final Course domain) {
        return new CourseResponse(
                CourseResponse.courseIdToString(domain.getCourseId()),
                domain.getTitle(),
                domain.getDescription()
        );

    }

    public static String courseIdToString(final Long courseId) {
        long current = courseId;
        final long pos1 = current % 100_000L;
        current = current / 100_000L;
        final long pos2 = current % 100_000L;
        current = current / 100_000L;
        final long pos3 = current % 100_000L;
        current = current / 100_000L;
        final long pos4 = current % 100_000L;
        return String.format("%04d-%05d-%05d-%05d", pos4, pos3, pos2, pos1);
    }

    public static Long courseIdToLong(final String courseId) {
        final String[] positions = courseId.split("-");
        long current = 0L;
        current += Long.parseLong(positions[3]);
        current *= 100_000;
        current += Long.parseLong(positions[2]);
        current *= 100_000;
        current += Long.parseLong(positions[1]);
        current *= 100_000;
        current += Long.parseLong(positions[0]);
        return current;
    }

}
