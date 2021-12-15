package com.tutorials;

import java.util.ArrayList;
import java.util.Scanner;

public class mooc_4_arrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (true){
            int inp = scan.nextInt();
            if (inp==-1){
                break;
            }
            list.add(inp);
        }
        int i = scan.nextInt();
        int j = scan.nextInt();
        for(int x = 0 ; x< list.size() ;x++){
            if(list.get(x) >=i && list.get(x)<=j){
                System.out.println(list.get(x));
            }
        }
    }
}
