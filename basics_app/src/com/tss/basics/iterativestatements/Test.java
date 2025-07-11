package com.tss.basics.iterativestatements;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i= 1;i<=100;i++)
		{
			if(i%3==0)
			{
				if(is_prime(i))
				{
					System.out.println(i+" fizzprime");
				}
				else
				{
					System.out.println(i+" Fizz");
				}
			}
			else if(i%5==0)
			{
				System.out.println(i+ "Buzz");
			}
			else if(is_prime(i))
			{
				System.out.println(i+ "prime");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
	private static boolean is_prime(int number) {
		int i = 2;
		while (i <= number / 2) {
			if (number % i == 0) {
				return false;
			}
			i++;
		}
		return true;

	}
}
