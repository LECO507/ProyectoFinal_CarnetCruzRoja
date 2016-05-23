package com.ceste;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by leco2_000 on 17/5/2016.
 */
public class CarnetCruzRojaDb {
    /**
     * LLAMAMOS A LA COLECCION DE CARNETS
     * EN fichero COLOCAMOS LA RUTA DONDE SE CREARA NUESTRO FICHERO .ser
     * CREAMOS LAS VARIABLES GLOBALES
     */
    private final ArrayList<CarnetCruzRoja> carnets;
    private String fichero = "C:\\Users\\leco2_000\\Desktop\\CESTE\\2año\\Programacion\\ProyectoFinal\\CarnetCruzRoja.ser";
    File file = new File(fichero);
    FileOutputStream fos;
    ObjectOutputStream oos;
    FileInputStream fis;
    ObjectInputStream ois;

    /**
     * @param carnets
     * COLOCAMOS EN carnets LOS ELEMNTOS QUE SE PASEN POR PARAMETRO
     */

    public CarnetCruzRojaDb(ArrayList<CarnetCruzRoja> carnets) {
        this.carnets = carnets;
    }


    /**
     * LEEMOS EL FICHERO .ser
     */
    public void mostrarSer(){
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            CarnetCruzRoja linea = null;
            while ((linea = (CarnetCruzRoja) ois.readObject()) != null) {
                System.out.println(linea);
            }
            ois.close();

        } catch (FileNotFoundException e1) {
            System.out.println("Error: El fichero no existe. ");
        } catch (EOFException e) {

        } catch (IOException e1) {
            System.out.println("Error: Fallo en la lectura del fichero. ");
        } catch (ClassNotFoundException e) {
            System.out.println("No se pudo acceder a la clase adecuada para revertir la Serializacion al leer del fichero.");
        }
    }


    /**
     * ESTE METODO RECORRE EL ArrayList Y ESCRIBE EN EL FICHERO  .csv
     */
    public void escribirArrayList(){
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            for (int x = 0 ; x < carnets.size(); x++)
            {
                oos.writeObject(carnets.get(x));
                oos.flush();
            }

            oos.close();


        } catch (IOException e) {
            System.out.println("Error: Fallo en la escritura del fichero. ");
        }
    }


    /**
     * ESTE METODO FUNCIONABA, QUE CUANDO INTRODUCIAS UN ELEMENTO AL FICHERO .csv SE AGREGARA SOLO ESE ELEMNTO
     * PERO TENIA UN PEQUEÑO PROBLEMA AL LEERLO
     */


    public void escribir(CarnetCruzRoja carnetCruzRoja){
        try {
            fos = new FileOutputStream(file, true);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(carnetCruzRoja);
            oos.flush();
            oos.close();

        } catch (IOException e) {
            System.out.println("Error: Fallo en la escritura del fichero. ");
        }
    }

    public CarnetCruzRoja get(int indice){
        return carnets.get(indice);
    }

}




