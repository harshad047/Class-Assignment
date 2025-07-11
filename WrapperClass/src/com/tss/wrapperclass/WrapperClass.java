package com.tss.wrapperclass;

public class WrapperClass {
	public static void main(String []args)
	{
		int a = 5;
		
		Integer b=a; // AutoBoxing
//		Integer d = Integer.valueOf(a);   line 8 and 9 is having same working
		
		int c = b;// AutoUnboxing
//		int d = b.intValue();
		
		System.out.println(a+" "+b+" "+c);
		
//		int d = null; 
//		premitive int can not hold null value but wrapper class Integer can hold null because it is object
		Integer e = null; 
		
		System.out.println(e.max(5, 6));
		System.out.println(e.toBinaryString(15));
		
		String s = "123";
		Integer i = null;
		System.out.println(Integer.valueOf(s));
		System.out.println(i);
}
	
}


