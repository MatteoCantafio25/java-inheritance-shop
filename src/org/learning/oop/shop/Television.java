package org.learning.oop.shop;

public class Television extends Product{

    // ATTRIBUTI
    private int code;
    private int size;
    private boolean isSmart;
    private int vat;

    // COSTRUTTORE
    public Television(String name, String description, double price, int size, boolean isSmart) {
        super(name, description, price);
        this.size = size;
        this.isSmart = isSmart;
        this.code = getRandomNumber();
        this.vat = 22;
    }

    // METODI

    @Override
    public String toString(){
        return "Name: " + getName() + " Desc: " + getDescription() + " TaxedPrice: " + getTaxedPrice() + "€" + " Size: " + getSize() + " Smart: " + isSmart();
    }

    public int getSize() {
        return size;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    public void setSize(int size) {
        this.size = size;
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
