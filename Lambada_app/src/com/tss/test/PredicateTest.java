package com.tss.test;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		
		Predicate<Integer> isEven = (num) -> num % 2 == 0;

        int number = 7;

        if (isEven.test(number)) {
            System.out.println(number + " is Even");
            return;
        } 
        System.out.println(number + " is Odd");
	}

}
