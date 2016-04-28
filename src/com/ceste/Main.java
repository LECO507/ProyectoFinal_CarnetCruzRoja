package com.ceste;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by leco2_000 on 28/4/2016.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<CarnetCruzRoja> carnets = new ArrayList<>();
        CarnetCruzRoja c1 = new CarnetCruzRoja("");
        c1.setNombre("Luis");
        c1.setApellido("Calderin");
        c1.setProvincia("Zaragoza");
        c1.setLocalidad("Zaragoza");
        c1.setServicio("Voluntario");
        c1.setCaducidad("18/07/18");

        CarnetCruzRoja c2 = new CarnetCruzRoja("");
        c2.setNombre("Mayorian");
        c2.setApellido("Caballero");
        c2.setProvincia("Zaragoza");
        c2.setLocalidad("Zaragoza");
        c2.setServicio("Voluntario");
        c2.setCaducidad("18/07/18");

        CarnetCruzRoja c3 = new CarnetCruzRoja("");
        c3.setNombre("Jorge");
        c3.setApellido("Garrido");
        c3.setProvincia("Zaragoza");
        c3.setLocalidad("Zaragoza");
        c3.setServicio("Voluntario");
        c3.setCaducidad("18/07/18");

        CarnetCruzRoja c4 = new CarnetCruzRoja("");
        c4.setNombre("Fitz");
        c4.setApellido("Gerald");
        c4.setProvincia("Zaragoza");
        c4.setLocalidad("Zaragoza");
        c4.setServicio("Voluntario");
        c4.setCaducidad("18/07/18");

        CarnetCruzRoja c5 = new CarnetCruzRoja("");
        c5.setNombre("Sheyra");
        c5.setApellido("Oro");
        c5.setProvincia("Zaragoza");
        c5.setLocalidad("Zaragoza");
        c5.setServicio("Voluntario");
        c5.setCaducidad("18/07/18");

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

        Set<CarnetCruzRoja> ccr = new TreeSet<CarnetCruzRoja>();
        ccr.add(c1);
        ccr.add(c2);
        ccr.add(c3);
        ccr.add(c4);
        ccr.add(c5);
        ccr.add(c1);

        for (CarnetCruzRoja cr : ccr){
            System.out.println(cr.getNombre()+", "+cr.getApellido());
        }

    }
}
