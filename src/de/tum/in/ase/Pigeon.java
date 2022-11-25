package de.tum.in.ase;

public class Pigeon extends Animal {
    public Pigeon(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.printf("%s the %s eats!%n", this.getName(), super.getName());
    }
    public void fly() {
        System.out.printf("%s the %s flies!%n", this.getName(), super.getName());
    }
}
