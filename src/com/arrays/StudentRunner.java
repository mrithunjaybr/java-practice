package com.arrays;

import java.math.BigDecimal;
import java.util.ArrayList;

public class StudentRunner {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(9);
        marks.add(92);
        marks.add(80);
        marks.add(70);
        Student obj  = new Student("Ram",marks);
        System.out.println(obj.getTotalMarks());
        System.out.println(obj.maxMark());
        System.out.println(obj.minMark());
        BigDecimal average = obj.getAvgMarks();
        System.out.println(average);

    }
}
