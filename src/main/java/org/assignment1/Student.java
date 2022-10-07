package org.assignment1;

import java.util.List;

public class Student {
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDob() {
        return dob;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    private String name;
    private int age;
    private String dob;
    private String id;
    private String username;
    private List<Course> courses;
    private  List<Module> modules;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        generateUsername();
    }

    private void generateUsername(){
        this.username = name + age;
    }
}
