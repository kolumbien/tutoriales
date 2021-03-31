package javamaster.useful;

import java.util.Arrays;
import java.util.List;

public class ReminderOperator {

    public static void main(String args[]) {
       /* whatTimeIsIt(8, 9);
        whatTimeIsIt(12, 1);
        split_names_into_rows(
                Arrays.asList("Picard", "Riker", "Troi", "Crusher", "Worf", "Data", "La Forge"), 5);

        */

        convert_inches_to_feet(450);
    }

    /**
     * que horas son en un formato de 12 horas. El Mod es 12
     * Dada la hora, le sumo las horas, que hora es?
     * eJ: 8am + 9hrs = 5pm (not 17)
     */
    public static void whatTimeIsIt(int hour, int addHours) {

        int temp = hour + addHours;
        int timeMod12 = temp % 12;

        System.out.println("Son las " + timeMod12);
    }

    /**
     >>> split_names_into_rows(names, modulus=4)
     ----Picard----- -----Riker----- -----Troi------ ----Crusher----
     -----Worf------ -----Data------ ---La Forge----

     >>> split_names_into_rows(names, modulus=2)
     ----Picard----- -----Riker-----
     -----Troi------ ----Crusher----
     -----Worf------ -----Data------
     ---La Forge----

     >>> split_names_into_rows(names, modulus=1)
     ----Picard-----
     -----Riker-----
     -----Troi------
     ----Crusher----
     -----Worf------
     -----Data------
     ---La Forge----
     */
    public static void split_names_into_rows(List<String> values, int interval) {
        for(int i=1;i <= values.size();i++){
            System.out.print(values.get(i-1) + " ");

            if (i % interval == 0) {
                System.out.println();
            }
        }
    }

    /*
    * 450 inches = 37 feet and 6 inches
    * */
    public static void convert_inches_to_feet(int total_inches){

        int inches = total_inches /12;
        int feet = total_inches % 12;

        System.out.println("total inches= " + total_inches + " in feet: " + inches + " feet and " + feet + " inches");
    }

    /*
    *
    * */
    public static void caesar_cipher(char[] text, int shift, boolean decrypt){
       char[] lowercase = "abcdefghijklmnopqrstuvwxyz".toCharArray();
       char[] uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
       String result;

        /*
        lowercase = string.ascii_lowercase
    uppercase = string.ascii_uppercase
    result = ""

    if decrypt:
        shift = shift * -1

    for char in text:
        if char.islower():
            index = lowercase.index(char)
            result += lowercase[(index + shift) % 26]
        else:
            index = uppercase.index(char)
            result += uppercase[(index + shift) % 26]

    return result
        * */

    }

    /**
     * Extract digits of a number
     * @param number
     * @return
     */
    private static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        }

        int sum = 0;

        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number > 0) {
            // extract the least-significant digit
            int digit = number % 10;
            System.out.print("number % 10 " +  digit);
            sum += digit;

            // drop the least-significant digit
            System.out.println(" number / 10 " +  number/10);
            number /= 10;   // same as number = number / 10;
        }

        return sum;
    }

    /**
     * El reminder o sobrante es totalPages % 2
     * @param totalPages
     */
    public void numberOfPrintBlatt(int totalPages){
        int total = (totalPages /2) + (totalPages % 2);

        System.out.println("numero de hojas a usar en duplex mode = " + total);

    }

}
