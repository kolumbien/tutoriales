package collections.copyListsToAnoter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import collections.onefivefive.Theatre;

public class Main {

    public static void main(String[] args) {
        //CollectionsCopy();
        //addAllList();
        //porConstructorList();
        //java8CollectorsList();
        java10ListCopyOf();
    }

    /**
     * While creating an ArrayList to copy another ArrayList using Collections.copy() method, we need to make sure
     * that the destination List contains same number of values (not just same size) as source List. For example, if
     * source ArrayList has values [Red,Blue,Green], then the destination ArrayList should also contain same number
     * of elements like [Orange,Yellow,Blue].If we create an ArrayList with same size that of source ArrayList, it
     * will give OutOfBounds exception.
     */
    public static void CollectionsCopy() {
       List<String> lista1 = Arrays.asList("Red", "Blue", "Green");
        List<String> lista2 = Arrays.asList("verde", "gris", "maraillo");
       List<String> listaCopy = new ArrayList<>(lista1.size());

       //copio lista2 a lista1
       Collections.copy(lista1,lista2);
       lista1.stream().forEach(System.out::println);

       //Error
       Collections.copy( listaCopy, lista1);
       listaCopy.stream().forEach(System.out::println);

    }

    /**
     * Copia por referencia
     */
    public static void addAllList(){
        Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Theatre.Seat> seatCopy = new ArrayList<>();

        seatCopy.addAll(theatre.seats);

        seatCopy.get(0).setSeatNumber("CHANGED");

        printList(seatCopy);

        //copia por referencia, osea que se cambaio el valor en la lista original
        printList(theatre.seats);

    }

    /**
     * Copia por referencia
     */
    public static void porConstructorList(){
        Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);

        seatCopy.get(0).setSeatNumber("CHANGED");

        printList(seatCopy);

        //copia por referencia, osea que se cambaio el valor en la lista original
        printList(theatre.seats);

    }

    //No existe arraysCopy cuando los items son objetos, solo datos primitivos
    public static void arraysCopy(){
        Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Theatre.Seat> seatCopy = new ArrayList<>();

        //Arrays.copyOf(theatre.seats.toArray(), seatCopy.toArray());

    }

    /**
     * Tambien lo cambia por referencia
     */
    public static void java8CollectorsList(){
        Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Theatre.Seat> seatCopy = theatre.seats.stream().collect(Collectors.toList());

        seatCopy.get(0).setSeatNumber("CHANGED");
        printList(seatCopy);

        //copia por referencia, osea que se cambaio el valor en la lista original
        printList(theatre.seats);
    }

    /**
     * Cambia por referencia
     */
    public static void java10ListCopyOf(){
        Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Theatre.Seat> seatCopy =   List.copyOf(theatre.seats);

        seatCopy.get(0).setSeatNumber("CHANGED");

        printList(seatCopy);

        //copia por referencia, osea que se cambaio el valor en la lista original
        printList(theatre.seats);

        seatCopy.remove(4); //error porque retorna una lista inmodificable
    }


    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("======================================================================");
    }
}
