package com.company;

public class String1 {

    public static void main(String[] args) {
        helloName("Bob");
    }

    /* helloName
    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
    helloName("Bob") → "Hello Bob!"
    helloName("Alice") → "Hello Alice!"
    helloName("X") → "Hello X!"*/

    public static String helloName(String name) {
        System.out.println("Hello " + name + "!");
        return "Hello " + name + "!";
    }

}
