package javamaster;

public class DecimalComparator {

    public static void main(String args[]) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));

    }

    private static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        int intPartNum1 = (int) (num1 * 1000);
        int intPartNum2 = (int) (num2 * 1000);

        if (intPartNum1 == intPartNum2) {

            return true;
        }

        return false;
    }
}
