/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dinosauios;


import model.Dinosaurio;
/**
 *
 * @author Usuario
 */
public class Dinosaurios {

    private String id;
    private String tipo;
    private String alimentacion;
    private String nombre;

    @Override
    public String toString() {
        return "Dinosaurios{" + "id=" + id + ", tipo=" + tipo + ", alimentacion=" + alimentacion + ", nombre=" + nombre + '}';
    }

    public Dinosaurios(String id, String tipo, String alimentacion, String nombre) {
        this.id = id;
        this.tipo = tipo;
        this.alimentacion = alimentacion;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
