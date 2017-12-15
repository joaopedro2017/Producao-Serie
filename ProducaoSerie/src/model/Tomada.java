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
public class Tomada {
    
    private Cena cena;
    private int id;

    public Tomada() {
    }

    public Tomada(Cena cena, int id) {
        this.cena = cena;
        this.id = id;
    }   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cena getCena() {
        return cena;
    }

    public void setCena(Cena cena) {
        this.cena = cena;
    }   
}
