package ootpisp;

public class Animal {
    private int age;
    private final int numberOfLegs;

    public Animal(int age, int numberOfLegs) {
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        System.out.println("An animal has been created!");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getNumberOfLegs() {
        System.out.println(numberOfLegs);
    }

    public void sleep() {
        System.out.println("An animal is sleeping");
    }

    public int getAge() {
        return age;
    }
}