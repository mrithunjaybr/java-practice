package test;

import java.util.*;

public class TestRunner {
    public static void main(String[] args) {
        Map<Character,Integer> mp = new HashMap<>();
        Map<String,Integer> smp = new HashMap<>();
        String s = "This is a great thing";
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(Arrays.stream(arr).toArray()));
        for (int i = 0 ; i < s.length();i++){
            if (mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            }
            else{
                mp.put(s.charAt(i),1);
            }
        }
        for (String i : arr){
            if (smp.containsKey(i)){
                smp.put(i, smp.get(i)+1);
            }
            else{
                smp.put(i,1);
            }

        }
        System.out.println(smp);
        System.out.println(mp);



    }
}
