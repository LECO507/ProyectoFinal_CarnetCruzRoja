package com.ceste;


import java.util.*;
import java.util.Iterator;

/**
 * Created by leco2_000 on 28/4/2016.
 */
public class Main{
    public static void main(String[] args) {
        /**
         * ArrayList para almacenar los 5 objetos carnets.
         */
        String a = "Hola Mundo";
        ArrayList<CarnetCruzRoja> carnets = new ArrayList<>();

        CarnetCruzRoja c1 = new CarnetCruzRoja("L1C");
        c1.setNombre("Luis");
        c1.setApellido("Calderin");
        c1.setProvincia("Zaragoza");
        c1.setLocalidad("Zaragoza");
        c1.setServicio("Voluntario");
        c1.setCaducidad("14/08/20");

        CarnetCruzRoja c2 = new CarnetCruzRoja("M2C");
        c2.setNombre("Mayorian");
        c2.setApellido("Caballero");
        c2.setProvincia("Zaragoza");
        c2.setLocalidad("Zaragoza");
        c2.setServicio("Voluntario");
        c2.setCaducidad("2018/07/12");

        CarnetCruzRoja c3 = new CarnetCruzRoja("J3G");
        c3.setNombre("Jorge");
        c3.setApellido("Garrido");
        c3.setProvincia("Zaragoza");
        c3.setLocalidad("Zaragoza");
        c3.setServicio("Voluntario");
        c3.setCaducidad("14/08/20");

        CarnetCruzRoja c4 = new CarnetCruzRoja("F4G");
        c4.setNombre("Fitz");
        c4.setApellido("Gerald");
        c4.setProvincia("Zaragoza");
        c4.setLocalidad("Zaragoza");
        c4.setServicio("Voluntario");
        c4.setCaducidad("19/06/21");

        CarnetCruzRoja c5 = new CarnetCruzRoja("S5O");
        c5.setNombre("Sheyra");
        c5.setApellido("Oro");
        c5.setProvincia("Zaragoza");
        c5.setLocalidad("Zaragoza");
        c5.setServicio("Voluntario");
        c5.setCaducidad("13/07/22");
        /**
         * Introducimos los objetos carnets a la ArrayList
         */
        carnets.add(c1);
        carnets.add(c2);
        carnets.add(c3);
        carnets.add(c4);
        carnets.add(c5);

        Set set = new HashSet<>();
        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(c4);
        set.add(c5);
        set.add(c1);

        //for (Iterator<CarnetCruzRoja> iter = set.iterator(); iter.hasNext(); ) {
          //  CarnetCruzRoja element = iter.next();
            //System.out.println(element);
        //}

        Collection<CarnetCruzRoja>cruzRojaComparable = new TreeSet<CarnetCruzRoja>();
        cruzRojaComparable.add(c1);
        cruzRojaComparable.add(c2);
        cruzRojaComparable.add(c3);
        cruzRojaComparable.add(c4);
        cruzRojaComparable.add(c5);

        //for (Iterator<CarnetCruzRoja> iter = cruzRojaComparable.iterator(); iter.hasNext(); ) {
          //  CarnetCruzRoja comparable = iter.next();
            //System.out.println(comparable);
        //}

        Comparator dniComparator = new CruzRojaDniComparator();

        Collection<CarnetCruzRoja> cruzRojaDniComparator = new TreeSet<CarnetCruzRoja>(dniComparator);
        cruzRojaDniComparator.add(c1);
        cruzRojaDniComparator.add(c2);
        cruzRojaDniComparator.add(c3);
        cruzRojaDniComparator.add(c4);
        cruzRojaDniComparator.add(c5);

        //for (Iterator<CarnetCruzRoja> iter = cruzRojaDniComparator.iterator(); iter.hasNext(); ) {
          //  CarnetCruzRoja comparatorDni = iter.next();
          //  System.out.println(comparatorDni);
        //}

        Comparator fechaComparator = new CruzRojaFechaComparator();

        Collection<CarnetCruzRoja> cruzRojaFechaComparator = new TreeSet<CarnetCruzRoja>(fechaComparator);
        cruzRojaFechaComparator.add(c1);
        cruzRojaFechaComparator.add(c2);
        cruzRojaFechaComparator.add(c3);
        cruzRojaFechaComparator.add(c4);
        cruzRojaFechaComparator.add(c5);



        for (Iterator<CarnetCruzRoja> iter = cruzRojaFechaComparator.iterator(); iter.hasNext(); ) {
            CarnetCruzRoja comparatorFecha = iter.next();
            System.out.println(comparatorFecha);


        }

    }
}
