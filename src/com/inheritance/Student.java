package com.inheritance;

public class Student extends Person {
    private String college;
    private int year;

    public Student(String college, int year) {
        this.college = college;
        this.year = year;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + this.getName() + '\'' +
                 "Email='" + this.getEmail() + '\'' +
                "Phone='" + this.getPhoneNumber() + '\'' +
                "college='" + college + '\'' +
                ", year=" + year +
                '}';
    }
}
