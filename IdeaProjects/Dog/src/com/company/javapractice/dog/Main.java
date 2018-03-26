package com.company.javapractice.dog;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Dog gd = new Dog("green", "Dingo");
        Dog pd = new Dog("pink", "Frakk");
        Dog wd = new Dog("white", "Buksi");
        Dog rd = new Dog("pink", "Frakk");
        Set <Dog> dogs = new HashSet <>();
        HashMap<Dog, Integer> dogMap = new HashMap <>();

        dogMap.put(gd, 5);
        dogMap.put(pd, 6);
        dogMap.put(wd, 7);
        dogMap.put(rd, 8);
        System.out.println(pd.equals(rd));
        System.out.println(dogs.contains(new Dog("pink", "Pincsi")));
        System.out.println(dogMap.containsKey(new Dog("pink", "Frakk")));

        Dog newDog = new Dog("pink", "Pointy");
        dogs.add(newDog);
        newDog.setColor("green");
        System.out.println(dogs.contains(newDog));
        System.out.println(wd.getColor().hashCode());
    }

    public static class Dog {
        private String color;
        private String name;

        public Dog(String color, String name) {
            this.color = color;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Dog dog = (Dog) o;

            if (color != null ? !color.equals(dog.color) : dog.color != null) return false;
            return name != null ? name.equals(dog.name) : dog.name == null;
        }

        @Override
        public int hashCode() {
            int result = color != null ? color.hashCode() : 0;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "The dog's " +
                    "color is" + color +
                    '.';
        }
    }
}
