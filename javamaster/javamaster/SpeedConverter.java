package javamaster;

public class SpeedConverter {

    public static void main(String args[]){
        printConversion(10.5);
    }
  //speed converter
    public static long toMilesPerHour(double kilometersPerHour){

            if(kilometersPerHour < 0){
                return -1;
            }

            long total = Math.round(kilometersPerHour / 1.609);

        return total;
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour >= 0) {

            long milesPerHour = toMilesPerHour(kilometersPerHour);

            System.out.println(kilometersPerHour + "km/h = " + milesPerHour + " mi/h");
        }
        else
        {
            System.out.println("Invalid Value");
        }
    }

}
