package org.assignment1;

import java.util.ArrayList;

public class Module {

    private String name;
    private String id;
    private ArrayList<Student> students;
    private ArrayList<Course> associatedCourses;
    private Lecturer lecturer;

    public Module(String name, String id, Lecturer lecturer) {
        this.name = name;
        this.id = id;
        this.lecturer = lecturer;
        this.students = new ArrayList<Student>();
        this.associatedCourses = new ArrayList<Course>();
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void addCourse(Course course){
        this.associatedCourses.add(course);
    }

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

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Course> getAssociatedCourses() {
        return associatedCourses;
    }

    public void setAssociatedCourses(ArrayList<Course> associatedCourses) {
        this.associatedCourses = associatedCourses;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

}
