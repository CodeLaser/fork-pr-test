package com.example.shop;

public class Receipt {
    private final Cart cart;

    public Receipt(Cart cart) {
        this.cart = cart;
    }

    public String format() {
        return "Total: " + cart.total();
    }

    /** The old receipt layout, for applications that still print it. */
    public String formatLegacy() {
        return "TOTAL " + cart.total() + " EUR";
    }
}
