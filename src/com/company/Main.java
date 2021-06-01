package com.company;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human();
        me.firstName = "Mateusz";
        me.lastName = "Jezierski";
        me.pet = new Animal("Canis",15.0);
        System.out.println(me.pet);
        me.pet.feed();
        me.pet.feed();
        System.out.println(me.pet);
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        System.out.println(me.pet);

        Car car = new Car("Maluch", "Fiat", "red", 5000.00);
        Car bmw = new Car("X5", "BMW","black",450000.00);
        Car bmw2 = new Car("X5", "BMW","black",450000.00);

        Phone phone = new Phone("Huawei", "P10 Lite", 6.3, "Android");

        me.setSalary(13000.0);
        me.getSalary();

        me.setCar(car);
        System.out.println(me.getCar());

        System.out.println(car.equals(bmw));
        System.out.println(bmw.equals(bmw2));

        System.out.println(bmw);
        System.out.println(bmw2);
        System.out.println(phone);
    }
}