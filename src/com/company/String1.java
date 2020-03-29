package com.company;

public class String1 {

    public static void main(String[] args) {
        //helloName("Bob");
        //firstHalf("woohoo");
        //endsLy("oddly");
        //theEnd("Hello", false);
        //nonStart("Hello", "There");
        makeAbba("Hi", "Bye");
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

    /* firstHalf
    Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
    firstHalf("WooHoo") → "Woo"
    firstHalf("HelloThere") → "Hello"
    firstHalf("abcdef") → "abc"*/

    public static String firstHalf(String str) {
        String half = str.substring(0, str.length() / 2);
        System.out.println(half);
        return half;
    }

    /* endsLy
    Given a string, return true if it ends in "ly".
    endsLy("oddly") → true
    endsLy("y") → false
    endsLy("oddy") → false*/

    public static boolean endsLy(String str) {
        if (str.endsWith("ly")) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    /* theEnd
    Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
    theEnd("Hello", true) → "H"
    theEnd("Hello", false) → "o"
    theEnd("oh", true) → "o"*/

    public static String theEnd(String str, boolean front) {
        if (front == true) {
            String a = str.substring(0, 1);
            System.out.println(a);
            return a;
        } else {
            String b = str.substring(str.length() - 1);
            System.out.println(b);
            return b;
        }
    }

    /* nonStart
    Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
    nonStart("Hello", "There") → "ellohere"
    nonStart("java", "code") → "avaode"
    nonStart("shotl", "java") → "hotlava"*/

    public static String nonStart(String a, String b) {
        String c = a.substring(1);
        String d = b.substring(1);
        return c.concat(d);
    }

    /* makeAbba
    Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
    makeAbba("Hi", "Bye") → "HiByeByeHi"
    makeAbba("Yo", "Alice") → "YoAliceAliceYo"
    makeAbba("What", "Up") → "WhatUpUpWhat"*/

    public static String makeAbba(String a, String b) {
        String c = a.concat(b);
        String d = b.concat(a);
        System.out.println(c.concat(d));
        return c.concat(d);
    }

}
