package com.company.javapractice;

public class Cake {
    protected int slice;
    private String taste;

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public Cake(int slice, String taste) {
        this.slice = slice;
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "slice=" + slice +
                ", taste='" + taste + '\'' +
                '}';
    }

    public void info() {
        System.out.println("This cake tastes " + this.taste + ", and has " + this.slice + " slices.");
    }
}
