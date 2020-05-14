package br.com.biogranja.model;
public class AveCorte {
    private int idAve;
    private double peso;

    public AveCorte(Aves ave) {
        this.idAve = ave.getIdAve();
        this.peso = ave.getPeso();
    }

    public int getIdAve() {
        return idAve;
    }

    public void setIdAve(int idAve) {
        this.idAve = idAve;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Ave: "+ idAve + ", Peso: " + peso;
    }
    
}