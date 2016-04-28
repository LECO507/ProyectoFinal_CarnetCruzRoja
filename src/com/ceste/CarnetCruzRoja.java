package com.ceste;

/**
 * Created by leco2_000 on 27/4/2016.
 */
public class CarnetCruzRoja{
    private String nombre;
    private String apellido;
    private String dni;
    private String provincia;
    private String localidad;
    private String servicio;
    private String caducidad;

    public CarnetCruzRoja(String dni){
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return caducidad;
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

    public String toString(){
        return nombre+" "+apellido+" "+dni+"\n"+provincia+", "+localidad+"\n"+servicio+"\n"+caducidad;
    }
}


