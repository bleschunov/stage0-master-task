package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {

        if (divider == 0) {
            System.out.println("division by zero");
            return;
        }

        int res = dividend / divider;

        if (res * divider == dividend) {
            System.out.println("can be divided completely");
        } else {
            System.out.println("cannot be divided completely");
        }
    }

    public static void main(String[] args) {
        new IntegerDivider().printCompletelyDivided(10, 0);
        new IntegerDivider().printCompletelyDivided(10, 3);
        new IntegerDivider().printCompletelyDivided(10, 2);
    }

}
