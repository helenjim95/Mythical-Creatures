package de.tum.in.ase;

public class Penguin extends Animal {
    public Penguin(String name) {
        super(name);
    }

//    Question: how to access superclass name attribute
    @Override
    public void eat() {
        System.out.printf("%s the %s eats!%n", this.getName(), this.getClass().getSimpleName());
    }
}
