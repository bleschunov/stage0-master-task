package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {

        if (monthNumber > 12 || monthNumber < 1) {
            System.out.println("Wrong month number");
            return;
        }

        if (monthNumber == 12 || monthNumber < 3) {
            System.out.println("Winter");
            return;
        }

        if (monthNumber < 6) {
            System.out.println("Spring");
            return;
        }

        if (monthNumber < 9) {
            System.out.println("Summer");
            return;
        }

        System.out.println("Autumn");
    }

    public static void main(String[] args) {
        new SeasonDeterminer().tellTheSeason(2);
        new SeasonDeterminer().tellTheSeason(5);
        new SeasonDeterminer().tellTheSeason(9);
        new SeasonDeterminer().tellTheSeason(12);
        new SeasonDeterminer().tellTheSeason(0);
    }

}
