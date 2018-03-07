package com.company.javapractice;

import java.util.Arrays;

public class Horde {
    private Animal[] animals;
    private int hordeNumber;
    private int currentNumber;

    public Horde(int hordeNumber) {
        this.hordeNumber = hordeNumber;
        this.currentNumber = 0;
        animals = new Animal[hordeNumber];
    }

    public boolean acceptToHordeByPlaceOfLiving(Animal who) {
        if (animals[0] == null) {
            animals[0] = who;
            currentNumber++;
        } else if (who.getClass().getSuperclass() == animals[0].getClass().getSuperclass()) {
            if (currentNumber < hordeNumber) {
                animals[currentNumber] = who;
                currentNumber++;
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean acceptToHordeByEatingHabits(Animal who) {
        if (animals[0] == null) {
            animals[0] = who;
            currentNumber++;
        } else if (who.getClass().getInterfaces()[0] == animals.getClass().getInterfaces()[0]) {
            if (currentNumber < hordeNumber) {
                animals[currentNumber] = who;
                currentNumber++;
                return true;
            }
            return false;
        }
        return false;
    }


    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public int getHordeNumber() {
        return hordeNumber;
    }

    public void setHordeNumber(int hordeNumber) {
        this.hordeNumber = hordeNumber;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        this.currentNumber = currentNumber;
    }

    @Override
    public String toString() {
        String str = "The members of the horde: ";
        for (int i = 0; i < currentNumber; i++) {
            str += animals[i].toString();
        }
        return str;
    }
}
