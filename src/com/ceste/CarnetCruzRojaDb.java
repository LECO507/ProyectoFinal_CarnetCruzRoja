package com.ceste;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by leco2_000 on 17/5/2016.
 */
public class CarnetCruzRojaDb {
    private ArrayList<CarnetCruzRoja> carnets; // Colección de carnets
    private String fichero; // nombre de fichero donde se guardan los carnets

    public CarnetCruzRojaDb(ArrayList carnets, String fichero) {
        this.carnets = carnets;
        this.fichero = fichero;
    }
    /**
     * Abre el fichero en modo lectura y carga sus datos en la variable carnets
     * Debes usar flujos de objetos (ObjectInputStream)
     */
    public void cargar() throws ClassNotFoundException {
        try {

            FileInputStream fis = new FileInputStream(fichero);
            ObjectInputStream ois = new ObjectInputStream(fis);
            CarnetCruzRoja leido = null;
            while ((leido=(CarnetCruzRoja)ois.readObject())!=null)
            {
                System.out.println(leido);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (EOFException e) {

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        // Completa
    }
    /**
     * Abre el fichero en modo escritura y vuelca en el contenido del atributo carnets
     * Debes usar flujos de objetos (ObjectOutputStream)
     */
    public void guardar() {
        try {
            FileOutputStream fos = new FileOutputStream(fichero);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (int x = 0 ; x < carnets.size() ; x++) {
                oos.writeObject(carnets.get(x));
            }
            oos.flush();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Completa
    }

    public void addCarnet (CarnetCruzRoja carnet){
        Scanner lee = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nom = lee.nextLine();
        carnet.setNombre(nom);
        System.out.println("Apellido: ");
        String ape = lee.nextLine();
        carnet.setApellido(ape);
        System.out.println("Dni: ");
        String dni = lee.nextLine();
        carnet.setDni(dni);
        System.out.println("Provincia: ");
        String pro = lee.nextLine();
        carnet.setProvincia(pro);
        System.out.println("Localidad: ");
        String loc = lee.nextLine();
        carnet.setLocalidad(loc);
        System.out.println("Servicio: ");
        String ser = lee.nextLine();
        carnet.setServicio(ser);
        System.out.println("Caducidad: ");
        String cad = lee.nextLine();
        carnet.setCaducidad(cad);
        carnets.add(carnet);
    }
    
}
