package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {

        number = Math.abs(number);

        int res = 0;

        for (int i = 0; i < 4; i++) {
            int temp = number % 10;
            res += temp;
            number = (number - temp) / 10;
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        new DigitsSumCalculator().calculateSum(-1111);
    }

}
