package com.company.devices;

public class Application {
    public final String name;
    public final String version;
    public final int price;

    public Application(String name,String version, int price){
        this.version = version;
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name +" "+this.price;
    }
}
