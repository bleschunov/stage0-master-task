package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + numberTableToPrint + " = " + i * numberTableToPrint);
        }

    }

    public static void main(String[] args) {
        new MultiplicationTable().printTable(13);
    }

}
