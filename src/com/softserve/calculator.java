package com.softserve;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int a, b;

        System.out.print("Enter a = ");
        Scanner num1 = new Scanner(System.in);
        a = num1.nextInt();

        System.out.print("Enter b = ");
        Scanner num2 = new Scanner(System.in);
        b = num2.nextInt();

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
    }
}
