package org.assignment1;

public class student {
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

    public String getCourses() {
        return courses;
    }

    public String getModules() {
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

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public void setModules(String modules) {
        this.modules = modules;
    }

    private String name;
    private int age;
    private String dob;
    private String id;
    private String username;
    private String courses;
    private String modules;

    public student(String name, int age){
        this.name = name;
        this.age = age;
    }

    private void generateUsername(){
        this.username = name + age;
    }
}
