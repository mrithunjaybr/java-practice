package com.arrays;

public class Weekdays {
    private String[] week;
    Weekdays(String[] week){
        this.week=week;
    }
    public int longestString(){
        int x = Integer.MIN_VALUE;
        for (String i : this.week){
           x = Math.max(i.length(),x);
        }
        return x;
    }
    public void printReverse(){
        for (int i = this.week.length-1;i>=0;i--){
            System.out.println(this.week[i]);
        }
    }
}
