package de.tum.in.ase;

public class Penguin extends Animal {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.printf("%s the %s eats!%n", this.getName(), super.getName());
    }
}
