package com.epam.conditions;

public class TriangleSidesValidator {

    private final static String NOT_TRIANGLE = "it's not a triangle";
    private final static String TRIANGLE = "this is a valid triangle";

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (    firstSide + secondSide > thirdSide
                && secondSide + thirdSide > firstSide
                && thirdSide + firstSide > secondSide) {
            System.out.println(TRIANGLE);
            return;
        }

        System.out.println(NOT_TRIANGLE);
    }

    public static void main(String[] args) {
        new TriangleSidesValidator().validate(3, 4, 5);
        new TriangleSidesValidator().validate(1, 1, 5);
    }

}
