package com.rohan.oo.design.ocp.example1.good;

import com.rohan.oo.design.ocp.example1.Color;

public class ColorSpecification implements Specification<Product> {

    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return this.color == item.getColor();
    }
}
