package com.company;

import java.util.HashMap;
import java.util.Map;

public class SumWithStreams {

    public static void main(String[] args) {

        Map<String, Integer> integers = new HashMap<>();
            integers.put("Juki", 5);//the numbers are values
            integers.put("Zoki", 2);
            integers.put("Caki", 1);
            integers.put("Kiki", 0);
            integers.put("Miki", 3);
//mapToInt(), takes numbers one by one, and is returning number for sum
        System.out.println(integers.values().stream().mapToInt(i -> i).sum());
    }
}
