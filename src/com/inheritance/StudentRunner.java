package com.inheritance;

public class StudentRunner {
    public static void main(String[] args) {
        Student mark = new Student("SEC",1990);
        mark.setName("Pazhani");
        mark.setEmail("Palani@gmail.com");
        mark.setPhoneNumber("8322284784");
        System.out.println(mark);
        Employee obj1 = new Employee("manager", "GS","Tier4",140000);
        obj1.setName("NewGuy");
        obj1.setEmail("NewGuy@gmail.com");
        obj1.setPhoneNumber("9876789052");
        System.out.println(obj1);

    }


}
