package com.rohan.oo.design.ocp.example1.good;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
