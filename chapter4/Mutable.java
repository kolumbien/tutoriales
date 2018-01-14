import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by adrianasuarez on 14.01.18.
 */
public class Mutable {
    LocalDate localDate =  LocalDate.of  (2016,10,10);

    GregorianCalendar gregorianCalendar = new GregorianCalendar(2016,10,10);

    public void changeLocalDate(){
        this.localDate.plusDays(1);
    }

    public LocalDate getLocalDate(){
        return this.localDate;
    }

    public GregorianCalendar getGregorianCalendar(){
        return this.gregorianCalendar;
    }

    public void changeGregorianCalendar(){
        this.gregorianCalendar.add(Calendar.DAY_OF_MONTH, 1);
    }


    public static void main(String args[]) {
        System.out.print("main de mutable");
    }
}

class Maindos{

    public static void main(String args[]) {

        Mutable mutable = new Mutable();

        //Immutable
        System.out.println(mutable.getLocalDate().toString());
        mutable.changeLocalDate();
        System.out.println(mutable.getLocalDate().toString());

        //Mutable
        System.out.println(mutable.getGregorianCalendar().getTime());
        mutable.changeGregorianCalendar();
        System.out.println(mutable.getGregorianCalendar().getTime());


    }

}
