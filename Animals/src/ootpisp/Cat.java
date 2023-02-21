package ootpisp;

import java.util.ArrayList;

public class Cat extends DomesticAnimal {
    private static int NUMS_LEGS_CAT = 4;

    public Cat(String name, int age) {
        super(name, age, NUMS_LEGS_CAT);
    }

    public ArrayList<CatToys> toys = new ArrayList<>();

    public void meow() {
        System.out.println("A cat meows!");
    }

    public void prance() {
        System.out.println("A cat is prancing!");
    }
}
