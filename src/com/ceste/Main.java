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
        ArrayList<CarnetCruzRoja> carnets = new ArrayList<>();

        CarnetCruzRoja c1 = new CarnetCruzRoja("A123");
        c1.setNombre("Luis");
        c1.setApellido("Calderin");
        c1.setProvincia("Zaragoza");
        c1.setLocalidad("Zaragoza");
        c1.setServicio("Voluntario");
        c1.setCaducidad("18/07/18");

        CarnetCruzRoja c2 = new CarnetCruzRoja("B456");
        c2.setNombre("Mayorian");
        c2.setApellido("Cabellero");
        c2.setProvincia("Zaragoza");
        c2.setLocalidad("Zaragoza");
        c2.setServicio("Voluntario");
        c2.setCaducidad("18/07/18");

        CarnetCruzRoja c3 = new CarnetCruzRoja("C789");
        c3.setNombre("Jorge");
        c3.setApellido("Garrido");
        c3.setProvincia("Zaragoza");
        c3.setLocalidad("Zaragoza");
        c3.setServicio("Voluntario");
        c3.setCaducidad("18/07/18");

        CarnetCruzRoja c4 = new CarnetCruzRoja("D2468");
        c4.setNombre("Fitz");
        c4.setApellido("Gerald");
        c4.setProvincia("Zaragoza");
        c4.setLocalidad("Zaragoza");
        c4.setServicio("Voluntario");
        c4.setCaducidad("18/07/18");

        CarnetCruzRoja c5 = new CarnetCruzRoja("E1379");
        c5.setNombre("Sheyra");
        c5.setApellido("Oro");
        c5.setProvincia("Zaragoza");
        c5.setLocalidad("Zaragoza");
        c5.setServicio("Voluntario");
        c5.setCaducidad("18/07/18");
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

        for (Iterator<CarnetCruzRoja> iter = set.iterator(); iter.hasNext(); ) {
            CarnetCruzRoja element = iter.next();
            System.out.println(element);
        }
    }
}
