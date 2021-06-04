package com.mycompany.app;

/**
 * Hello world!
 */
public class Menu
{

    private final String message = "Hello Hotel!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
