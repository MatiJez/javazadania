package com.company.devices;
import com.company.Human;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.*;

public class Phone extends Device {
    final Double screenSize;
    final String operatingSystem;
    public HashSet<Application> applications;
    public Human owner;

    static final String DEFAULT_PROTOCOL = "https";
    static final String DEFAULT_HOST = "google.com";
    static final String DEFAULT_APP_VERSION = "stable";


    public Phone(String producer, String model, int yearOfProduction, Double screenSize, String operatingSystem) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
        this.applications = new HashSet<>();
        this.owner = null;
    }

    public void printAllInstalledApps(){
        for (Application app : this.applications){
            System.out.println(app.name);
        }
    }

    public void printAllInstalledFreeApps(){
        for (Application app : this.applications){
            if (app.price ==0){
                System.out.println(app.name);
            }
        }
    }

    public void printAllInstalledAppsSortAlfa(){
        List<String> applist = new ArrayList<>();

        for (Application app : this.applications){
            applist.add(app.name);
        }
        Collections.sort(applist);
        for (String appname : applist){
            System.out.println(appname);
        }
    }

    public void printAllInstalledAppsSortPrice(){
        Application[] apps = this.applications.toArray(new Application[this.applications.size()]);
        Arrays.sort(apps, (a,b) -> a.price - b.price);
        for (Application app : apps){
            System.out.println(app);
        }
    }

    public void installAnApp(Application app)  throws Exception{
        if (this.owner.cash  < app.price) throw new Exception("not enough money");
        this.applications.add(app);
        this.owner.cash -= app.price;
    }

    public boolean isAppInstalled(Application app){
        return isAppInstalled(app.name);
    }

    public boolean isAppInstalled(String appName) {
        for (Application app : this.applications) {
            if (app.name.equals(appName))
                return true;
        }
        return false;
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
        if (seller.getMobilePhone() != this){
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
        buyer.setMobilePhone(seller.getMobilePhone());
        seller.setMobilePhone(null);
        System.out.println("Udało Ci się sprzedać telefon za " +price);


    }
}