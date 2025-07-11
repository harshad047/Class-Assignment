package com.tss.basics.commandline;
public class SimpleInterest {

	public static void main(String[] args) {
		
		int principal_amount = Integer.parseInt(args[0]);
		double rate_of_interest = Double.parseDouble(args[1]);
		float time_duration = Float.parseFloat(args[2]);
		
		simpleinterest(principal_amount,rate_of_interest,time_duration);

	}
	
	private static void simpleinterest(int principal_amount,double rate_of_interest, float time_duration)
	{
		double simpleinterest =((principal_amount*rate_of_interest*time_duration)/ 100);
		System.out.println("Simple Interest is:-"+simpleinterest);
	}

}
