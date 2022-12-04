package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        System.out.println(new StringBuilder(String.valueOf(number)).reverse());
    }

    public static void main(String[] args) {
        new NumberReverter().revert(489);
    }

}
