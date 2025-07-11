package com.tss.test;

import com.tss.model.Box;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box box1 = new Box();
		box1.initialize();
		box1.display();
		
		box1.setDepth(220);
		box1.setWidth(100);
		
		box1.display();
		
		System.out.println("Height of Box1 is: "+box1.getHeight());
	}

}
