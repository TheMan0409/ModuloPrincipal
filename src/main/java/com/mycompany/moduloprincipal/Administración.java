/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.moduloprincipal;

/**
 *
 * @author oe
 */
public class Administración {
    private String nombre;
    private int idPersonal;

    public Administración(String nombre, int idPersonal) {
        this.nombre = nombre;
        this.idPersonal = idPersonal;
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
    
    public void revisarHistorial(Paciente paciente) {
        System.out.println("Revisando el historial clínico de " + paciente.getNombre());
        // Lógica para revisar historial
    }

    public void actualizarHistorial(Paciente paciente) {
        System.out.println("Actualizando el historial clínico de " + paciente.getNombre());
     
    }

    public void revisarSintomas(Paciente paciente) {
        System.out.println("Revisando síntomas de " + paciente.getNombre());
      
    }

    public void generarBoleta() {
        System.out.println("Generando boleta...");

    }
    
}
