package javamaster.sectionfive;

public class PrimerNumber {

    public static void main(String args[]) {
       // System.out.println(isPrime(21));
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));
    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isOdd(int number) {
        if (number > 0) {
            if (number % 2 != 0) {
                return true;
            }
        }

        return false;
    }

    public static int sumOdd(int start, int end) {

        if (start > 0 && end > 0 && end >= start) {

            int sum = 0;

            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }

            return sum;
        }

        return -1;
    }
}
