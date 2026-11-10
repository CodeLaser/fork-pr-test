package com.example.shop;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(250);
        cart.add(400);
        cart.add(120);
        System.out.println(new Receipt(cart).format());
        System.out.println("Cheapest item: " + cart.cheapest());
    }
}
