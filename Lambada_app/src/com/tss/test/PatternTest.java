package com.tss.test;

import com.tss.model.IPattern;

public class PatternTest {

	public static void main(String[] args) {
		
		IPattern pattern = (n) ->
		{
			int number =1;
			for(int i=1;i<=n;i++)
			{
				for(int j = 1;j<=i;j++)
				{
					System.out.print(number+" ");
					number++;
				}
				System.out.println();
			}
		};
		pattern.print(4);
	}

}
