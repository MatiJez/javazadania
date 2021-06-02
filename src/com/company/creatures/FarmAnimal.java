package com.company.creatures;


public class FarmAnimal extends Animal{
    public FarmAnimal (String species, String name, Double weight){
        super(species, name ,weight);
    }



    @Override
    public boolean beEaten() {
        return true;
    }


    public void feed(Double foodWeight) {
        if (weight > 0) {
            System.out.println("thx for food");
            this.weight += 1;
        }
        else System.out.println("Your pet is dead");
    }

    @Override
    public void feed(double foodWeight) {
        System.out.println("thx for food");
        this.weight += foodWeight;
    }
}
