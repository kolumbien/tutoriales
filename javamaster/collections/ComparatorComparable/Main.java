package collections.ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //usingComparator();
        usingComparable();
    }

    /**
     * La clase Seat implementa a la interface Comparable
     */
    public static void usingComparable() {
        Theatre theatre = new Theatre("Olympian", 3, 3);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00-cara", 13.00));
        priceSeats.add(theatre.new Seat("A00-cara", 13.00));
        priceSeats.add(theatre.new Seat("Z90-cheap", 3.00));
        Collections.sort(priceSeats);
        printList(priceSeats);
    }

    /**
     * Quiero ordernarlo con otro criterio diferente al de la clase Seat implemnts Comparable
     */
    public static void usingComparator() {
        Theatre theatre = new Theatre("Olympian", 3, 3);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00-cara", 13.00));
        priceSeats.add(theatre.new Seat("A00-cara", 13.00));
        priceSeats.add(theatre.new Seat("Z90-cheap", 3.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + "$" + seat.getPrice());
        }
        System.out.println();
        System.out.println("======================================================================");
    }
}
