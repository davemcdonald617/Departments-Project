package edu.isu.cs.cs2263;

import java.util.Vector;

public class Department {

    private String name;
    private String code;
    private java.util.Vector<Course> courses;

    public Department() {}

    public Department(String name){
        this.name = name;
    }

    public Department(String name, Vector<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCourses(Vector<Course> courses) {
        this.courses = courses;
    }

    public Vector<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return String.format("%s , ", name + courses );

    }
}

