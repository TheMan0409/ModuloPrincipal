/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.moduloprincipal;

/**
 *
 * @author oe
 */
public class Muestras {
    private String tipoDeMuestra;
    private int codigo;

    public Muestras(String tipoDeMuestra, int codigo) {
        this.tipoDeMuestra = tipoDeMuestra;
        this.codigo = codigo;
    }

    public String getTipoDeMuestra() {
        return tipoDeMuestra;
    }

    public void setTipoDeMuestra(String tipoDeMuestra) {
        this.tipoDeMuestra = tipoDeMuestra;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void muestraSangre() {
        System.out.println("Tomando muestra de sangre...");
    }

    public void muestraHeces() {
        System.out.println("Tomando muestra de heces...");
    }

    public void muestraOrina() {
        System.out.println("Tomando muestra de orina...");
    }
    
    
}
