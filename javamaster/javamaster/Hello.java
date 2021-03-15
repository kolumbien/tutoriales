package javamaster;

public class Hello {

    public static void main(String args[]){
        Integer a=0;

        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        int alternativeIntWriting = 2_147_483_647; //ab java 7

        System.out.println("minValue -1 is underflow= " + (minValue-1));
        System.out.println("maxValue + 1 is overflow = + " + (maxValue + 1));
    }
}
