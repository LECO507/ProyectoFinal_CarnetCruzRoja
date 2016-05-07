package com.ceste;

import java.util.Comparator;

/**
 * Created by leco2_000 on 7/5/2016.
 */
public class CruzRojaDniComparator implements Comparator<CarnetCruzRoja> {
    @Override
    public int compare(CarnetCruzRoja o1, CarnetCruzRoja o2) {
            return (o1).getDni().compareTo((o2).getDni());
    }
}
