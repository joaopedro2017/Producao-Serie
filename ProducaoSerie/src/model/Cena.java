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
public class Cena {
    
    private int duracao, id;
    private ArrayList<Fita> fitas;
    private ArrayList<Tomada> tomadas;
    private Tomada tomadaAprovada;

    public Cena(int duracao, int id) {
        fitas = new ArrayList<>();
        tomadas = new ArrayList<>();
        this.duracao = duracao;
        this.id = id;
        this.tomadaAprovada = tomadaAprovada;
    }

    public Cena() {
        this(0, 0);
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Fita> getFitas() {
        return fitas;
    }

    public void setFitas(ArrayList<Fita> fitas) {
        this.fitas = fitas;
    }

    public ArrayList<Tomada> getTomadas() {
        return tomadas;
    }

    public void setTomadas(ArrayList<Tomada> tomadas) {
        this.tomadas = tomadas;
    }

    public Tomada getTomadaAprovada() {
        return tomadaAprovada;
    }

    public void setTomadaAprovada(Tomada tomadaAprovada) {
        this.tomadaAprovada = tomadaAprovada;
    }   
}
