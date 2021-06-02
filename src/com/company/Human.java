package com.company;
import java.time.LocalDateTime;

import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Human {
    public String firstName;
    public String lastName;
    public Pet pet;
    public Phone mobilePhone;
    private Car car;
    private double salary;
    public Double cash;

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

    public Car getCar(){
        return car;
    }

    public void setCar(Car car) {
        if (car == null) {
            System.out.println("Usunięto samochod");
            this.car = null;
            return;
        }
        if (salary > car.value){
            System.out.println("Udało się kupić za gotówkę");
            this.car = car;
        }
        else if (salary > (car.value/12)){
            System.out.println("Udało się kupić na kredyt");
            this.car = car;
        }
        else System.out.println("zapisz się na studia i znajdź nową robotę albo idź popodwyżkę");
    }

    public void sell(Human seller, Human buyer, Double price){
        System.out.println("Handel ludzmi jest niemozliwy!");
    }


    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pet=" + pet +
                ", phone=" + mobilePhone +
                ", salary=" + salary +
                ", cash=" + cash +
                ", car=" + car +
                '}';
    }
}