package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE1= "Hello World!";
    private static final String MESSAGE2 = "Bye World!"
    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE1);
        System.out.println(MESSAGE2)
    }

    public String getMessage() {
        return MESSAGE1,MESSAGE2;
    }
}
