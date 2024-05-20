package org.learning.oop.shop;

public class Television extends Product{

    // ATTRIBUTI
    private int code;
    private int size;
    private boolean isSmart;

    // COSTRUTTORE
    public Television(String name, String description, double price, int size, boolean isSmart) {
        super(name, description, price);
        this.size = size;
        this.isSmart = isSmart;
        this.code = getRandomNumber();
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
}
