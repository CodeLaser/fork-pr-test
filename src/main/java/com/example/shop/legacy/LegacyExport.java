package com.example.shop.legacy;

public class LegacyExport {
    public String render(String input) {
        return new LegacyReport().render("LegacyExport:" + input);
    }
}
