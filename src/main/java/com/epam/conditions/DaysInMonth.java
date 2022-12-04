package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        if (month % 2 == 0 && month != 2) {
            System.out.println(30);
            return;
        }

        if (month % 2 == 1) {
            System.out.println(31);
            return;
        }

        boolean leap =
                (year % 4 == 0
                && year % 100 != 0)
                || (year % 4 == 0
                && year % 100 == 0
                && year % 400 == 0);

        if (month == 2) {
            System.out.println(leap ? 29 : 28);
        }


    }

    public static void main(String[] args) {
        new DaysInMonth().printDays(2000, 2);
    }
}
