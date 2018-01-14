/**
 * Created by adrianasuarez on 14.01.18.
 */
public class Estatic {

    private final StringBuilder evaluations;
    private final String cadena = "hola";

    public Estatic(final StringBuilder evaluations) {
        this.evaluations = evaluations;
    }

    public void cambiar(){
        evaluations.append("funciona?");
    }
    public String getEvalutations(){
        return this.evaluations.toString();
    }

    public String append(String cad){
       return this.cadena.concat(" " + cad);
    }

    public String getCadena(){
        return this.cadena;
    }
}

class Main{

    public static void main(String args[]){

        String a;

        Estatic estatic = new Estatic(new StringBuilder("si"));
        estatic.cambiar();
        estatic.cambiar();
        estatic.cambiar();

        estatic.append("uno");
        estatic.append("dos");

        System.out.print(estatic.getCadena());
        System.out.print(estatic.getEvalutations());

    }

}

