package org.example.advanced;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetTest {

    public static void main(String[] args) {
        LinkedHashSet<Integer> integer = new LinkedHashSet<>();

        integer.add(-2);
        integer.add(-5);
        integer.add(5);
        integer.add(0);
        integer.add(2);

        integer.stream().forEach(System.out::println);


        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(-2);
        integerTreeSet.add(-5);
        integerTreeSet.add(5);
        integerTreeSet.add(0);
        integerTreeSet.add(2);

        integerTreeSet.stream().forEach(System.out::println);


    }
}
