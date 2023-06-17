package com.yxf.refactoring.chapter1;

public class ChildrenPrice extends Price{
    @Override
    int getPriceCode() {
        return Movie.CHILDREN;
    }
}
