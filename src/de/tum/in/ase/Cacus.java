package de.tum.in.ase;

public class Cacus extends Animal implements FireBreathing {
    public Cacus(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.printf("%s the %s eats!%n", this.getName(), super.getName());
    }
    public void breatheFire() {
        System.out.printf("%s the %s breathes fire!%n", this.getName(), super.getName());
    }
}
