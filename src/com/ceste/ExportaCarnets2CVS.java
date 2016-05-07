package com.ceste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by leco2_000 on 5/5/2016.
 */
public class ExportaCarnets2CVS {
    private ArrayList<CarnetCruzRoja> carnets;
    private final String nombreFichero;
    public ExportaCarnets2CVS(ArrayList<CarnetCruzRoja> carnets, String nombreFichero){
        this.carnets = carnets;
        this.nombreFichero = nombreFichero;
    }
    public void guardaDatos() throws IOException {
        FileWriter escritor = new FileWriter(nombreFichero);
        BufferedWriter bw = new BufferedWriter(escritor);

        // for para recorrer cada carnets
        bw.write(carnets.get(0).toString());;
        bw.newLine();
    }
}
