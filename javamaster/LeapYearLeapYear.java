import java.util.Arrays;
import java.util.List;

public class LeapYearLeapYear {

    public static void main(String args[]){

        List<Integer> noleapYears = Arrays.asList(1700,1800,1900,2100,2200,2300,2500,2600);

       for(Integer i : noleapYears)
        System.out.println(isLeapYear(i));

        System.out.println("Leap years:");

        List<Integer> leapYears = Arrays.asList(1600,2000,2400);

        for(Integer i : leapYears)
            System.out.println(isLeapYear(i));


    }

    public static boolean isLeapYear(int year){

        if(year >=1 && year <=9999){
            if((year % 4) ==0){
                if((year % 100)==0){
                    if((year % 400)==0){
                        return true;
                    }
                }
                else {
                    return true;
                }

            }
        }

        return false;
    }

}
