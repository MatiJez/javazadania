package com.company;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human();
        me.firstName = "Mateusz";
        me.lastName = "Jezierski";
        me.pet = new Animal("Canis",15.0, "Grubas");
        System.out.println(me.pet);
        me.pet.feed();
        System.out.println(me.pet);
        me.pet.takeForAWalk();

        System.out.println(me.pet);

        Car car = new Car("Maluch", "Fiat", LocalDate.of(1980, 4, 15),"red", 5000.00);
        Car bmw = new Car("X5", "BMW", LocalDate.of(2020, 1, 3),"black",450000.00);
        Car bmw2 = new Car("X5", "BMW",LocalDate.of(2020, 1, 3),"black",450000.00);

        Phone huawei = new Phone("Huawei", "P10 Lite", LocalDate.of(2015, 2, 5),6.3, "Android");

        me.setSalary(13000.0);
        me.getSalary();

        me.setCar(car);
        System.out.println(me.getCar());

        System.out.println(car.equals(bmw));
        System.out.println(bmw.equals(bmw2));

        System.out.println(bmw);
        System.out.println(bmw2);
        System.out.println(huawei);

        bmw.turnOn();
        System.out.println(bmw);



        // Zad 8
        Animal cat = new Animal("Felis catus", 5.0, "Agata");
        Human seller = new Human();
        seller.firstName = "Karol";
        seller.lastName = "Sprzedaje";
        Human buyer = new Human();
        buyer.firstName = "Marek";
        buyer.lastName = "Kupuje";
        seller.pet = cat;
        buyer.cash = 305300.0;
        seller.cash = 9400.0;
        seller.setSalary(12000.00);
        seller.setSalary(5000.00);

        System.out.println(seller);
        System.out.println(buyer);
        // Sprzedaz kota
        cat.sell(seller, buyer, 400.0);

        System.out.println(seller);
        System.out.println(buyer);

        // Sprzedaz czlowieka
        seller.sell(seller, buyer, 50.0);

        // Sprzedaz samochodu bez posiadania
        car.sell(seller, buyer, 5000.0);

        System.out.println(seller);
        System.out.println(buyer);

        //Sprzedaz samochodu z posiadaniem
        seller.setCar(new Car("Maluch", "Fiat", LocalDate.of(1980, 4, 15),"red", 5000.00));

        System.out.println(seller);
        System.out.println(buyer);

        seller.getCar().sell(seller, buyer,2000.0);

        System.out.println(seller);
        System.out.println(buyer);
    }
}