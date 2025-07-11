package com.tss.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadTest {
	public static void main(String [] args) throws IOException
	{
		try 
		(FileReader reader = new FileReader("input.txt");FileWriter writer = new FileWriter("output");){
			
			int ch;
			
			
			
			while((ch = reader.read()) != -1)
			{
				writer.write(ch);
			}
			
			System.out.println("copied successfully");
			while ((ch = reader.read()) != -1)
			{
				System.out.print((char) ch);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
