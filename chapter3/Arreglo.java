import java.util.Arrays;

/**
 * Created by adrianasuarez on 13.01.18.
 */
public class Arreglo {

    public static void main(String[] args) {

matrices();
    }

    public static void arreglo(){
        // fill an array with numbers 1 2 3 . . . n
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;


        System.out.println(Arrays.toString(numbers));

        Arrays.fill(numbers, 8);

        System.out.println(Arrays.toString(numbers));

    }

    public static void matrices(){

        int[][] uno = new int[2][2];
        int[][] dos = { {0,1},{2,3} };

        int flag=0;
        for(int i =0; i < 2 ;i++){
            for(int j=0;j< 2;j++){
                uno[i][j]=flag++;
            }
        }

        System.out.println(Arrays.deepToString(uno));
        System.out.println(Arrays.deepToString(dos));

        System.out.println( Arrays.deepEquals(uno,dos));

    }



}
