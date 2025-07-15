package com.tss.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentNames {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        
        names.add("Jay");
        names.add("Nimesh");
        names.add("Mark");
        names.add("Mahesh");
        names.add("Ramesh");

        // Get first 3 names
        List<String> first3Sorted = names.stream()
        	    .limit(3)
        	    .sorted()
        	    .collect(Collectors.toList());
        System.out.println(first3Sorted);

        // Filter first 3 with a and sort
        List<String> first3WithA = first3Sorted.stream()
                .filter((name) -> name.toLowerCase().contains("a"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(first3WithA);

        // Sort all names descending
        List<String> allSortedDesc = names.stream()
        	    .sorted(Comparator.reverseOrder())
        	    .collect(Collectors.toList());
        System.out.println(allSortedDesc);

        // Print first 3 letters of each name
        names.stream()
            .map(name -> name.length() >= 3 ? name.substring(0, 3) : name)
            .forEach(sub -> System.out.print(sub + "\t"));
        System.out.println("\n");

        // Filter names with length <= 4
        List<String> lessOrEqual4 = names.stream()
                .filter(name -> name.length() <= 4)
                .collect(Collectors.toList());
        System.out.println(lessOrEqual4);
    }
}
