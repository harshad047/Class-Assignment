package com.tss.test;

import java.util.function.Consumer;

public class DemoTest {

	public static void main(String[] args) {
		Consumer<Integer> demo = (number) -> System.out.println("Learning Functional Interface: "+number);
		show(demo);
		
		
	}

	private static void show(Consumer demo) {
		demo.accept(10);
	}
}
