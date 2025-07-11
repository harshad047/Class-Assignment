package com.tss.model.inheritance.test;

import com.tss.model.inheritance.model.Demo;
import com.tss.model.inheritance.model.IDemo;

public class DemoTest {

	public static void main(String[] args) {
		
		Demo object = new Demo();
		object.method1();
		
		IDemo.method2();

	}

}
