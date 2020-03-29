package com.company;

public class Logic1 {

    public static void main(String[] args) {
        cigarParty(61, false);
        //caughtSpeeding(65, true);
        //love6(6, 4);
        //more20(35);
        //teaParty(6, 8);
        //twoAsOne(1,2,5);
    }

    /* cigarParty
    When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.
    cigarParty(30, false) → false
    cigarParty(50, false) → true
    cigarParty(70, true) → true*/

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (((cigars >= 40 && cigars <= 60) && (isWeekend == false)) || ((cigars >= 40) && (isWeekend == true))) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    /* caughtSpeeding
    You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
    caughtSpeeding(60, false) → 0
    caughtSpeeding(65, false) → 1
    caughtSpeeding(65, true) → 0*/

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if ((speed <= 60 && isBirthday == false) || (speed <= 65 && isBirthday == true)) {
            System.out.println("0");
            return 0;
        } else if (((speed > 60 && speed <= 80) && isBirthday == false) || ((speed > 60 && speed <= 85) && isBirthday == true)) {
            System.out.println("1");
            return 1;
        } else if (((speed > 80) && isBirthday == false) || ((speed > 85) && isBirthday == true)) {
            System.out.println("2");
            return 2;
        } else {
            System.out.println("0");
            return 0;
        }
    }

    /* love6
    The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.
    love6(6, 4) → true
    love6(4, 5) → false
    love6(1, 5) → true*/

    public static boolean love6(int a, int b) {
        if ((a == 6 || b == 6) || (a + b == 6) || ((a - b == 6) || (b - a == 6))) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    /* more20
    Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod
    more20(20) → false
    more20(21) → true
    more20(22) → true*/

    public static boolean more20(int n) {
        if (((n - 1) % 20 == 0) || ((n - 2) % 20 == 0)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    /* teaParty
    We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always bad (0).
    teaParty(6, 8) → 1
    teaParty(3, 8) → 0
    teaParty(20, 6) → 2*/

    public static int teaParty(int tea, int candy) {
        if ((tea >= 5 && (tea < candy * 2)) && (candy >= 5 && (candy < tea * 2))) {
            System.out.println("1");
            return 1;
        } else if (((tea >= candy * 2) && candy >= 5) || ((candy >= tea * 2) && tea >= 5)) {
            System.out.println("2");
            return 2;
        } else if (tea < 5 || candy < 5) {
            System.out.println("0");
            return 0;
        } else {
            return 3;
        }
    }

    /* twoAsOne
    Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
    twoAsOne(1, 2, 3) → true
    twoAsOne(3, 1, 2) → true
    twoAsOne(3, 2, 2) → false*/

    public static boolean twoAsOne(int a, int b, int c) {
        if (a+b==c || b-a==c || a-b==c ||a+c==b || a-c==b || c-a==b ||c+b==a||c-b==a||b-c==a){
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

}
