package de.tum.in.ase;

public class Cacus extends Animal implements FireBreathing {
    public Cacus(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.printf("%s the %s eats!%n", this.getName(), this.getClass().getSimpleName());
    }
    public void breatheFire() {
        System.out.printf("%s the %s breathes fire!%n", this.getName(), this.getClass().getSimpleName());
    }
}
