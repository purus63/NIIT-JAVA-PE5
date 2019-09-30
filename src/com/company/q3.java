package com.company;

import java.util.HashMap;

public class q3 {
    public static void main(String[] args) {
        HashMap<String,Boolean> map= new HashMap<>();

        String[] ch={"a","b","c","d","e","f","a"};
        int len=ch.length;

        for(int i=0;i<len;i++) {
            if(!map.containsKey(ch[i]))
                map.put(ch[i],false);
            else
                map.put(ch[i],true);
            }
        System.out.println(map);
    }
}
