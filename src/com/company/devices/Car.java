package com.company.devices;

import java.time.LocalDate;

public class Car extends Device {
    public String color;
    public Double value;

    public Car(String model, String producer, LocalDate yearOfProduction, String color, Double value) {
        super(producer, model, yearOfProduction);
        this.color = color;
        this.value = value;
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
}