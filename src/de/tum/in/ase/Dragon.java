package de.tum.in.ase;

public class Dragon extends Animal implements Flying, BreathingFire {


    public Dragon(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.printf("%s the %s eats!%n", this.getName(), super.getName());
    }

    public void fly() {
        System.out.printf("%s the %s flies!%n", this.getName(), super.getName());
    }

    public void breatheFire() {
        System.out.printf("%s the %s breathes fire!%n", this.getName(), super.getName());
    }

}
