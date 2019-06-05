package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = firstNum();

        int b = secondNum();

        System.out.println("Enter operator(+, -, * or /): ");
        String o = scanner.nextLine();

        System.out.print("The result is: ");

        switch (o){
            case "+":
                int sum = a + b;
                System.out.println(sum);
                break;

            case "-":
                int sum1 = a - b;
                System.out.println(sum1);
                break;

            case "*":
                int sum2 = a * b;
                System.out.println(sum2);
                break;

            case "/":
                double sum3 = (double)a / (double) b;
                if (b == 0) {
                    System.out.println("Can't divide with zero.");
                } else {
                    System.out.println(Math.round(sum3));
                }
                break;

            default:
                System.out.println("Invalid input.");
        }



    }

    private static int firstNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = 0;
        try {
            a = scanner.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("Invalid input. Try again. Enter first number: ");
            scanner.nextLine();
            try {
                a = scanner.nextInt();
            } catch (InputMismatchException exception2) {
                System.out.println("Invalid input again. Closing program. ");
                System.exit(0);
            }
        }
        return a;
    }

    private static int secondNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter second number: ");
        int b = 0;
        try {
            b = scanner.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("Invalid input. Try again. Enter second number: ");
            scanner.nextLine();
            try {
                b = scanner.nextInt();
            } catch (InputMismatchException exception2) {
                System.out.println("Invalid input again. Closing program.");
                System.exit(0);
            }
        }

        return b;


    }
}
