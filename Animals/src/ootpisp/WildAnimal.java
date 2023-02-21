package ootpisp;

public class WildAnimal extends Animal {
    public WildAnimal(int age, int numOfLegs) {
        super(age, numOfLegs);
    }

    public void hunting() {
        System.out.println("Wild animal is hunting");
    }
}
