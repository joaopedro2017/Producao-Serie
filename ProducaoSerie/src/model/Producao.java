/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author JohnPeter
 */
public class Producao {
    
    private double verba;
    private ArrayList<Cena> cenas;
    private ArrayList<Registro> registros;

    public Producao(double verba) {
        registros = new ArrayList<>();
        cenas = new ArrayList<>();
        this.verba = verba;        
    }

    public double getVerba() {
        return verba;
    }

    public void setVerba(double verba) {
        this.verba = verba;
    }

    public ArrayList<Cena> getCenas() {
        return cenas;
    }

    public void setCenas(ArrayList<Cena> cenas) {
        this.cenas = cenas;
    }

    public ArrayList<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(ArrayList<Registro> registros) {
        this.registros = registros;
    }   
}
