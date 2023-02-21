package ootpisp;

public class DomesticAnimal extends Animal {
    private String name;

    public DomesticAnimal(String name, int age, int numOfLegs) {
        super(age, numOfLegs);
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " Domestic animal is eating");
    }

    public String getName() {
        return name;
    }

}

