package com.company;

import java.io.File;

public class Animal {
    final public String species;
    private Double weight;
    protected String name;
    File pic;

    public Animal(String species, Double weight){
        this.species = species;
        this.weight = weight;
    }

    void feed(){
        if (weight > 0) {
            System.out.println("thx for food");
            this.weight += 1;
        }
        else System.out.println("Your pet is dead");
    }

    void takeForAWalk() {
        if (weight > 0) {
            System.out.println("thx for walk");
            this.weight--;
        }
        else System.out.println("Your pet is dead");
    }
    

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", pic=" + pic +
                '}';
    }
}