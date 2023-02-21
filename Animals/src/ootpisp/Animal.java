package ootpisp;

public class Animal {
    private int age;
    private final int numberOfLegs;

    public Animal(int age, int numberOfLegs) {
        this.age = age;
        this.numberOfLegs = numberOfLegs;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void sleep() {
        System.out.println("An animal is sleeping");
    }

    public int getAge() {
        return age;
    }
}
