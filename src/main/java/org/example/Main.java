package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        options();
    }

    public static void options(){
        var scan = new Scanner(System.in);
        double num1;
        double num2;
        double res;
        while(true){
            System.out.println();
            System.out.println("Which operation would you like to perform?");
            System.out.println("Type '+' for addition \n'-' for subtraction \n'*' for multiplication " +
                    "\n'/' for division \nand 'e' for exit program");
            String operation = scan.next();
            switch (operation) {
                case "+":
                    System.out.println("Enter first number: ");
                    num1 = num();
                    System.out.println("Enter second number: ");
                    num2 = num();
                    res = addition(num1, num2);
                    System.out.println(num1 + " + " + num2 + " = " + res);
                    break;
                case "-":
                    System.out.println("Enter first number: ");
                    num1 = num();
                    System.out.println("Enter second number: ");
                    num2 = num();
                    res = subtraction(num1, num2);
                    System.out.println(num1 + " - " + num2 + " = " + res);
                    break;
                case "*":
                    System.out.println("Enter first number: ");
                    num1 = num();
                    System.out.println("Enter second number: ");
                    num2 = num();
                    res = multiplication(num1, num2);
                    System.out.println(num1 + " * " + num2 + " = " + res);
                    break;
                case "/":
                    System.out.println("Enter first number: ");
                    num1 = num();
                    System.out.println("Enter second number: ");
                    num2 = num();
                    res = division(num1, num2);
                    System.out.println(num1 + " / " + num2 + " = " + res);
                    break;
                case "e":
                    System.out.println("Closing program");
                    System.exit(0);
                default:
                    System.out.println("No such option, choose again.");
            }
        }
    }
    public static double num(){
        var scan = new Scanner(System.in);
        double num = 0;
        try{
            num = scan.nextDouble();
        }
        catch(Exception e){
            System.out.println("Not a valid number, closing.");
            System.exit(0);
        }
        return num;
    }
    public static double division(double num1, double num2){
        return num1 / num2;
    }

    public static double multiplication(double num1, double num2){
        return num1 * num2;
    }

    public static double subtraction(double num1, double num2){
        return num1 - num2;
    }

    public static double addition(double num1, double num2){
        return  num1 + num2;
    }

}