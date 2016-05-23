package com.ceste;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by leco2_000 on 27/4/2016.
 */
public class CarnetCruzRoja implements Comparable<CarnetCruzRoja>, Serializable {
    /**
     * VARIABLES DE TIPO PRIVATE PARA QUE SOLO SE PUEDAN ACCEDER A ELLA DESDE SU MISMA CLASE
     */
    private String nombre;
    private String apellido;
    private String dni;
    private String provincia;
    private String localidad;
    private String servicio;
    private String caducidad;

    /**
     * @param i COLOCAMOS UNA VARIABLE ENTERA PARA PODER QUE LOS CARNETS QUE SE REGISTREN SE ACTUALISEN Y NO SEA EL MISMO CARNET QUE INTRODUCIMOS
     */
    public CarnetCruzRoja(int i) {
        i++;

    }


    /**
     * METODOS MUTTATOR Y ACCESOR
     * set PARA TOMAR VALORES DESDE OTRA CLASE Y ASIGNARLAS A LA VARIABLE PRIVADA
     * get PODER TOMAR LOS VALORES DE LA VARIABLE PRIVADA, EN OTRA CLASE
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getServicio() {
        return servicio;
    }


    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }


    public Date getCaducidad() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha = sdf.parse(caducidad);
        return fecha;
    }

    public void datos() {
        Scanner lee = new Scanner(System.in);
        System.out.println("Nombre: ");
        nombre = lee.nextLine();
        System.out.println("Apellido: ");
        apellido = lee.nextLine();
        System.out.println("Dni: ");
        dni = lee.nextLine();
        System.out.println("Provincia: ");
        provincia = lee.nextLine();
        System.out.println("Localidad: ");
        localidad = lee.nextLine();
        System.out.println("Servicio: ");
        servicio = lee.nextLine();
        System.out.println("Caducidad: ");
        caducidad = lee.nextLine();
    }

    public void mostrarArrayList(ArrayList<CarnetCruzRoja> arrayList) {
        for (Iterator<CarnetCruzRoja> iter = arrayList.iterator(); iter.hasNext(); ) {
            CarnetCruzRoja array = iter.next();
            System.out.println(array.toString());
        }
    }

    public void mostrarHashSet(Set<CarnetCruzRoja> set) {
        for (Iterator<CarnetCruzRoja> iter = set.iterator(); iter.hasNext(); ) {
            CarnetCruzRoja hSet = iter.next();
            System.out.println(hSet.toString());
        }
    }

    @Override
    public int compareTo(CarnetCruzRoja o) {
        int ape = apellido.compareTo(o.apellido);
        return (ape != 0 ? ape : nombre.compareTo(o.nombre));
    }

    public void mostrarApelldio(Set<CarnetCruzRoja> setApellido) {
        for (Iterator<CarnetCruzRoja> iter = setApellido.iterator(); iter.hasNext(); ) {
            CarnetCruzRoja apellido = iter.next();

            System.out.println(apellido.apeTotring());
        }
    }

    public String dnitoString() {
        return dni + "\t" + nombre + "\t" + apellido + "\t" + provincia + "\t" + localidad + "\t" + servicio + "\t" + caducidad;
    }

    public String apeTotring() {
        return apellido + "\t" + nombre + "\t" + dni + "\t" + provincia + "\t" + localidad + "\t" + servicio + "\t" + caducidad;
    }

    public String toString() {
        return nombre + "\t" + apellido + "\t" + dni + "\t" + provincia + "\t" + localidad + "\t" + servicio + "\t" + caducidad;
    }

    public String fechaToString() {
        return caducidad + "\t" + nombre + "\t" + apellido + "\t" + dni + "\t" + provincia + "\t" + localidad + "\t" + servicio;
    }
}





