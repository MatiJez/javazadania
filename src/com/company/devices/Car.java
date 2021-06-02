package com.company.devices;

import java.time.LocalDate;
import com.company.Human;

public abstract class Car extends Device {
    public String color;
    public Double value;

    public Car(String model, String producer, LocalDate yearOfProduction, String color, Double value) {
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
    public void sell(Human seller, Human buyer, Double price){
        if (seller.getCar() != this){
            System.out.println("Nie możesz sprzedać kradzionego samochodu");
            return;
        }
        if (buyer.cash < price){
            System.out.println("Kupujący nie ma tyle pieniedzy!");
            return;
        }
        if (seller == buyer){
            System.out.println("ERROR: nie możesz sprzedawać samemu sobie");
            return;
        }
        buyer.cash -=price;
        seller.cash += price;
        buyer.setCar(seller.getCar());
        seller.setCar(null);
        System.out.println("Sprzedales samochod za "+price);


    }
}
