package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q2 {

    public static<K> void increment(Map<K, Integer> map, K key) {
        map.putIfAbsent(key, 0);
        map.put(key, map.get(key) + 1);
    }


    public static void main(String[] args) {

        HashMap<String,Integer> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();

        String[] str=string.split("[^A-Za-z0-9]| +");
        int len=str.length;
        for(int i=0;i<len;i++)
        {
                increment(map,str[i]);
        }
        map.remove("");
        System.out.println(map);
    }

}
