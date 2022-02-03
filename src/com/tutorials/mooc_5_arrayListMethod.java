package com.tutorials;

import java.util.ArrayList;

public class mooc_5_arrayListMethod {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] s = {1,2,3,4};
        list.add(5);
        list.add(3);
        list.add(2);
        passtoFunc(list,s);
        System.out.println(list);
        for (int i : s){
            System.out.println(i);
        }

    }

    private static void passtoFunc(ArrayList<Integer> list, int[] x) {
        list.remove(0);
        list.remove(0);
        x[2]=1;
    }
}
