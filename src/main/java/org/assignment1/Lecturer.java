package org.assignment1;

import java.util.ArrayList;

public class Lecturer {

    private String name;
    private int age;
    private String dob;
    private String id;
    private String username;
    private ArrayList<Module> modulesTeaching;

    public Lecturer(String name, int age, String dob, String id) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.modulesTeaching = new ArrayList<Module>();
        generateUsername();
    }

    private void generateUsername(){
        this.username = name + age;
    }

    public void addModuleTeaching(Module module){
        this.modulesTeaching.add(module);
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

    public ArrayList<Module> getModulesTeaching() {
        return modulesTeaching;
    }

    public void setModulesTeaching(ArrayList<Module> modulesTeaching) {
        this.modulesTeaching = modulesTeaching;
    }

}
