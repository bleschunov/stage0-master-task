package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {

        System.out.printf("%4s ", " ");

        for (int i = 1; i <= numberTableToPrint; i++) {
            System.out.printf("%3d ", i);
        }

        System.out.println();
        System.out.printf("%4s ", "  ");

        for (int i = 1; i <= numberTableToPrint; i++) {
            System.out.printf("%3s ", "-");
        }

        System.out.println();

        for (int i = 1; i <= numberTableToPrint; i++) {
            System.out.printf("%3d %1s", i, "|");
            for (int j = 1; j <= numberTableToPrint; j++) {
                System.out.printf("%3d ", i * j);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new MultiplicationTable().printTable(13);
    }

}
