package com.company.devices;

import java.time.LocalDate;
import com.company.Human;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device {
    final Double screenSize;
    final String operatingSystem;

    static final String DEFAULT_PROTOCOL = "https";
    static final String DEFAULT_HOST = "google.com";
    static final String DEFAULT_APP_VERSION = "stable";


    public Phone(String producer, String model, LocalDate yearOfProduction, Double screenSize, String operatingSystem) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }

    public void installAnApp(URL appURL) {
        System.out.println("InstalledApp("+appURL.getFile()+")");
    }

    public void installAnApp(List<String> appNames) {
        for (String appName : appNames){
            this.installAnApp(appName);
        }
    }

    public void installAnApp(String appName){
        this.installAnApp(appName,DEFAULT_APP_VERSION,DEFAULT_HOST,DEFAULT_PROTOCOL);
    }

    public void installAnApp(String appName,String version){
        this.installAnApp(appName,version,DEFAULT_HOST,DEFAULT_PROTOCOL);
    }

    public void installAnApp(String appName,String version,String host,String protocol){
        try {
            URL url = new URL(protocol,host,appName+" "+version);
            this.installAnApp(url);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
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