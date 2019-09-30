package com.company;


import java.util.ArrayList;

public class q1 {

    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<String>();
        list.add("Apple");
        list.add("Melon");
        list.add("Grape");
        list.add("Berry");
        System.out.println(list);
        list.set(0,"Kiwi");
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
