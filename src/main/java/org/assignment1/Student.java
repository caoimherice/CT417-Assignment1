package org.assignment1;

import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private String dob;
    private String id;
    private String username;
    private ArrayList<Course> courses;
    private  ArrayList<Module> modules;

    public Student(String name, int age, String dob, String id){
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.courses = new ArrayList<Course>();
        this.modules = new ArrayList<Module>();
        generateUsername();
    }

    // concatenating a students name and age to create their username
    private void generateUsername(){
        this.username = name + age;
    }

    // adding a course to the list of courses a student is taking
    public void addCourses(Course course){
        this.courses.add(course);
    }

    // adding a module to the list of modules a student is taking
    public void addModule(Module module) {
        this.modules.add(module);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

}
