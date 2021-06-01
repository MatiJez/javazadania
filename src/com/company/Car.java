package com.company;

public class Car {
    public final String model;
    public final String producer;
    public String color;

    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", color=" + color +
                '}';
    }
}