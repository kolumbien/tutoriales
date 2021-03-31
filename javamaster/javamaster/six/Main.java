package javamaster.six;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String args[]) {

        ArrayList<String> lista = new ArrayList<>();
        Integer myIntValue = 56; //--> Integer.valueOf(56) at compile time
        int myInt = myIntValue; //--> myIntValue.intValue()
       /* Shape uno = new Shape("uno");
        Shape dos = new Shape("dos");

        uno.printStaticName(); //dos

        dos.printStaticName();//dos*/

        print();


    }

    public static void print(){
        int []a = new int[3];
        int []b = new int[3];
        String[] names = new String[3];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0 ;i<3;i++){
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }

        for(int i = 0 ;i<3;i++){
            System.out.println("a = " + a[i]);
            System.out.println("b = " + b[i]);
        }

     /*   for(int i = 0 ;i<3;i++){
            a[i] = scanner.nextInt();
            scanner.nextLine();
            names[i] = scanner.nextLine();
        }

        for(int i = 0 ;i<3;i++){
            System.out.println("a = " + a[i]);
            System.out.println("name = " + names[i]);
        }

        System.out.println("enter year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); //handle next line character (enter key)

        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("your name = " + name);
        System.out.println(", year = " + year);
*/
        scanner.close();
    }

}
