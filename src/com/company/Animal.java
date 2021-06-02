package com.company;

import java.io.File;

public class Animal implements salleable {
    final public String species;
    private Double weight;
    public String name;
    File pic;

    public Animal(String species, Double weight, String name){
        this.species = species;
        this.weight = weight;
        this.name = name;
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

    @Override
    public void sell(Human seller, Human buyer, Double price){
        if (seller.pet != this){
            System.out.println("Nie można sparzedawć kradzionego zwierzecia");
            return;
        }
        if (buyer.cash < price){
            System.out.println("Kupujący nie ma tyle pieniedzy");
            return;
        }
        if (seller == buyer){
            System.out.println("Nie możesz sprzedawac samemu sobie");
            return;
        }
        buyer.cash -=price;
        seller.cash += price;
        buyer.pet = seller.pet;
        seller.pet = null;
        System.out.println("Sprzedales zwierze za " +price);


    }
}