package com.company;
import com.company.creatures.Animal;
import com.company.devices.*;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.devices.Electric;
import com.company.devices.LPG;
import com.company.devices.Phone;
import com.company.devices.Disel;


public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human("Mateusz", "Jezierski");
        me.pet = new Pet("Canis","Grubas", 15.0);
        Animal cat = new Pet("Canis","Ulaniec", 25.0);
        Animal chicken = new FarmAnimal("Kurczakowy","KFC", 54.00);

        System.out.println(me.pet);

        Car car = new LPG("Maluch", "Fiat", 1980,"red", 5000.00);
        Car bmw = new Electric("X5", "BMW", 2020,"black",450000.00);
        Car bmw2 = new Disel("X5", "BMW",2019,"black",450000.00);

        Phone huawei = new Phone("Huawei", "P10 Lite", 2015,6.3, "Android");


        huawei.installAnApp("minecraft");
        huawei.installAnApp("Skype", "12.5");
        huawei.installAnApp("fortnite", "5.321","Fortnite.pl","https");

        bmw.refuel(23.5);
        car.refuel(5.0);
        bmw2.refuel(13.2);

        me.setGarageCount(4);
        me.printCars();
        me.garage[0] = bmw2;
        me.garage[1] = car;
        me.printCars();



    }
}