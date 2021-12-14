package com.tutorials;

import java.sql.SQLOutput;

public class mooc_2_methods {
    public static void main(String[] args) {
        divisibleByThreeInRange(2,20);
    }

    private static void divisibleByThreeInRange(int i, int j) {
        for (int x = i ; x <= j ; x++){
            if(x%3==0){
                System.out.println(x);
            }
        }

    }
}
