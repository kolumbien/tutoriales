package inheritance;

import java.lang.reflect.Field;

/**
 * Created by adrianasuarez on 16.01.18.
 */
public class Prueba {

    public void asignandoArrays() throws NoSuchFieldException, IllegalAccessException {

        Employee employee = new Employee("lola diaz", 2000,2010,11,11);
        Class cl = employee.getClass();
        Field f = cl.getDeclaredField("name");
        f.setAccessible(true);
        f.set(employee,"adri suare");
        Object v = f.get(employee);


        Manager[] manager = new Manager[2];

        Employee[] employees = new Employee[2];

        Employee e = new Employee();
        //employees = manager;

      //  employees[0] = new Employee();

        System.out.print( e.getProtectedMethod());

    }

    public void castException(){

        Manager[] manager = new Manager[2];
        manager[0] = new Manager();


        //String s = (String) manager[0];
    }

    public static void  main(String[] args){
        Prueba prueba = new Prueba();
        try {
            prueba.asignandoArrays();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
