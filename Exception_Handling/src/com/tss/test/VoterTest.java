package com.tss.test;
import com.tss.model.Voter;


public class VoterTest {
	public static void main(String []args) {
		try
		{
			Voter voter = new Voter("Harshad",210,19);
			
			Voter voter2 = new Voter("Mahek",310,10);
			
		}
		catch(Exception exception)
		{
			System.out.println(exception.getMessage());
		}
	}
}
