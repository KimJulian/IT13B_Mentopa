/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Prelim;

import java.util.Scanner;


public class Lab_act1_Arithmetics {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        int result1 = (num1 / num2) + num3;
        int result2 = (num1 - num2) / num3;
        int result3 = (num1 + num2 + num3) / 3;
        int result4 = (num1 * num3) - (num2 * num2);

        System.out.println(num1 + " / " + num2 + " + " + num3 + " = " + result1);
        System.out.println("(" + num1 + " - " + num2 + ") / " + num3 + " = " + result2);
        System.out.println("(" + num1 + " + " + num2 + " + " + num3 + ") / 3 = " + result3);
        System.out.println("(" + num1 + " * " + num3 + ") - (" + num2 + " * " + num2 + ") = " + result4);

        scanner.close();
    }
}
    
    

