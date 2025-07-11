package com.tss.model.inheritance.model;

public class TestInner {
	private String msg = "Hello";
	
	public class inner
	{
		public void saygreet()
		{
			System.out.println(msg);
		}
	}
}
