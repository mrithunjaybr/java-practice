package com.collections.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StudentRunner {
    public static void main(String[] args) {
        ArrayList<Student> objArrList = new ArrayList<>(Arrays.asList(new Student(10,"Ram"),new Student(22, "Shyam")
                                                        ,new Student(3,"Velu")));
        System.out.println(objArrList);

        Collections.sort(objArrList); // this would not work without implementing comparable interface
        // and defining toCompare method.
        System.out.println(objArrList);

    }
}
