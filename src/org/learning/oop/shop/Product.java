package org.learning.oop.shop;
import java.util.Random;

public class Product {

       /*
        Esercizio 1: Java Shop :shopping_trolley:
        Creare la classe Prodotto che gestisce i prodotti dello shop.
        Un prodotto è caratterizzato da:
        - codice (numero intero)
        - nome
        - descrizione
        - prezzo
        - iva
        Usate opportunamente i livelli di accesso (public, private), i costruttori,
         i metodi getter e setter ed eventuali altri metodi di “utilità”per fare in modo che:
        - alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
        - il codice prodotto sia accessibile solo in lettura e deve essere restituito come Stringa con un padleft a 6 caratteri (es. codice 15->“000015")
        - gli altri attributi siano accessibili sia in lettura che in scrittura
        - il prodotto esponga un metodo per avere il prezzo base
        - il prodotto esponga un metodo per avere il prezzo comprensivo di iva
        - il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
        Nello stesso package aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto.


        Lo shop gestisce diversi tipi di prodotto:
        Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
        Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
        Cuffie, caratterizzate dal colore e se sono wireless o cablate
        Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.
        Create una classe Carrello con metodo main, in cui chiedete all’utente di valorizzare un carrello di prodotti con dati inseriti tramite scanner.
        Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smarphone o un Televisore o Cuffie
        e in base alla scelta dell’utente utilizzate il costruttore opportuno.
        Al termine dell’inserimento stampate il carrello (fate l’override del metodo toString per restituire le informazioni da stampare per ogni classe)
        */



    // ATTRIBUTI
    private int code;
    private String name;
    private String description;
    private double price;
    private int vat;


    // COSTRUTTORI

    public Product ( String name, String description, double price){
        this.code = getRandomNumber();
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = 22;
    }


    // METODI
    public String getCode() {
        return String.format("%06d", this.code);
    }

    public int getRandomNumber(){
        Random random = new Random();
        return random.nextInt(20) + 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTaxedPrice(){
        double tax =  this.price * 0.22;
        return this.price + tax;
    }

    public int getVat(){
        return vat;
    }

    public void setVat(int vat){
        this.vat = vat;
    }

    public  String getFullName(){
        return getCode() + "-" + name;
    }
}

