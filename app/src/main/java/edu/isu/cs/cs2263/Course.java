package edu.isu.cs.cs2263;

import java.lang.reflect.Array;

public class Course {

    private int courseNum;
    private String courseName;
    private int numCreds;
    // holds department names
    static Array departments;
    // holds course codes
    static Array courseCode;

    public Course(){}

    public Course(int courseNum, String courseName, int numCreds) {
        this.courseNum = courseNum;
        this.courseName = courseName;
        this.numCreds = numCreds;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumCreds() {
        return numCreds;
    }

    public void setNumCreds(int numCreds) {
        this.numCreds = numCreds;
    }

    public static Array getDepartments() {
        return departments;
    }

    public static void setDepartments(Array departments) {
        Course.departments = departments;
    }

    public static Array getCourseCode() {
        return courseCode;
    }

    public static void setCourseCode(Array courseCode) {
        Course.courseCode = courseCode;
    }

    @Override
    public String toString() {
        return String.format("%i, %s, %d, ", courseNum, courseName, numCreds);
    }
}
