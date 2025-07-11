package com.tss.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Count {
	public static void main(String[] args) {
		int ch;
		int countCharacter = 0;
		int countWord = 0;
		int lineCount = 1;
		int spaceCount = 0;
		boolean inWord = false;

		try (FileReader reader = new FileReader("input.txt")) {
			while ((ch = reader.read()) != -1) {

				countCharacter++;

				if (ch == '\n') {
					lineCount++;
				}

				if (Character.isWhitespace(ch)) {
					inWord = false;
				} else {
					if (!inWord) {
						countWord++;
						inWord = true;
					}
				}
			}

			System.out.println("Number Of Characters: " + countCharacter);
			System.out.println("Number Of Words: " + countWord);
			System.out.println("Number Of Lines: " + lineCount);

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
