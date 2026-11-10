package com.example.shop.legacy;

public class LegacyTable {
    public String render(String input) {
        return new LegacyRow().render("LegacyTable:" + input);
    }
}
