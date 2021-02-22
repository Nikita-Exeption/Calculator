package com.company;
import java.util.Scanner;

public class Main {


    public static void main (String[] args){

       Scanner read = new Scanner(System.in);

        double first;
        double second;
        String operator;

        System.out.print("> ");

        first = read.nextDouble();
        operator = read.next();
        second = read.nextDouble();

        if (operator.equals("*")){
            System.out.println("= " + (first * second));
        }
        if (operator.equals("/")){
            System.out.println("= " + (first / second));
        }
        if (operator.equals("+")){
            System.out.println("= " + (first + second));
        }
        if (operator.equals("-")){
            System.out.println("= " + (first - second));
        }
    }
}


