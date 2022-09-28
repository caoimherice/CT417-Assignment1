package org.assignment1;

import java.util.List;

public class Module {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getStudents() {
        return students;
    }

    public void setStudents(List<String> students) {
        this.students = students;
    }

    public List<String> getAssociatedCourses() {
        return associatedCourses;
    }

    public void setAssociatedCourses(List<String> associatedCourses) {
        this.associatedCourses = associatedCourses;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    private String name;
    private String id;
    private List<String> students;
    private List<String> associatedCourses;
    private String lecturer;

    public Module() {
    }
}
