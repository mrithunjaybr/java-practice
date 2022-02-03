package com.tutorials;

import java.sql.SQLOutput;
import java.util.Scanner;

public class mooc_1_while {
    public static void main(String[] args) {
        int ones = 0;
        int inp = 0;
        Scanner scan = new Scanner(System.in);
        while (true){
            inp = Integer.valueOf(scan.nextLine());
            if (inp == 0){
                break;
            }
            else {
                ones +=inp;
            }
        }
        System.out.println(ones);
    }
}
