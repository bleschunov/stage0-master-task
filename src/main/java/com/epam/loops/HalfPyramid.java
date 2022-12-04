package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {

        StringBuilder sb = new StringBuilder("*");

        for (int i = 0; i < cathetusLength; i++) {
            System.out.printf("%" + cathetusLength + "s", sb);
            sb.append("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        new HalfPyramid().printHalfPyramid(8);
//        new HalfPyramid().printHalfPyramid(2);
        new HalfPyramid().printHalfPyramid(3);
    }

}
