/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.moduloprincipal;

/**
 *
 * @author oe
 */
public class Laboratorio {
    private String nombrePersonal;
    private int id;

    public Laboratorio(String nombrePersonal, int id) {
        this.nombrePersonal = nombrePersonal;
        this.id = id;
    }

    public String getNombrePersonal() {
        return nombrePersonal;
    }

    public void setNombrePersonal(String nombrePersonal) {
        this.nombrePersonal = nombrePersonal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void analizarMuestra(Muestras muestra) {
        System.out.println("Analizando " + muestra.getTipoDeMuestra() + "...");
    }

    public void realizarInformePaciente(Paciente paciente) {
        System.out.println("Realizando informe para " + paciente.getNombre());
    }
    
    
}
