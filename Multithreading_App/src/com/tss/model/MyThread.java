package com.tss.model;

public class MyThread extends Thread{

	public MyThread(String name)
	{
		super(name);
	}
	public void run()
	{
	System.out.println(currentThread().getName()+" Is Running");
	}
}
