package com.company.javapractice;

public class Mixed extends Drink {

    public Mixed(String name, Drink drink1, Drink drink2) {
        super(name, (drink1.getPrice() + drink2.getPrice()) / 2, (drink1.getAlcoholCont() + drink2.getAlcoholCont()) / 2);
    }

    public Mixed(String name, Drink drink1, Drink drink2, Drink drink3) {
        super(name, (drink1.getPrice() + drink2.getPrice() + drink3.getPrice()) / 3, (drink1.getAlcoholCont() + drink2.getAlcoholCont() + drink3.getAlcoholCont()) / 3);
    }

    public Mixed(String name, Drink drink1, Drink drink2, Drink drink3, Drink drink4) {
        super(name, (drink1.getPrice() + drink2.getPrice() + drink3.getPrice() + drink4.getPrice()) / 4, (drink1.getAlcoholCont() + drink2.getAlcoholCont() + drink3.getAlcoholCont() + drink4.getAlcoholCont()) / 4);
    }
}
