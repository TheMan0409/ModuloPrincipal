/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.moduloprincipal;

/**
 *
 * @author oe
 */
public class Tecnicos {
    private String nombre;
    private int idPersonal;
    private String especialidad;

    public Tecnicos(String nombre, int idPersonal, String especialidad) {
        this.nombre = nombre;
        this.idPersonal = idPersonal;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public void tomaMuestra(Muestras muestra) {
        System.out.println("Técnico " + nombre + " tomando muestra de " + muestra.getTipoDeMuestra());
    }
    
    
}
