package com.company;
import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human();
        me.firstName = "Mateusz";
        me.lastName = "Jezierski";
        me.pet = new Pet("Canis","Grubas", 15.0);
        Animal cat = new Pet("Canis","Ulaniec", 25.0);
        Animal chicken = new FarmAnimal("Kurczakowy","KFC", 54.00);

        System.out.println(me.pet);

        Car car = new Car("Maluch", "Fiat", LocalDate.of(1980, 4, 15),"red", 5000.00);
        Car bmw = new Car("X5", "BMW", LocalDate.of(2020, 1, 3),"black",450000.00);
        Car bmw2 = new Car("X5", "BMW",LocalDate.of(2020, 1, 3),"black",450000.00);

        Phone huawei = new Phone("Huawei", "P10 Lite", LocalDate.of(2015, 2, 5),6.3, "Android");

        cat.feed();
        cat.feed();
        chicken.feed(3.0);
        cat.feed(1.0);
        System.out.println(cat);
        System.out.println(chicken);
        cat.takeForAWalk();
        chicken.takeForAWalk();

        System.out.println(cat);
        System.out.println(chicken);
        System.out.println(chicken.beEaten());


    }
}