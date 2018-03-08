/*
1. Készíts programot, ami ha megadunk két nem negatív számot parancsori paraméterként, akkor a kisebbik négyzetgyökét kiírja a képernyőre!
2. Készíts programot, amely bekér két számot és kiírja, hogy melyik a nagyobb illetve ha egyenlők, akkor azt.
3. Készíts programot, amely 1-től 10-ig kiírja egymásmellé, vesszővel elválasztva a számok négyzetét!
 */

package com.company.javapractice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Number of searches: " + search("ojnaenfonfownefonwefwrgpijj", 'o'));
        stringPract();
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
        double[] oneToTen = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] oneToTenSquare = new double[10];
        for (int i = 0; i < oneToTen.length; i++) {
            oneToTenSquare[i] = Math.pow(oneToTen[i], 2);
        }
        for (int i = 0; i < oneToTen.length; i++) {
            System.out.print(oneToTenSquare[i] + ", ");
        }
    }


    // String - Java String:
    public static void stringPract() {
        String s1 = "Welcome";
        String s2 = "Welcome";
        String s3 = new String("Welcome");

        boolean compare1 = (s1 == s2);
        System.out.println(compare1);
        boolean compare2 = (s1 == s3);
        System.out.println(compare2);
        s1 = "Hello";
        compare1 = (s1 == s2);
        System.out.println(compare1);

        String s4 = new String("Laszlo");
        String s5 = new String("Balint");
        s4.concat(s5);
        System.out.println(s4);
        s4 = s4.concat(s5);
        System.out.println(s4);

        String s6 = new String("Patika");
        String s7 = new String("Fatima");
        String s8 = new String("Kakika");
        System.out.println(s6.compareTo(s7));
        System.out.println(s6.compareTo(s8));
        System.out.println(s7.compareTo(s8));

        String s9 = 50 + 30 + "Balint" + 40 + 40;
        System.out.println(s9);

        System.out.println(s8.charAt(2));
        System.out.println(Character.isUpperCase(s7.charAt(0)));
        System.out.println(Character.isUpperCase(s7.charAt(s7.length() - 1)));

        String split = new String("This is an awful practice.");
        char[] ch = new char[20];
        split.getChars(8, split.length(), ch, 2);
        System.out.println(ch);

        String str = new String("hello javatpoint how r u");
        int index = str.indexOf('j');
        str.getChars(index, index + 10, ch, 0);
        System.out.println(ch);

        String java = new String("Jesus was not a jealous holy spirit.");
        int indexJ = 0;
        int num = 0;
        System.out.println(java.indexOf('j', indexJ));
        while (java.indexOf('j', indexJ) != -1) {
            indexJ = java.indexOf('j', indexJ) + 1;
            System.out.println(indexJ);
        }
    }

    public static Integer search(String string, Character character) {
        int index = 0;
        int counter = 0;
        while (string.indexOf(character, index) != -1) {
            index = string.indexOf(character, index) + 1;
            counter++;
        }
        return counter;
    }
}

