package com.example.shop;

class Coupon {
    private final int percent;

    Coupon(int percent) {
        this.percent = percent;
    }

    int apply(int price) {
        return price - price * percent / 100;
    }
}
