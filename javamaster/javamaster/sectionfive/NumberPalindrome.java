package javamaster.sectionfive;

public class NumberPalindrome {

    public static void main(String args[]){
        System.out.println(isPalindrome(1234));

    }



    public static boolean isPalindrome(int number) {

        if(number >= -9 && number <= 9 ) return false;

        if(number < 0)
            number *=-1;

        //Extract the last digit of the given number by performing the modulo division (remainder).
        int reverse =0;
        int numberTemp = number;
        int lastDigit;

        while(numberTemp > 0){

            //gets the last digit
            lastDigit = numberTemp % 10;
            System.out.println("reverse = " + reverse + " *10 " + reverse * 10);
            reverse =  (reverse * 10) + lastDigit;

            numberTemp /= 10;
          //  System.out.println("numberTemp = " + numberTemp);
        }

        return reverse==number;
    }
}
