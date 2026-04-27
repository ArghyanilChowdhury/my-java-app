package com.example;

public class App {

    public int addNumbers(int a, int b) {
        return a + b;
    }

    public String getMessage() {
        return "Hello, Jenkins Maven Pipeline!";
    }

    public static void main(String[] args) {
        App app = new App();

        System.out.println("Application Started Successfully.");
        System.out.println(app.getMessage());
        System.out.println("Addition of 10 and 20 is: " + app.addNumbers(10, 20));
    }
}