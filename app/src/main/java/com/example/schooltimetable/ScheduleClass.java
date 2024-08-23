package com.example.schooltimetable;

public class ScheduleClass {
    private String className;
    private String time;
    private String venue;
    private String lecturer;
    private String courseId;
    private String year;

    // Default constructor required for calls to DataSnapshot.getValue(ScheduleClass.class)
    public ScheduleClass() {
    }

    public ScheduleClass(String className, String time, String venue, String lecturer, String courseId, String year) {
        this.className = className;
        this.time = time;
        this.venue = venue;
        this.lecturer = lecturer;
        this.courseId = courseId;
        this.year = year;
    }

    // Getters and setters for all fields

    public String getClassName() {
        return className;
    }

    public String getTime() {
        return time;
    }

    public String getVenue() {
        return venue;
    }

    public String getLecturer() {
        return lecturer;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getYear() {
        return year;
    }
}
