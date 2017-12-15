/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author JohnPeter
 */
public class Fita {
    
    private int nroSerie;
    private final int capacidadeMin = 160;

    public Fita(int nroSerie) {
        this.nroSerie = nroSerie;
    }   

    public Fita() {
    } 

    public int getNroSerie() {
        return nroSerie;
    }

    public void setNroSerie(int nroSerie) {
        this.nroSerie = nroSerie;
    }

    public int getCapacidadeMin() {
        return capacidadeMin;
    }  
}
