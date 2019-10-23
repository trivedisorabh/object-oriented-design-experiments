package com.rohan.oo.design.dip.example1.good;

public class Demo {

    public static void main(String[] args) {
        Person parent = new Person("Oracle");
        Person child1 = new Person("Morpheous");
        Person child2 = new Person("Neo");

        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent, child1);
        relationships.addParentAndChild(parent, child2);

        new Research(relationships);

    }
}
