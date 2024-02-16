/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.examen1lab_salvador_macias;

import java.util.Date;

/**
 *
 * @author Apple
 */
public class tramite {

    String nombre;
    String descripcion;
    Date date;

    public tramite(String nombre, String descripcion, Date date) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.date = date;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "tramite{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", date=" + date + '}';
    }

}
