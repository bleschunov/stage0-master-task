package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int res = 0;
        res += number % 10 * 100;
        number = (number - number % 10) / 10;
        res += number % 10 * 10;
        number = (number - number % 10) / 10;
        res += number;
        System.out.println(res);
    }

}
