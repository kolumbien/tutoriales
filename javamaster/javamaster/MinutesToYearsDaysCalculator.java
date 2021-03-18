package javamaster;

public class MinutesToYearsDaysCalculator {

    public static void main(String args[]) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            long years = minutes / 525600l;
            long days=   minutes / 1440l;
            long daysLeft = days % 365;

            System.out.println(String.format("%d min = %d year and %d days", minutes, years, daysLeft));
        }
    }
}
