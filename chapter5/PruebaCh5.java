import java.util.ArrayList;

import inheritance.Employee;

/**
 * Created by adrianasuarez on 16.01.18.
 */
public class PruebaCh5 {

    public static void main(String[] args)
    {
        Employee e = new Employee();

        //esta fuera del paquete
       // System.out.print( e.getProtectedMethod());

        String uno = "Hola";
        String dos = "Hola";

        System.out.print(uno.hashCode() + " " +dos.hashCode());

        int actualSize = 7;
        Employee[] staff = new Employee[actualSize];


    }
}
