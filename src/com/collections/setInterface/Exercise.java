package com.collections.setInterface;

import java.lang.reflect.Array;
import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        ArrayList<Character> lst = new ArrayList<>(Arrays.asList('A','Z','A','B','Z','F'));
        //Find Unique characters maintaining insertion order
        LinkedHashSet<Character> lhs = new LinkedHashSet<>(lst);
        TreeSet<Character> ts = new TreeSet<>(lst);
//        for (Character i : lst){
//            lhs.add(i);
//            ts.add(i);
//        }

        System.out.println(Arrays.toString(lst.toArray()));
        System.out.println(Arrays.toString(lhs.toArray()));
        System.out.println(Arrays.toString(ts.toArray()));
    }
}
