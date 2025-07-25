package com.tss.model;

public class Caller implements Runnable {
	String msg;
	Callme target;
	public Thread t;

	public Caller(Callme targ, String s) {
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}

	
	public void run() {
		synchronized (target) {
			target.call(msg);
		}
		
	}
}
