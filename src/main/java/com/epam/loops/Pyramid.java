package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            System.out.println(" ".repeat(cathetusLength - i) + getLine(i));
        }
    }

    public String getLine(int x) {

        if (x == 1)
            return "1";

        StringBuilder sb = new StringBuilder("2");

        for (int i = 3; i <= x; i++) {
            sb.append(i);
        }

        String line = sb.toString();

        return sb.reverse().toString() + 1 + line;
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
