package org.assignment1;

public class Lecturer {
    public Lecturer(String name, int age) {
        this.name = name;
        this.age = age;
        generateUsername();
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

    public String getModulesTeaching() {
        return modulesTeaching;
    }

    public void setModulesTeaching(String modulesTeaching) {
        this.modulesTeaching = modulesTeaching;
    }

    private String name;
    private int age;
    private String dob;
    private String id;
    private String username;
    private String modulesTeaching;

    private void generateUsername(){
        this.username = name + age;
    }
}
