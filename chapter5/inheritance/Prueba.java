package inheritance;

/**
 * Created by adrianasuarez on 16.01.18.
 */
public class Prueba {

    public void asignandoArrays(){
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
        prueba.asignandoArrays();
    }

}
