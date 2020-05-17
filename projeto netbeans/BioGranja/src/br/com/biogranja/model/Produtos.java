package br.com.biogranja.model;

import java.util.ArrayList;

public class Produtos {
  
    ArrayList <AveCorte> listaAves = new ArrayList<>();
    int qtdOvos=0;
    double total;

    public int getListaAves() {
        return listaAves.size();
    }

    public void addListaAves(AveCorte ave) {
        listaAves.add(ave);
    }

    public int getQtdOvos() {
        return qtdOvos;
    }

    public void addQtdOvos(int qtdOvos) {
        this.qtdOvos += qtdOvos;
    }

    public String listarAves(){
        String s="";
        for (int x=0;x<this.listaAves.size();x++){
            s+=this.listaAves.get(x).toString();
        }
        return s;
    }
    
    public double attValor(){
        double valor=0;
        for (int i=0;i<listaAves.size();i++){
            valor += listaAves.get(i).getPeso()*6;
        }
        valor += (qtdOvos*0.33);
        this.total=valor;
        return total;
    }
    
}
