package com.rohan.design.builder.example2.solution;

public class PersonBuilder<SELF extends PersonBuilder<SELF>> {

    protected Person person = new Person();

    public SELF withName(String name) {
        person.setName(name);
        return self();
    }

    protected SELF self() {
        return (SELF) this;
    }

    public Person build() {
        return person;
    }
}
