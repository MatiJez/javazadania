package com.company.devices;

import java.time.LocalDate;
import com.company.salleable;

public abstract class Device implements salleable {
    public String producer;
    public String model;
    public LocalDate yearOfProduction;

    public Device(String producer, String model, LocalDate yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void turnOn();

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}