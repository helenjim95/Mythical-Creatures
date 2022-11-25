package de.tum.in.ase;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void eat();

    public static void main(String[] args) {
        //TODO: Test your code here
        Dragon draco = new Dragon("draco");
        Penguin pengu = new Penguin("pengu");
        Pigeon birdy = new Pigeon("birdy");
        pengu.eat();
        birdy.fly();
        draco.breatheFire();
//        pengu the Penguin eats!
//birdy the Pigeon flies!
//draco the Dragon breathes fire!

    }
}
