package com.tutorials;

import java.util.ArrayList;

public class mooc_5_arrayListMethod {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(2);
        passtoFunc(list);
        System.out.println(list);

    }

    private static void passtoFunc(ArrayList<Integer> list) {
        list.remove(0);
        list.remove(0);
    }
}
