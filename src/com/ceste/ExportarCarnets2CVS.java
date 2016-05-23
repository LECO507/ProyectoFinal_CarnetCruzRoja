package com.ceste;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by leco2_000 on 9/5/2016.
 */
public class ExportarCarnets2CVS{
    /**
     * LLAMAMOS A LA COLECCION DE CARNETS
     * EN fichero COLOCAMOS LA RUTA DONDE SE CREARA NUESTRO FICHERO .csv
     * CREAMOS LAS VARIABLES GLOBALES
     */
    private final ArrayList<CarnetCruzRoja> carnets;
    private String fichero = "C:\\Users\\leco2_000\\Desktop\\CESTE\\2año\\Programacion\\ProyectoFinal\\CarnetCruzRoja.csv";
    File file = new File(fichero);
    FileWriter fw;
    BufferedWriter bw;
    FileReader fr;
    BufferedReader br;

    /**
     * @param carnets
     * COLOCAMOS EN carnets LOS ELEMNTOS QUE SE PASEN POR PARAMETRO
     */
    public ExportarCarnets2CVS(ArrayList<CarnetCruzRoja> carnets){

        this.carnets = carnets;
    }

    /**
     * LEEMOS EL FICHERO .csv
     */
    public void mostrarCsv(){
        try {
            String linea;
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            while ((linea = br.readLine())!= null){
                System.out.println(linea);
            }
        } catch (FileNotFoundException e1) {
            System.out.println("Error: El fichero no existe. ");
        } catch (EOFException e) {

        } catch (IOException e1) {
            System.out.println("Error: Fallo en la lectura del fichero. ");
        }catch (NullPointerException e) {
            System.out.println("No apunta a ningun Objeto");
        }

    }

    /**
     * ESTE METODO RECORRE EL ArrayList Y ESCRIBE EN EL FICHERO .csv
     */
    public void escribirArrayList(){
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            for (int x = 0 ; x < carnets.size(); x++)
            {
                bw.write(carnets.get(x).toString());
                bw.newLine();
                bw.flush();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Error: Fallo en la escritura del fichero. ");
        }catch (NullPointerException e) {
            System.out.println("No apunta a ningun Objeto");
        }
    }

    /**
     * ESTE METODO FUNCIONABA, QUE CUANDO INTRODUCIAS UN ELEMENTO AL FICHERO .csv SE AGREGARA SOLO ESE ELEMNTO
     */

    public void escribir(CarnetCruzRoja carnetCruzRoja){
        try {
            fw = new FileWriter(file, true);
            bw = new BufferedWriter(fw);
            String cvs = carnetCruzRoja.toString();
            bw.write(cvs, 0, cvs.length());
            bw.newLine();
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.println("Error: Fallo en la escritura del fichero. ");
        }catch (NullPointerException e) {
            System.out.println("No apunta a ningun Objeto");
        }
    }
}

