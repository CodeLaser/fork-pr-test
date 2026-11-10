package com.example.shop.legacy;

public class LegacyFormat {
    public String render(String input) {
        return new LegacyEncoding().render("LegacyFormat:" + input);
    }
}
