package javamaster;

public class integersClass {

    public static void main(String args[]){
        Integer a=0;

        int maxValue = Integer.MAX_VALUE; //2147483647
        int minValue = Integer.MIN_VALUE; //-2147483648
        int alternativeIntWriting = 2_147_483_647; //ab java 7

        System.out.println("minValue -1 is underflow= " + (minValue-1));
        System.out.println("maxValue + 1 is overflow = + " + (maxValue + 1));

        byte byteMinValue = Byte.MIN_VALUE; //-128
        byte byteMaxValue = Byte.MAX_VALUE; //127

        System.out.println("byteMaxValue = " + byteMaxValue);
        System.out.println("byteMinValue = " + byteMinValue);

        short shortMinValue = Short.MIN_VALUE; //-128
        short shortMaxValue = Short.MAX_VALUE; //127

        System.out.println("shortMaxValue = " + shortMaxValue);
        System.out.println("shortMinValue = " + shortMinValue);

        int test = shortMaxValue;
        short castIntToShort = (short) minValue; //zero

        System.out.println("minValue = " + minValue);
        System.out.println("castIntToShort = " + castIntToShort);

        byte myNewByteValue= (byte) (byteMaxValue / 2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long total = byteValue + shortValue + intValue;
        System.out.println("total = " + total);
    }
}
