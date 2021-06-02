package com.company.creatures;


public class Pet extends Animal{
    public Pet(String species, String name, Double weight) {
        super(species, name, weight);
    }

    @Override
    public boolean beEaten() {
        return false;
    }

    @Override
    public void feed(Double foodWeight) {
        if (weight > 0) {
            System.out.println("thx for food");
            this.weight += 1;
        }
        else System.out.println("Your pet is dead");

    }
}
