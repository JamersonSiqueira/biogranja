package br.com.biogranja.model;

import java.util.Random;

public class Aves {
    private int idAve;
    private String dest;
    private double peso;

    public static int gerarId() {
        Random random = new Random();
        return random.nextInt((999999 - 100000) + 1) + 100000;
    }
    
    public Aves(String dest, double peso) {
        this.idAve = gerarId();
        this.dest = dest;
        this.peso = peso;
    }
    
    public int getIdAve() {
        return idAve;
    }

    public void setIdAve(int idAve) {
        this.idAve = idAve;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Cod. Ave: "+idAve+", Peso: " + peso;
    }
    
    
    
}
