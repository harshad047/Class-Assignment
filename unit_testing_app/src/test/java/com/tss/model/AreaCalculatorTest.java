package com.tss.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AreaCalculatorTest {
	AreaCalculator calculator;

	@BeforeEach
	void init() {
		calculator = new AreaCalculator();
	}

	@AfterAll
	static void display() {
		System.out.println("Testing done");
	}

	@Test
	void testAreaCircle() {
		assertEquals(314, calculator.circleArea(10));
	}

	@Test
	void testAreaRectangle() {
		assertEquals(200, calculator.rectangleArea(10, 20));
	}
}
