package com.company.devices;


public class Disel extends Car {

    public Disel(String model, String producer, int yearOfProduction, String color, Double value){
        super( model,  producer, yearOfProduction, color,  value);
    }

    public void refuel(double amount){
        System.out.println("Refueled: " + amount + " Disel");
    }
}
