package com.company;
import java.time.LocalDateTime;

public class Human {
    String firstName;
    String lastName;
    Animal pet;
    Phone mobilePhone;
    Car car;
    private double salary;

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
}