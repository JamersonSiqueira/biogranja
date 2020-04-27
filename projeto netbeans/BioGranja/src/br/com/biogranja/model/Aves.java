package br.com.biogranja.model;
public class Aves {
    private int idAve;
    private String dest;
    private float peso;

    public Aves(int idAve, String dest, float peso) {
        this.idAve = idAve;
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

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
}
