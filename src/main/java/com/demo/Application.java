package com.demo;

public class Application {

    public static void main(String[] args) throws Exception {

        Calculator calculator = new Calculator();

        System.out.println("Application started");
        System.out.println("10 + 20 = " + calculator.add(10, 20));

        while (true) {
            Thread.sleep(30000);
            System.out.println("Application running...");
        }
    }
}
