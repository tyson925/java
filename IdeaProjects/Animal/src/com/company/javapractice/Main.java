package com.company.javapractice;

public class Main {

    public static void main(String[] args) {

        Chicken peacock = new Chicken("Peacock");
        Chicken guinea = new Chicken("Guinea fowl");
        Chicken best = new Chicken("Best chicken");
        Chicken kfc = new Chicken("KFC chicken");
        Chicken slow = new Chicken("Slow cock");

        Tiger siberian = new Tiger("Siberian tiger");
        Whale blue = new Whale("Blue whale");
        Giraffe masai = new Giraffe("Masai giraffe");

        Animal[] animals = new Animal[]{peacock, guinea, best, kfc, slow, siberian, blue, masai};

        TerrestrialAnimal[] terrestrial = new TerrestrialAnimal[]{siberian, masai};
        AquaticAnimal[] aquatic = new AquaticAnimal[]{blue};

        Herbivorous[] herbivorous = new Herbivorous[]{masai};
        Predator[] predator = new Predator[]{siberian, blue};

        Horde gangEat = new Horde(10);
        Horde gangPlace = new Horde(10);

    for (int i = 0; i < animals.length; i++) {
        System.out.println(animals[i].getClass());
        }

        System.out.println(peacock.makeSound());
        System.out.println(siberian.makeSound());
        System.out.println(blue.makeSound());
        System.out.println(masai.makeSound());

        gangEat.acceptToHordeByEatingHabits(siberian);
        gangEat.acceptToHordeByEatingHabits(blue);
        gangEat.acceptToHordeByEatingHabits(masai);
        System.out.println(gangEat);

        gangPlace.acceptToHordeByPlaceOfLiving(siberian);
        gangPlace.acceptToHordeByPlaceOfLiving(blue);
        gangPlace.acceptToHordeByPlaceOfLiving(masai);
        System.out.println(gangPlace);
    }
}

