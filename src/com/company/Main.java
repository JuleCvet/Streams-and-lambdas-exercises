package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Comparator n = (Comparator<String>)(String s1, String s2) -> s2.compareTo(s1);
        List<String> names = Arrays.asList("Julijana", "Martina", "Andrej", "Derek", "Daniel", "David");

        names.stream()
                .filter(name -> name.startsWith("D"))
                .map(String::toUpperCase)
                .sorted(n)//default has ascending order (rastecki)! With n, has descending order
                .forEach(System.out::println);
    }
}
