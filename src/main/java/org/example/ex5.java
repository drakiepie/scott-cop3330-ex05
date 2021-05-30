package org.example;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("What is the first number? ");
        double first = input.nextDouble();
        System.out.print("What is the second number? ");
        double second = input.nextDouble();

        double addAns = first + second;
        double subAns = first - second;
        double mulAns = first * second;
        double divAns = first / second;

        System.out.println(first + " + " + second + " = " + addAns + "\n" +
                first + " - " + second + " = " + subAns + "\n" +
                first + " * " + second + " = " + mulAns + "\n" +
                first + " / " + second + " = " + divAns);
    }
}
