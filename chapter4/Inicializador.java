import java.util.Random;

/**
 * Created by adrianasuarez on 14.01.18.
 */
public class Inicializador {


    int aConstructor;
    int aInitBlock;
    private int id = assignId();
    private static int nextId;

    private int assignId() {
        int r = nextId;
        nextId++;
        return r;
    }

    Inicializador(){
        aConstructor = 0;

    }

    {
        aInitBlock = 3;
        nextId = 1;
    }

    static {
        nextId = new Random().nextInt(10);

    }

    public static int getNextId(){
        return nextId;
    }

    public int getId(){
        return id;
    }

    public static void main(String[] args){
        Inicializador prueba = new Inicializador();
        Inicializador Inicializador = new Inicializador(); //nota: la variable es identica al nombre de la clase
        Inicializador prueba3 = new Inicializador();

      //  System.out.println(prueba.getNextId());

        System.out.println(prueba.getId());
        System.out.println(Inicializador.getId());
        System.out.println(prueba3.getId());
    }
}
