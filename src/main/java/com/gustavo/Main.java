package com.gustavo;

public class Main {

    public record MainRecod(String name) {
    }
    public static void main(String[] args) {
        System.out.println("Hello " + new MainRecod("Gustavo!!").name());
    }
}
