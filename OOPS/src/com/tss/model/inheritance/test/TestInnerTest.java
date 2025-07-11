package com.tss.model.inheritance.test;

import com.tss.model.inheritance.model.TestInner;

public class TestInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInner outer = new TestInner();
		
		TestInner.inner inner = outer.new inner();
		
		inner.saygreet();
	}

}
