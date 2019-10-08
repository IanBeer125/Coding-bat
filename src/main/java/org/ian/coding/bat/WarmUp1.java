package org.ian.coding.bat;

public class WarmUp1 {

//    The parameter weekday is true if it is a weekday,
//    and the parameter vacation is true if we are on vacation.
//
//    We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (vacation || !weekday) {
            return true;
        }
        return false;
    }

//    We have two monkeys, a and b, and the parameters aSmile and bSmile
//    indicate if each is smiling.
//    We are in trouble if they are both smiling
//        or if neither of them is smiling.
//        Return true if we are in trouble.
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ( (aSmile && bSmile) || (!aSmile && !bSmile) ) {
            return true;
        }
        return false;
    }

//    Given two int values, return their sum.
//    Unless the two values are the same,
//    then return double their sum.
//
//    sumDouble(1, 2) → 3
//    sumDouble(3, 2) → 5
//    sumDouble(2, 2) → 8

    public int sumDouble(int a, int b) {
        if ( a == b) {
            return (a + b) * 2;
        } else {
            return a + b;
        }
    }

//    Given an int n, return the absolute difference between n and 21,
//    except return double the absolute difference if n is over 21.
//
//
//    diff21(19) → 2
//    diff21(10) → 11
//    diff21(21) → 0

    public int diff21(int n) {
        int twentyOne = 21;
        if (n == twentyOne) {
            return 0;
        } else if (n < twentyOne) {
            return twentyOne - n;
        } else {
            return (n - twentyOne) * 2;
        }
    }
}
