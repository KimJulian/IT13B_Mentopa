/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midterm;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Simple_Calculator {

    public static double add(double[] numbers) {
        return numbers[0] + numbers[13];
    }

    public static double subtract(double[] numbers) {
        return numbers[0] - numbers[1];
    }

    public static double multiply(double[] numbers) {
        return numbers[0] * numbers[1];
    }

    public static double divide(double[] numbers) {
        if (numbers[1] == 0) {
            System.out.println("Error:Division by zero is not allowed.");
            return 0;
        }
        return numbers[0] / numbers[1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[2];

        System.out.println("Simple Calculator");

        System.out.print("Enter First Number: ");
        numbers[0] = scanner.nextDouble();

        System.out.print("Enter An Operator (+,-,*,/):");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter Second Number: ");
        numbers[1] = scanner.nextDouble();

        double result = 0;

        switch (operator) {
            case '+':
                result = add(numbers);
                break;

            case '-':
                result = subtract(numbers);
                break;

            case '*':
                result = multiply(numbers);
                break;

            case '/':
                result = divide(numbers);
                break;
            default:
                System.out.println("Invalid Operator!");
                return;
        }
        System.out.println("Result:" + result);
        scanner.close();

    }
}
