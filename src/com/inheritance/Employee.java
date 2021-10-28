package com.inheritance;

public class Employee extends Person {
    private String title;
    private String employer;
    private String employerGrade;
    private Integer salary;

    public Employee(String title, String employer, String employerGrade, int salary) {
        this.title = title;
        this.employer = employer;
        this.employerGrade = employerGrade;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='"  + this.getName() + '\'' +
                "email='" + this.getEmail() + '\'' +
                "phoneNumber='" + this.getPhoneNumber() + '\'' +
                "title='" + title + '\'' +
                ", employer='" + employer + '\'' +
                ", employerGrade='" + employerGrade + '\'' +
                ", salary=" + salary +
                '}';
    }
}
