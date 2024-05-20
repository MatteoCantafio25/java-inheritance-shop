package org.learning.oop.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {

        int cartItems;
        int itemType;
        String productName;
        String productDesc;
        double productPrice;
        int productImei;
        int productMemory;
        int productSize;
        String smartTvChoice;
        boolean isProductSmart;
        String productColor;
        String wirelessChoice;
        boolean isProductWireless;

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many products do you want to put in your cart? ");
        cartItems = Integer.parseInt(scanner.nextLine());

        Product[] cart = new Product[cartItems];

        for (int i = 0; i < cartItems; i++) {
            System.out.print("Enter 1 to insert a smartphone, 2 for a television, 3 for headsets ");
            itemType = Integer.parseInt(scanner.nextLine());

            if (itemType == 1){
                System.out.print("Enter the name of the smartphone ");
                productName = scanner.nextLine();

                System.out.print("Enter a description of the smartphone ");
                productDesc = scanner.nextLine();

                System.out.print("Enter the price of the smartphone ");
                productPrice = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter the imei code of the smartphone ");
                productImei = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter memory capability smartphone ");
                productMemory = Integer.parseInt(scanner.nextLine());

                cart[i] = new Smartphone(productName, productDesc, productPrice, productImei,productMemory);

            } else if (itemType == 2) {
                System.out.print("Enter the name of the television ");
                productName = scanner.nextLine();

                System.out.print("Enter a description of the television ");
                productDesc = scanner.nextLine();

                System.out.print("Enter the price of the television ");
                productPrice = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter size of the television ");
                productSize = Integer.parseInt(scanner.nextLine());

                System.out.print("Is the television smart? (yes/no) ");
                smartTvChoice = scanner.nextLine();
                isProductSmart = smartTvChoice.equals("yes");

                cart[i] = new Television(productName, productDesc, productPrice, productSize, isProductSmart);
            } else if (itemType == 3) {
                System.out.print("Enter the name of the headset ");
                productName = scanner.nextLine();

                System.out.print("Enter a description of the headset ");
                productDesc = scanner.nextLine();

                System.out.print("Enter the price of the headset ");
                productPrice = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter the color of the headset ");
                productColor = scanner.nextLine();

                System.out.print("Is the headset wireless? (yes/no) ");
                wirelessChoice = scanner.nextLine();
                isProductWireless = wirelessChoice.equals("yes");

                cart[i] = new Headset(productName, productDesc, productPrice, productColor, isProductWireless);
            }
        }
        System.out.println(Arrays.toString(cart));

        scanner.close();
    }
}
