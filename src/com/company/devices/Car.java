package com.company.devices;

import com.company.Human;

public abstract class Car extends Device {
    public String color;
    public Double value;

    public Car(String model, String producer, int yearOfProduction, String color, Double value) {
        super(producer, model, yearOfProduction);
        this.color = color;
        this.value = value;
    }

    public abstract void refuel(double amount);

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
        if (buyer.cash < price){
            System.out.println("Kupujący nie ma tyle pieniedzy!");
            throw new Exception("Not enough money");
        }
        if (seller == buyer){
            System.out.println("ERROR: nie możesz sprzedawać samemu sobie");
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
