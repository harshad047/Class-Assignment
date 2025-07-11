package com.tss.model.inheritance.test;

import com.tss.model.inheritance.model.Isayhello;

public class AnnonymusTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Isayhello i1 = new Isayhello()
		{

			@Override
			public void saygreet() {
				// TODO Auto-generated method stub
				System.out.println("Greeting From Annonymus");
			}
			
		};
		i1.saygreet();
	}

}
