
package br.com.biogranja.model;

import javax.swing.JOptionPane;

public class GalinheiroCorte {
    int idGalinheiro;
    AveCorte listaAves[];
    double qtdRacao;
    int ultimaave=0;

    public GalinheiroCorte(int idGalinheiro) {
        this.idGalinheiro = idGalinheiro;
    }

    public int getIdGalinheiro() {
        return idGalinheiro;
    }

    public void setIdGalinheiro(int idGalinheiro) {
        this.idGalinheiro = idGalinheiro;
    }

    public String getListaAves() {
        return listaAves.toString();
    }

    public void setListaAves(AveCorte[] listaAves) {
        this.listaAves = listaAves;
    }
    
    public void addAve(AveCorte ave){
        listaAves[ultimaave]=ave;
        ultimaave++;
    }
    
    public AveCorte abaterAve(int id) {
          AveCorte ave=null;
        if(listaAves[id].getPeso()<3.100){
            JOptionPane.showMessageDialog(null, "Ave n�o tem peso suficiente!");
        }else {
            ave=listaAves[id];
            for (int x=id+1;x<ultimaave;x++){
                listaAves[x-1]=listaAves[x];
            }
            listaAves[ultimaave-1]=null;
            ultimaave--; 
        }  
        return ave;
    }
    
    public String listarAvesAbate(){
        String s="";
        int x=0;
        while(listaAves[x]!=null){
            if(listaAves[x].getPeso()>=3){
                s+=listaAves[x].toString()+"\n";
            }
            x++;
        }
        if(s.equals("")){
            s+="N�o existem aves para o abate";
        }
        return s;
    }
    
    public double getQtdRacao() {
        return qtdRacao;
    }

    public void setQtdRacao(double qtdRacao) {
        this.qtdRacao = qtdRacao;
        }
    
    public void alimentar(){
        if(qtdRacao==0){
            JOptionPane.showMessageDialog(null, "N�o h� ra��o!");
        } else {
        double qtdcada=this.qtdRacao/(ultimaave);
        
        for (int x=0;x<ultimaave;x++){
            listaAves[x].setPeso((qtdcada*0.40));
        }
        this.qtdRacao=0;
            }
        }
    
    @Override
    public String toString() {
        return "Galinheiro id:" + this.getIdGalinheiro() + ", listaAves=" + this.getListaAves() + ", qtdRacao=" + this.getQtdRacao() + '}';
    } 
}
