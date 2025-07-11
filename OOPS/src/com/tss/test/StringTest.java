package com.tss.test;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method
		StringBuilder str1 = new StringBuilder("cde");
		StringBuilder str2 = new StringBuilder("agh");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1 == str2);
		str1 = str2;
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1 == str2);
		System.out.println(str2);
	}

}
