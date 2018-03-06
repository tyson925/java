package com.company.javapractice;

public class CakeMain {
    public static void main(String[] args) {
        Cake strawberry = new Cake(12, "strawberry");
        Cake chocolate = new Cake(8, "chocolate");
        Cake champagne = new Cake(16, "champagne");

        Cake[] cakeArray = new Cake[3];
        cakeArray[0] = strawberry;
        cakeArray[1] = chocolate;
        cakeArray[2] = champagne;

        for (int i = 0; i < cakeArray.length; i++) {
            cakeArray[i].info();
        }
    }
}
