package com.rohan.design.builder.example3;

/**
 * Show cases builder facade
 */
public class Demo {
    public static void main(String[] args) {

        PersonBuilder pb = new PersonBuilder();
        Person person = pb.lives()
                .at("142 Los Angeles")
                .in("California")
                .withPostcode("90001")
                .works()
                .at("Tesla")
                .asA("CTO")
                .earning(Integer.MAX_VALUE)
                .build();

        System.out.println(person);
    }
}
