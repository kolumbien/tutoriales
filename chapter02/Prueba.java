public class Prueba
{
    public static void main(String[] args) {
       /* String greeting = "Welcome to Core Java!";
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++)
            System.out.print("=");
        System.out.println();*/
        String hola = "";
 /*       System.out.println(hola.codePointAt(0));
        System.out.println(hola.codePointAt(1));
        System.out.println(hola.codePointAt(2));
        System.out.println(hola.codePointAt(3));
*/
        // System.out.println(System.getProperty("user.dir"));
        label:
        {
            if(hola.isEmpty()) {
                System.out.println("sale");
                break label;
            }
            System.out.print("no sale");
        }
    }
}
