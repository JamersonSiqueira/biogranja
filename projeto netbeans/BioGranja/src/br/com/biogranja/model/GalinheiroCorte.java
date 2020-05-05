
package br.com.biogranja.model;

public class GalinheiroCorte {
    int idGalinheiro;
    String listaAves;
    double qtdRacao;
    
    public GalinheiroCorte(){
        
    }
    public GalinheiroCorte(int idGalinheiro, String listaAves, double qtdRacao) {
        this.idGalinheiro = idGalinheiro;
        this.listaAves = listaAves;
        this.qtdRacao = qtdRacao;
    }

    public int getIdGalinheiro() {
        return idGalinheiro;
    }

    public void setIdGalinheiro(int idGalinheiro) {
        this.idGalinheiro = idGalinheiro;
    }

    public String getListaAves() {
        return listaAves;
    }

    public void setListaAves(String listaAves) {
        this.listaAves = listaAves;
    }

    public double getQtdRacao() {
        return qtdRacao;
    }

    public void setQtdRacao(double qtdRacao) {
        this.qtdRacao = qtdRacao;
    }

    @Override
    public String toString() {
        return "GalinheiroCorte{" + "idGalinheiro=" + this.getIdGalinheiro() + ", listaAves=" + this.getListaAves() + ", qtdRacao=" + this.getQtdRacao() + '}';
    }
    
    
    
}
