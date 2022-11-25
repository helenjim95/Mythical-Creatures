package de.tum.in.ase;

public class Pigeon extends Animal {
    public Pigeon(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.printf("%s the %s eats!%n", this.getName(), this.getClass().getSimpleName());
    }
    public void fly() {
        System.out.printf("%s the %s flies!%n", this.getName(), this.getClass().getSimpleName());
    }

}
