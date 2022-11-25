package de.tum.in.ase;

public class Dragon extends Animal implements Flying, FireBreathing {


    public Dragon(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.printf("%s the %s eats!%n", this.getName(), this.getClass().getSimpleName());
    }

    public void fly() {
        System.out.printf("%s the %s flies!%n", this.getName(), this.getClass().getSimpleName());
    }

    public void breatheFire() {
        System.out.printf("%s the %s breathes fire!%n", this.getName(), this.getClass().getSimpleName());
    }

}
