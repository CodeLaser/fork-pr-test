package com.example.shop.legacy;

public class LegacyRow {
    public String render(String input) {
        return new LegacyCell().render("LegacyRow:" + input);
    }
}
