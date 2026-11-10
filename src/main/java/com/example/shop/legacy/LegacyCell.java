package com.example.shop.legacy;

public class LegacyCell {
    public String render(String input) {
        return new LegacyFormat().render("LegacyCell:" + input);
    }
}
