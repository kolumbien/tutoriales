package javamaster.sectionfive;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter year: ");
        boolean hasNextInt = scanner.hasNextInt();
        scanner.nextLine(); //handle next line character (enter key)

        if (hasNextInt) {

            int year = scanner.nextInt();
            scanner.nextLine(); //handle next line character (enter key)

            System.out.println("Enter name: ");
            String name = scanner.nextLine();

            int age = 2021 - year;

            System.out.print("your name = " + name);
            System.out.println(", age = " + age);
        }
        System.out.println("Enter lastname: ");
        String lasname = scanner.nextLine();
        System.out.println("lasname = " + lasname);

        scanner.close();
    }
}
