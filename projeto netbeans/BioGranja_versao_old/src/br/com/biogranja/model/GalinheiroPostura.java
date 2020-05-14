
package br.com.biogranja.model;

public class GalinheiroPostura {
    
    int idGalinheiro;
    String listaAves;
    boolean aveSelecionada;
    
    public GalinheiroPostura(){
        
    }
    public GalinheiroPostura(int idGalinheiro, String listaAves, boolean aveSelecionada) {
        this.idGalinheiro = idGalinheiro;
        this.listaAves = listaAves;
        this.aveSelecionada = aveSelecionada;
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

    public boolean getAveSelecionada() {
        return aveSelecionada;
    }

    public void setAveSelecionada(boolean aveSelecionada) {
        this.aveSelecionada = aveSelecionada;
    }

    @Override
    public String toString() {
        return "GalinheiroPostura{" + "idGalinheiro=" + this.getListaAves() + ", listaAves=" + this.getListaAves() + ", aveSelecionada=" + this.getIdGalinheiro()+ '}';
    }
    
   
}
