package com.tss.test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicStreamTest {

	public static void main(String []args)
	{
		List<Integer>numbers = Arrays.asList(5,3,4,7,8);
		
		Stream<Integer> numberStream = numbers.stream();
		
		numberStream.forEach((number)->System.out.print(number+" "));
				
		numbers.stream()
				.forEach((number)->System.out.println(number*number));
		
		numbers.stream()
				.filter((number)->number%2!=0)
				.forEach(number->System.out.println(number));
	
		List<Integer> oddNumbers = numbers.stream()
										   .filter((number)->number%2!=0)
										   .collect(Collectors.toList());	
	
		System.out.println(oddNumbers);
		Set<Integer>squareNumbers=numbers.stream().map((number)->number*number).collect(Collectors.toSet());
		
		System.out.println(squareNumbers);
		
		Set<Integer>squareNumberFiltered=numbers.stream()
												.filter((number)->number%2==0)
												.map((number)->number*number)
												.collect(Collectors.toSet());
		
		System.out.println(squareNumberFiltered);

	}
}
