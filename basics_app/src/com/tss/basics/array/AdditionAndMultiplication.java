package com.tss.basics.array;

import java.util.Scanner;

public class AdditionAndMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int matrix_1[][] = new int[3][3];
		int matrix_2[][] = new int[3][3];

		System.out.println("Enter the Element of Matrix_1: ");
		readMatrix(matrix_1, scanner);

		System.out.println("Enter the Element of Matrix_2: ");
		readMatrix(matrix_2, scanner);

		int sum[][] = addition(matrix_1, matrix_2);
		System.out.println("Addition");
		printMatrix(sum);

		int multiplication[][] = multiplication(matrix_1, matrix_2);
		System.out.println("Multiplication");
		printMatrix(multiplication);

	}

	private static void printMatrix(int[][] result_matrix) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(result_matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static void readMatrix(int[][] matrix, Scanner scanner) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

	}

	private static int[][] multiplication(int[][] matrix_1, int[][] matrix_2) {
		// TODO Auto-generated method stub
		int result_matrix[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					result_matrix[i][j] += matrix_1[i][k] * matrix_2[k][j];
				}
			}
		}
		return result_matrix;

	}

	private static int[][] addition(int[][] matrix_1, int[][] matrix_2) {
		int result_matrix[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				result_matrix[i][j] = matrix_1[i][j] + matrix_2[i][j];
			}
		}
		return result_matrix;
	}
}
