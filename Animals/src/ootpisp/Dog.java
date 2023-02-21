package ootpisp;

public class Dog extends DomesticAnimal {
    private static int NUM_LEGS_DOG = 4;

    public Dog(String name, int age) {
        super(name, age, NUM_LEGS_DOG);
    }

    public void bark() {
        System.out.println("The dog barks.");
    }

    public void run() {
        System.out.println("The dog is running.");
    }
}
