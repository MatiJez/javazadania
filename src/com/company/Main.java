package com.company;

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


        me.setSalary(13000.0);
        me.getSalary();

        me.setCar(car);
        System.out.println(me.getCar());
    }
}