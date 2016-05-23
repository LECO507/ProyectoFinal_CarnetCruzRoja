package com.ceste;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by leco2_000 on 7/5/2016.
 */
public class CruzRojaDniComparator implements Comparator<CarnetCruzRoja> {
    /**
     *
     * @param o1
     * @param o2
     * @return
     * COMPARAMOS LOS DNI DE CADA CARNET
     */
    @Override
    public int compare(CarnetCruzRoja o1, CarnetCruzRoja o2) {

        return (o1).getDni().compareTo((o2).getDni());
    }

    /**
     *
     * @param setDni
     * RECORREMOS EL SET CON EL ITERATOR
     */
    public void mostrarDni (Set<CarnetCruzRoja> setDni){
        for (Iterator<CarnetCruzRoja> iter = setDni.iterator(); iter.hasNext(); ) {
            CarnetCruzRoja dni = iter.next();
            System.out.println(dni.dnitoString());
        }
    }
}
