package com.company;

public class Warmup1 {

    public static void main(String[] args) {
            sleepIn(false, true);
            parrotTrouble(false, 6);
            monkeyTrouble(true, false);
            icyHot(2, 120);
            startHi("hi there");
    }


    /* sleepIn
    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true*/

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if ((weekday == true) && (vacation == false)) {
            System.out.println("false");
            return false;
        } else {
            System.out.println("true");
            return true;
        }
    }

    /* parrotTrouble
    We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
    parrotTrouble(true, 6) → true
    parrotTrouble(true, 7) → false
    parrotTrouble(false, 6) → false*/

    public static boolean parrotTrouble(boolean talking, int hour) {
        if ((talking == true) && ((hour < 7) || (hour > 20 && hour <= 23))) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    /* monkeyTrouble
    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
    monkeyTrouble(true, true) → true
    monkeyTrouble(false, false) → true
    monkeyTrouble(true, false) → false*/

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == bSmile) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    /* icyHot
    Given two temperatures, return true if one is less than 0 and the other is greater than 100.
    icyHot(120, -1) → true
    icyHot(-1, 120) → true
    icyHot(2, 120) → false*/

    public static boolean icyHot(int temp1, int temp2) {
        if (((temp1 < 0) && (temp2 > 100)) || ((temp1 > 0) && (temp2 < 100))) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    /* startHi
    Given a string, return true if the string starts with "hi" and false otherwise.
    startHi("hi there") → true
    startHi("hi") → true
    startHi("hello hi") → false*/

    public static boolean startHi(String str) {
        if (str.startsWith ("hi")) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }



}
