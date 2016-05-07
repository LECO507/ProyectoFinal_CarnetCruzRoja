package com.ceste;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by leco2_000 on 27/4/2016.
 */
public class CarnetCruzRoja implements Comparable<CarnetCruzRoja>{
    private String nombre;
    private String apellido;
    String dni;
    private String provincia;
    private String localidad;
    private String servicio;
    private String caducidad;

    public CarnetCruzRoja(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getServicio() {
        return servicio;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public String toString() {
        return nombre + "\t" + apellido + "\t" + dni + "\t" + provincia + "\t" + localidad + "\t" + servicio + "\t" + caducidad;
    }

    @Override
    public int compareTo(CarnetCruzRoja o) {
        int ape = apellido.compareTo(o.apellido);
        return (ape != 0 ? ape : nombre.compareTo(o.nombre));
    }

    public Comparator<CarnetCruzRoja> cruzRojaComparator = new Comparator<CarnetCruzRoja>() {
        @Override
        public int compare(CarnetCruzRoja o1, CarnetCruzRoja o2) {
            return (o1).dni.compareTo((o2).dni);
        }
    };

}





