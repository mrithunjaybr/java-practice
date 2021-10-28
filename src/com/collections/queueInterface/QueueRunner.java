package com.collections.queueInterface;

import java.util.*;

class StringLengthComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(),o2.length());
    }
public static class QueueRunner {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>(new StringLengthComp());
        pq.addAll(List.of("Zebrasss","Lion","Monkey"));
        //System.out.println(Arrays.toString(pq.toArray()));
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());



        }
    }
}
