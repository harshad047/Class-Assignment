package com.tss.test;

import java.util.function.BiConsumer;


public class AdditionTest {

	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> add = (x,y) -> {System.out.println(x+y);};
		
		add.accept(7, 5);
	}

}
