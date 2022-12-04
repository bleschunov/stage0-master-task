package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {

        if (x == 0 || y == 0) {
            System.out.println("zero");
            return;
        }

        if (x > 0 && y > 0) {
            System.out.println("first");
        } else if (x < 0 && y < 0) {
            System.out.println("third");
        } else if (x > 0 && y < 0) {
            System.out.println("fourth");
        } else if (x < 0 && y > 0) {
            System.out.println("second");
        }

    }

    public static void main(String[] args) {
        new CoordinatePane().printQuadrant(1, 1);
        new CoordinatePane().printQuadrant(1, -1);
        new CoordinatePane().printQuadrant(-1, -1);
        new CoordinatePane().printQuadrant(-1, 1);
        new CoordinatePane().printQuadrant(1, 0);
    }

}

