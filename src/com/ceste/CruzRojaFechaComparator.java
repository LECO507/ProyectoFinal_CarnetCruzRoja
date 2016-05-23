package com.ceste;

import java.text.ParseException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by leco2_000 on 7/5/2016.
 */
public class CruzRojaFechaComparator implements Comparator<CarnetCruzRoja> {
    /**
     *
     * @param o1
     * @param o2
     * @return
     * COMPARAMOS LAS FECHA DE CADUCIDAD DE CADA CARNET
     */
    @Override
    public int compare(CarnetCruzRoja o1, CarnetCruzRoja o2) {
        try {
            return (o1).getCaducidad().compareTo((o2).getCaducidad());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     *
     * @param setFecha
     * RECORREMOS EL SET CON EL ITERATOR
     */
    public void mostrarFecha(Set<CarnetCruzRoja> setFecha) {
        for (Iterator<CarnetCruzRoja> iter = setFecha.iterator(); iter.hasNext(); ) {
            CarnetCruzRoja fecha = iter.next();
            System.out.println(fecha.fechaToString());
        }
    }
}
