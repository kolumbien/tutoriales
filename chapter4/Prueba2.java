/**
 * Created by adrianasuarez on 14.01.18.
 */
public class Prueba2 {

    private static int nextId;
    private int id = assignId();

    private int assignId() {
        int r = nextId;
        nextId++;
        return r;
    }

    Prueba2(){
       // nextId = 0;

    }

    public static int getNextId(){
        return nextId;
    }

    public int getId(){
        return id;
    }

    public static void main(String[] args){
        Prueba2 prueba = new Prueba2();
        Prueba2 prueba2 = new Prueba2();
        Prueba2 prueba3 = new Prueba2();

      //  System.out.println(prueba.getNextId());


        System.out.println(prueba.getId());
        System.out.println(prueba2.getId());
        System.out.println(prueba3.getId());
    }
}
