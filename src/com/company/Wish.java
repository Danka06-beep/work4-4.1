package com.company;

public class Wish {
    String name;
    String opisanie;
    double price;
    String addres;
    int prioritet;

    public Wish(String name, String opisanie, double price, String addres, int prioritet) {
        this.name = name;
        this.opisanie = opisanie;
        this.price = price;
        this.addres = addres;
        this.prioritet = prioritet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpisanie() {
        return opisanie;
    }

    public void setOpisanie(String opisanie) {
        this.opisanie = opisanie;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public int getPrioritet() {
        return prioritet;
    }

    public void setPrioritet(int prioritet) {
        this.prioritet = prioritet;
    }

    @Override
    public String toString() {
        return "Желание= " + "название " + name +  " описание:" + opisanie +  " цена:" + price + " аддрес:" + addres + " приоритет:" + prioritet;
    }
}
