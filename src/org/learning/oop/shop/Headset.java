package org.learning.oop.shop;

public class Headset extends Product {

    // ATTRIBUTI
    private int code;
    private String color;
    private boolean isWireless;
     private int vat;

    // COSTRUTTORE
    public Headset(String name, String description, double price, String color, boolean isWireless) {
        super(name, description, price);
        this.color = color;
        this.isWireless = isWireless;
        this.code = getRandomNumber();
        this.vat = 22;
    }


    // METODI
    @Override
    public String toString(){
        return "Name: " + getName() + " Desc: " + getDescription() + " TaxedPrice: " + getTaxedPrice() + "€" + " Color: " + getColor() + " Wireless: " + isWireless();
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
