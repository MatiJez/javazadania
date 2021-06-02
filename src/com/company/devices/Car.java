package com.company.devices;

import com.company.Human;
import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device {
    public String color;
    public Double value;
    private final List<String> ownersHistory;

    public Car(String model, String producer, int yearOfProduction, String color, Double value) {
        super(producer, model, yearOfProduction);
        this.color = color;
        this.value = value;
        this.ownersHistory = new ArrayList<>();
    }

    public abstract void refuel(double amount);

    public boolean equals(Car o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return o.model.equals( model) && o.producer.equals( producer) && o.color.equals( color) && o.value == value;
    }

    public void addOwner(Human owner){
        this.ownersHistory.add(owner.getFullName());
    }
    public List<String> getOwners(){
        return this.ownersHistory;
    }

    public String getCurrentOwner(){
        return this.ownersHistory.get(this.ownersHistory.size()-1);
    }

    public boolean wasCarSoldfromto(Human human1, Human human2){
        if(this.ownersHistory.size() <2) return false;
        for (int i=0;i<this.ownersHistory.size()-1;i++){
            if (this.ownersHistory.get(i).equals( human1.getFullName())
                    && this.ownersHistory.get(i+1).equals(human2.getFullName())){
                return true;
            }
        }
        return false;
    }
    public int getOwnerCount(){
        return this.ownersHistory.size();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", color=" + color + '\'' +
                ", value='" + value + '\'' +
                ", yearOfProduction='" + yearOfProduction +
                '}';
    }

    @Override
    public void turnOn(){
        System.out.println("Odpalenie samochodu");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.hasCar(this)){
            throw new Exception("Car not found");
        }
        if (!this.getCurrentOwner().equals(seller.getFullName())){
            throw new Exception("Seller not owner");
        }
        if (buyer.cash < price){
            throw new Exception("Not enough money");
        }
        if (seller == buyer){
            throw new Exception("cannot sell to yourself");
        }

        if (!buyer.hasFreeSpace()){
            throw new Exception("not enough space");
        }

        buyer.cash -=price;
        seller.cash += price;
        buyer.addCar(this);
        seller.removeCar(this);
        System.out.println("Sprzedales samochod za "+price);


    }
}
