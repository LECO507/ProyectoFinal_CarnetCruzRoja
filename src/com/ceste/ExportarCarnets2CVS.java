package com.ceste;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by leco2_000 on 9/5/2016.
 */
public class ExportarCarnets2CVS{

    private final ArrayList<CarnetCruzRoja> carnets;
    private String fichero;

    public ExportarCarnets2CVS(ArrayList carnets, String fichero) throws IOException {
        this.carnets = carnets;
        this.fichero = fichero;
    }
    public void guardarDatos() {
        try {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int x = 0; x < carnets.size(); x++) {
                    String carnetString = carnets.get(x).toString();
                    bw.write(carnetString, 0, carnetString.length());
                    bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
