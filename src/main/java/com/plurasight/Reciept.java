package com.plurasight;

public class Reciept {
    public static void main(String[] args) {
        String item = "sugar";
        double itemPrice = 4.69;
        int quantity = 4;
        double total = itemPrice * quantity;
        System.out.println("You bought " + quantity + " bags of " + item + " for $" + total);
    }
}
