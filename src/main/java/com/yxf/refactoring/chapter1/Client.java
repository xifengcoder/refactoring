package com.yxf.refactoring.chapter1;

public class Client {
    public static void main(String[] args) {
        Customer customer = new Customer("C1");
        Movie movie = new Movie("Avatar", Movie.CHILDREN);
        Movie movie1 = new Movie("Earth", Movie.REGULAR);
        customer.addRental(new Rental(movie, 10));
        customer.addRental(new Rental(movie1, 5));
        String result = customer.statement();
        System.out.println(result);
        String result2 = customer.htmlStatement();
        System.out.println(result2);
    }
}
