package com.rohan.design.builder.example1;

public class Demo {
    public static void main(String[] args) {
        HtmlBuilder builder = new HtmlBuilder("ul");
        builder.addChild("li", "hello")
                .addChild("li", "builder design pattern");
        System.out.println(builder.toString());
    }
}
