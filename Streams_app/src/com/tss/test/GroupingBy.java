package com.tss.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupingBy {

	public static void main(String[] args) {
		List<String> words = List.of("apple", "banana", "apricot", "berry", "cat");

		Map<Character, List<String>> groupedByFirstLetter = words.stream()
				.collect(Collectors.groupingBy(s -> s.charAt(0)));

		System.out.println(groupedByFirstLetter);

		Map<Object, Long> countingWithSameLetter = words.stream()
				.collect(Collectors.groupingBy(s->s.charAt(0),Collectors.counting()));
		
		System.out.println(countingWithSameLetter);
		
		
		List<String> sentences = Arrays.asList("Hello world", "hello Java", "Stream API");

        Set<String> uniqueSortedWords = sentences.stream()
            .map(s -> s.split("\\s+"))               
            .flatMap(Arrays::stream)                 
            .map(String::toLowerCase)                
            .collect(Collectors.toCollection(HashSet::new)); 

        System.out.println(uniqueSortedWords);
	}
}
