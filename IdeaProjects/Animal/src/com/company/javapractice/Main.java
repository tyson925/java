package com.company.javapractice;

public class Main {

    public static void main(String[] args) {

        Chicken peacock = new Chicken("Peacock");
        Chicken guinea = new Chicken("Guinea fowl");
        Chicken best = new Chicken("Best chicken");
        Chicken kfc = new Chicken("KFC chicken");
        Chicken slow = new Chicken("Slow cock");
        Animal[] animals = new Animal[]{peacock, guinea, best, kfc, slow};

    for (int i = 0; i < animals.length; i++) {
        System.out.println(animals[i].getClass());
        }

        System.out.println(peacock.makeSound());
    }
}

