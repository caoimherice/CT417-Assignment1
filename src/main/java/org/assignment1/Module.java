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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<String> getAssociatedCourses() {
        return associatedCourses;
    }

    public void setAssociatedCourses(List<String> associatedCourses) {
        this.associatedCourses = associatedCourses;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    private String name;
    private String id;
    private List<Student> students;
    private List<String> associatedCourses;
    private Lecturer lecturer;

    public Module() {
    }
}
