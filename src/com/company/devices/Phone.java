package com.company.devices;

import java.time.LocalDate;
import com.company.Human;

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

    @Override
    public void sell(Human seller, Human buyer, Double price){
        if (seller.mobilePhone != this){
            System.out.println("Nie możesz sprzedawać kradzionych telefonów!");
            return;
        }
        else if (buyer.cash < price){
            System.out.println("Kupujący nie ma tylu pieniedzy!");
            return;
        }
        else if (seller == buyer){
            System.out.println("Nie możesz sprzedawać sam sobie");
            return;
        }
        buyer.cash -=price;
        seller.cash += price;
        buyer.mobilePhone = seller.mobilePhone;
        seller.mobilePhone = null;
        System.out.println("Udało Ci się sprzedać telefon za " +price);


    }
}