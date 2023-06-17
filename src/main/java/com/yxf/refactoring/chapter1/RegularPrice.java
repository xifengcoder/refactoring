package com.yxf.refactoring.chapter1;

public class RegularPrice extends Price{
    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }
}
