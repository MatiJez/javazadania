package com.company.devices;

import java.time.LocalDate;

public class Electric extends Car {

    public Electric(String model, String producer, LocalDate yearOfProduction, String color, Double value){
        super( model,  producer, yearOfProduction, color,  value);
    }

    public void refuel(double amount){
        System.out.println("Refueled: " + amount + " Watt");
    }
}
