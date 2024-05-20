package org.learning.oop.shop;

public class Smartphone extends Product{

    // ATTRIBUTI
    private int code;
    private int imei;
    private int memory;
    private int vat;


    // COSTRUTTORE
    public Smartphone(String name, String description, double price, int imei, int memory){
        super(name, description, price);
        this.imei = imei;
        this.memory = memory;
        this.code = getRandomNumber();
        this.vat = 22;
    }


    // METODI
    @Override
    public String toString(){
        return "Name: " + getName() + " Desc: " + getDescription() + " TaxedPrice: " + getTaxedPrice() + "€" + " Imei: " + getImei() + " Memory: " + getMemory() + "Gb";
    }


    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getVat(){
        return vat;
    }

    public void setVat(int vat){
        this.vat = vat;
    }

    public double getTaxedPrice(){
        double tax =  getPrice() * 0.22;
        return getPrice() + tax;
    }
}
