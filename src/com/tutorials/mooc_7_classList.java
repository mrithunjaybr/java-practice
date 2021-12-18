package com.tutorials;

import java.util.ArrayList;
import java.util.Scanner;

public class mooc_7_classList {
    public static void main(String[] args) {
        ArrayList<TelevisionProgram> list = new ArrayList<TelevisionProgram>();
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Entering");
            String tvshow = scan.nextLine();
            if(tvshow.isEmpty()){
                break;
            }
            String time = scan.nextLine();
            list.add(new TelevisionProgram(tvshow,Integer.parseInt(time)));

        }

        System.out.println("Program's Maximum duration?");
        int dur = scan.nextInt();
        for (TelevisionProgram z : list){
            if(z.getTime()<=dur){
                System.out.println(z);
            }
        }

    }
}
