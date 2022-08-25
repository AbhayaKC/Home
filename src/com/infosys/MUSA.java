package com.infosys;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class MUSA {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("earth");
        list.add("Jupiter");
        list.add("Mars");
        list.set(1, "Saturn");
        list.add("Earth");

        HashSet<String > set = new HashSet<>();
        set.addAll(list);

        for (String element : set){
            System.out.println(element +" ");
        }

    }
}
