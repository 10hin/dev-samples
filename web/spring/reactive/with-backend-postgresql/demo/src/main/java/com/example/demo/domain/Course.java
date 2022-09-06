package com.example.demo.domain;

public class Course {

    private final Long courseId;

    private String title;

    private String description;

    public Course(Long courseId, String title, String description) {
        this.courseId = courseId;
        this.title = title;
        this.description = description;
    }

    public Long getCourseId() {
        return courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (!courseId.equals(course.courseId)) return false;
        if (!title.equals(course.title)) return false;
        return description.equals(course.description);
    }

    @Override
    public int hashCode() {
        int result = courseId.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + description.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}
