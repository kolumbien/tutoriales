import java.util.ArrayList;

import org.omg.CORBA.IntHolder;

import inheritance.Employee;

/**
 * Created by adrianasuarez on 22.01.18.
 */
public class ArregloLista {

    public static void main(String ...args){

        ArrayList<Integer> ee = new ArrayList<>(4);
        Employee[] emp = new Employee[3];
        //ee.add(new Integer(2));

       // System.out.println(emp.length);
        ee.ensureCapacity(3);

        ee.add(2);
        int b = ee.get(0);

        Employee e = new Employee();
        IntHolder a = new IntHolder(2);
        e.triple(a);


        System.out.println(a.value);



    }



}
