package com.collections.comparable;

import java.util.*;

class DescendingOrderStudent implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        //Below one is for ascending order
        // return Integer.compare(o1.getId(),o2.getId());


        //Below one is for descending order
        return Integer.compare(o2.getId(),o1.getId());
    }
}
public class StudentRunner {
    public static void main(String[] args) {
        ArrayList<Student> objArrList = new ArrayList<>(Arrays.asList(new Student(10,"Ram"),new Student(22, "Shyam")
                                                        ,new Student(3,"Velu")));
        System.out.println(objArrList);

        //Collections.sort(objArrList); // this would not work without implementing comparable interface
        // and defining compareTo method.


        objArrList.sort(new DescendingOrderStudent()); // using custom comparator , scroll up for implementation
        System.out.println(objArrList);
        HashSet<String> hs = new HashSet<String>(Arrays.asList("Lor","Por","Lor"));
        System.out.println(Arrays.toString(hs.toArray()));

    }
}
