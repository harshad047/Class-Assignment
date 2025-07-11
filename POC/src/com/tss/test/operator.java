package com.tss.test;

public class operator {

    public static void main(String[] args) {
        // Unary Operators
        int a = +5; // unary plus
        System.out.println("Unary plus: " + a);
        System.out.println("Unary minus: " + (-a)); // unary minus
        a++; // increment
        System.out.println("Increment: " + a);
        a--; // decrement
        System.out.println("Decrement: " + a);
        boolean istrue = true;
        System.out.println("Logical NOT: " + !istrue); // logical not

        // Binary Operators
        int num1 = 5; // Assignment Operator
        int num2 = 10; // Assignment Operator

        // Arithmetic Operators
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));

        // Relational Operators
        System.out.println("Equal to: " + (num1 == num2));
        System.out.println("Not equal to: " + (num1 != num2));
        System.out.println("Greater than: " + (num1 > num2));
        System.out.println("Less than: " + (num1 < num2));
        System.out.println("Greater than or equal to: " + (num1 >= num2));
        System.out.println("Less than or equal to: " + (num1 <= num2));

        // Logical Operators
        boolean condition1 = true;
        boolean condition2 = false;
        System.out.println("Logical AND: " + (condition1 && condition2));
        System.out.println("Logical OR: " + (condition1 || condition2));

        // Bitwise Operators
        int x = 5;  // binary: 0101
        int y = 3;  // binary: 0011
        System.out.println("Bitwise AND: " + (x & y)); // 1
        System.out.println("Bitwise OR: " + (x | y));  // 7
        System.out.println("Bitwise XOR: " + (x ^ y)); // 6
        System.out.println("Bitwise Complement: " + (~x)); // -6
        System.out.println("Left shift: " + (x << 1)); // 10
        System.out.println("Right shift: " + (x >> 1)); // 2

        // Ternary Operator
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("Ternar	y Operator (max): " + max);
    }
}
