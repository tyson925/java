package com.company.javapractice;

public class BirthdayCake extends Cake {
    private int numberOfCandles;

    public BirthdayCake(int slice, String taste, int numberOfCandles) {
        super(slice, taste);
        this.numberOfCandles = numberOfCandles;
    }

    @Override
    public String toString() {
        return "BirthdayCake{" +
                "numberOfCandles=" + numberOfCandles +
                '}';
    }
}
