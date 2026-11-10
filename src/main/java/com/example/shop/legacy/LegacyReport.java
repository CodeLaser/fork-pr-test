package com.example.shop.legacy;

public class LegacyReport {
    public String render(String input) {
        return new LegacyTable().render("LegacyReport:" + input);
    }
}
