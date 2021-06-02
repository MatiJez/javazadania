package com.company.devices;

import java.time.LocalDate;

public class Phone extends Device {
    final Double screenSize;
    final String operatingSystem;

    public Phone(String producer, String model, LocalDate yearOfProduction, Double screenSize, String operatingSystem) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize + '\'' +
                ", operatingSystem=" + operatingSystem + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public void turnOn(){
        System.out.println("Włączenie telefonu");
    }
}