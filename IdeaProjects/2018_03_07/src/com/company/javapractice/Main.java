/*
1. Készíts programot, ami ha megadunk két nem negatív számot parancsori paraméterként, akkor a kisebbik négyzetgyökét kiírja a képernyőre!
2. Készíts programot, amely bekér két számot és kiírja, hogy melyik a nagyobb illetve ha egyenlők, akkor azt.
3. Készíts programot, amely 1-től 10-ig kiírja egymásmellé, vesszővel elválasztva a számok négyzetét!
 */

package com.company.javapractice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        smallerSquareRoot(args);
        compareNums();
        squareTen();
    }

    public static void smallerSquareRoot(String[] args) {
        double arg1 = Double.parseDouble(args[0]);
        double arg2 = Double.parseDouble(args[1]);
        if (arg1 > arg2) {
            System.out.println("Square root of " + arg2 + " is equal to " + Math.sqrt(arg2));
        } else {
            System.out.println("Square root of " + arg1 + " is equal to " + Math.sqrt(arg1));
        }
    }

    public static void compareNums() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the second number: ");
        int num2 = sc2.nextInt();
        if (num1 > num2) {
            System.out.println("The first number is bigger!");
        } else if (num1 < num2) {
            System.out.println("The second number is bigger!");
        } else {
            System.out.println("The two numbers are equal!");
        }
    }

    public static void squareTen() {
        double[] oneToTen = new double[]{1,2,3,4,5,6,7,8,9,10};
        double[] oneToTenSquare = new double[10];
        for (int i = 0; i < oneToTen.length; i++) {
            oneToTenSquare[i] = Math.pow(oneToTen[i], 2);
        }
        for (int i = 0; i < oneToTen.length; i++) {
            System.out.print(oneToTenSquare[i] + ", ");
        }
    }
}

