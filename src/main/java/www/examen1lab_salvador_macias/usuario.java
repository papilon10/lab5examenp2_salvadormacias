/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.examen1lab_salvador_macias;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author Apple
 */
public class usuario {

    String nombre;
    String apellido;
    String contra;
    Date fecha_nacimiento;
    String sexo;
    String departamento;
    String id;

    public usuario() {
    }

    public usuario(String nombre, String apellido, String contra, Date fecha_nacimiento, String sexo, String departamento, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contra = contra;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sexo = sexo;
        this.departamento = departamento;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String identidad(String id) {
        Random r = new Random();
        String identidad, municipio;
        municipio = "";
        identidad = "";
        if (departamento.contentEquals("francisco morazan") || (departamento.contentEquals("Francisco Morazan"))) {

            int numero = r.nextInt(3);
            int n = r.nextInt(1, 28);
            int n2 = r.nextInt(1, 28);
            int n3 = r.nextInt(10000, 99999);
            identidad = "01" + n + n2 + (fecha_nacimiento.getYear() + 1900) + n3;
        } else if (departamento.contentEquals("Cortes") || (departamento.contentEquals("cortes"))) {
            int n = r.nextInt(1, 12);
            int n2 = r.nextInt(1, 12);
            int n3 = r.nextInt(10000, 99999);
            identidad = "02" + n + n2 + (fecha_nacimiento.getYear() + 1900) + n3;
        } else if (departamento.contentEquals("comayagua") || (departamento.contentEquals("Conayagua"))) {
            int n = r.nextInt(1, 21);
            int n2 = r.nextInt(1, 21);
            int n3 = r.nextInt(10000, 99999);
            identidad = "03" + n + n2 + (fecha_nacimiento.getYear() + 1900) + n3;
        }

        return identidad;

    }

    @Override
    public String toString() {
        return "usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", contra=" + contra + ", fecha_nacimiento=" + fecha_nacimiento + ", sexo=" + sexo + ", departamento=" + departamento + ", id=" + identidad(id) + '}';
    }

}
