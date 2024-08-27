/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.moduloprincipal;

/**
 *
 * @author oe
 */
public class AnalisisSangre {
    private Muestras muestra;
    private Laboratorio laboratorio;
    private String resultados;

    public AnalisisSangre(Muestras muestra, Laboratorio laboratorio, String resultados) {
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
    
     public void hemogramaCompleto() {
        System.out.println("Realizando hemograma completo en " + laboratorio.getNombrePersonal());
        resultados = "Resultados del hemograma completo";
    }

    public void perfilLipidico() {
        System.out.println("Realizando perfil lipídico en " + laboratorio.getNombrePersonal());
        resultados = "Resultados del perfil lipídico";
    }

    public void funcionHepatica() {
        System.out.println("Realizando función hepática en " + laboratorio.getNombrePersonal());
        resultados = "Resultados de la función hepática";
    }   
}
