package com.arrays;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
public class Student {
    String name ;
    ArrayList<Integer> marks = new ArrayList<>();
    Student(String name, ArrayList<Integer> marks){
        this.name = name;
        this.marks.addAll(marks);
    }

    public int getTotalMarks(){
        int sum = 0;
        for(int m : this.marks){
            sum += m;
        }
        return sum;
    }
    public int maxMark(){
        int maxim = Integer.MIN_VALUE;
        for (int m:this.marks){
            maxim = Math.max(m,maxim);
        }
        return maxim;
    }
    public int minMark(){
        int minim = Integer.MAX_VALUE;
        for (int m:this.marks){
            minim = Math.min(m,minim);
        }
        return minim;
    }

    public BigDecimal getAvgMarks() {
        return new BigDecimal(this.getTotalMarks()).divide(new BigDecimal(this.marks.size()));
    }
}
