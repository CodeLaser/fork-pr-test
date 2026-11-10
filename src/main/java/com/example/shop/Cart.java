package com.example.shop;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Integer> prices = new ArrayList<>();

    public void add(int price) {
        prices.add(price);
    }

    public int total() {
        return prices.stream().mapToInt(Integer::intValue).sum();
    }

    int cheapest() {
        return lowest(prices);
    }

    private static int lowest(List<Integer> values) {
        return values.stream().mapToInt(Integer::intValue).min().orElse(0);
    }
}
