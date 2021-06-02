package com.company;
import java.time.LocalDateTime;

import java.util.Arrays;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Human {
    public String firstName;
    public String lastName;
    public Pet pet;
    public Phone mobilePhone;
    private double salary;
    public Double cash;
    private Car[] garage;
    private int garageCount;

    public  Human(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.garageCount = 1;
        this.garage = new Car[1];
    }

    public  Human(String firstName,String lastName,Pet pet,Phone phone,int garageCount, Double cash){
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = cash;
        this.pet = pet;
        this.mobilePhone = phone;
        this.garageCount = garageCount;
        this.garage = new Car[garageCount];
    }

    public void setGarageCount(int garageCount){
        this.garageCount = garageCount;
        this.garage = Arrays.copyOf(this.garage, garageCount);
    }

    public int getGarageCount(){
        return this.garageCount;
    }

    public double getSalary(){
        LocalDateTime time = LocalDateTime.now();
        System.out.println("Data: " + time  + ", Pensja: " + this.salary);
        return this.salary;
    }

    public void setSalary(double salary) throws Exception{
        if (salary <= 0) throw new Exception();
        System.out.println("Nowe dane zostały wysłane do systemu księgowego");
        System.out.println("Musisz debrac aneks do umowy od pani Hani z kadr");
        System.out.println("ZUS i US juz wiedza o zmianie wypłaty i nie ma sensu ukrywać dochodu");
        this.salary = salary;
    }

    public Car getCar(int id) {
        if (id < this.garageCount)
            return garage[id];
        else
            return null;
    }

    public void setCar(Car car,int id) {
        if (id < this.garageCount) {
            if (car == null) {
                System.out.println("Usunięto samochod");
                this.garage[id] = car;
                return;
            }
            double salary = getSalary();
            car.addOwner(this);
            if (salary > car.value) {
                System.out.println("Udało się kupić za gotówkę");
                this.garage[id] = car;
                return;
            }
            if (salary > (car.value / 12)) {
                System.out.println("Udało się kupić na kredyt");
                this.garage[id] = car;
                return;
            }
            System.out.println("Nie ma takiego miejsca w garażu");
        }
    }

    public void sortCars () {
        boolean change;
        do {
            change = false;
            for (int a = 0; a < this.garage.length - 1; a++) {
                if (this.garage[a].yearOfProduction > this.garage[a + 1].yearOfProduction) {
                    Car temp = this.garage[a + 1];
                    this.garage[a + 1] = this.garage[a];
                    this.garage[a] = temp;
                    change = true;
                }
            }
        } while (change);


    }

    public void addCar (Car newCar){
        newCar.addOwner(this);
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = newCar;
                return;
            }
        }
    }

    public void removeCar (Car carToRemove){
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == carToRemove) {
                this.garage[i] = null;
                return;
            }
        }
    }

    public boolean hasFreeSpace () {
        for (Car car : this.garage) {
            if (car == null) {
                return true;
            }
        }
        return false;
    }

    public boolean hasCar (Car car){
        for (Car value : this.garage) {
            if (value == car) {
                return true;
            }
        }
        return false;
    }


    public void printCars(){
        System.out.println(this.firstName + " " + this.lastName + "---");
        for (Car car : this.garage) System.out.println("    " + car);
    }

    public String getFullName(){
        return this.firstName+" "+lastName;
    }


    public void sell(Human seller, Human buyer, Double price){
        System.out.println("Handel ludzmi jest niemozliwy!");
    }


}