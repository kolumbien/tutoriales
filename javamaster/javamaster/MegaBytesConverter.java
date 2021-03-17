package javamaster;

public class MegaBytesConverter {

    public static void main(String args[]){
            printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes<0)
            System.out.println("Invalid Value");
        else {

            int megabytes = kiloBytes / 1024;
            int remainingKilobytes =  kiloBytes % 1024;

            System.out.println(String.format("%d KB = %d MB and %d KB", kiloBytes, megabytes, remainingKilobytes));
        }
    }
}
