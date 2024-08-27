/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.moduloprincipal;

/**
 *
 * @author oe
 */
public class AnalisisHeces {
    private Muestras muestra;
    private Laboratorio laboratorio;
    private String resultados;

    public AnalisisHeces(Muestras muestra, Laboratorio laboratorio, String resultados) {
        this.muestra = muestra;
        this.laboratorio = laboratorio;
        this.resultados = resultados;
    }

    public Muestras getMuestra() {
        return muestra;
    }

    public void setMuestra(Muestras muestra) {
        this.muestra = muestra;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getResultados() {
        return resultados;
    }

    public void setResultados(String resultados) {
        this.resultados = resultados;
    }
    
    public void coprocultivo() {
        System.out.println("Realizando coprocultivo en " + laboratorio.getNombrePersonal());
        resultados = "Resultado del coprocultivo";
    }

    public void examenParasitos() {
        System.out.println("Realizando examen de parásitos en " + laboratorio.getNombrePersonal());
        resultados = "Resultado del examen de parásitos";
    }
    
}
