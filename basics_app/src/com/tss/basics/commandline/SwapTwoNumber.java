package com.tss.basics.commandline;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		
		swaptwonumwiththird(number1,number2);
		swaptwonumwithoutthird(number1,number2);
		

	}
	
	private static void swaptwonumwiththird(int num1,int num2)
	{
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After Swaping:-");
		System.out.println("num1:-"+num1);
		System.out.println("num2:-"+num2);
		
		
	}
	
	private static void swaptwonumwithoutthird(int num1,int num2)
	{
		num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
      
        System.out.println("num1 = " + num1 + " num2 = " + num2);
		
	}


}
