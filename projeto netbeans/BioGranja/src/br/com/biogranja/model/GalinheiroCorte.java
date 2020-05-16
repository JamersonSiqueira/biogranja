
package br.com.biogranja.model;

import javax.swing.JOptionPane;

public class GalinheiroCorte {
    int idGalinheiro;
    AveCorte listaAves[]= new AveCorte[700];
    double qtdRacao;
    int ultimaave=0;

    public GalinheiroCorte(int id) {
        this.idGalinheiro = id;
    }

    public int getIdGalinheiro() {
        return idGalinheiro;
    }

    public void setIdGalinheiro(int idGalinheiro) {
        this.idGalinheiro = idGalinheiro;
    }

    public AveCorte[] getListaAves() {
        return listaAves;
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
        for(int z=0;z<ultimaave;z++){
            if(listaAves[z].getIdAve()==id){
                if(listaAves[z].getPeso()<3.100){
            JOptionPane.showMessageDialog(null, "Ave não tem peso suficiente!");
        }else {
            ave=listaAves[z];
            for (int x=z+1;x<ultimaave;x++){
                listaAves[x-1]=listaAves[x];
            }
            listaAves[ultimaave-1]=null;
            ultimaave--; 
                }  
            }
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
            s+="Não existem aves para o abate";
        }
        return s;
    }
    
    public String listarAves(){
        String s="";
        int x=0;
        while(listaAves[x]!=null){
            s+="\n";
            s+=listaAves[x].toString();
            x++;
        }
        if(s.equals("")){
            s+="Não existem aves";
        }
        return s;
    }
    
    public double getQtdRacao() {
        return qtdRacao;
    }

    public void setQtdRacao(double qtdRacao) {
        this.qtdRacao =+ qtdRacao;
        }
    
    public void alimentar(){
        if(qtdRacao==0){
            JOptionPane.showMessageDialog(null, "Não há ração!");
        } else {
        double qtdcada=this.qtdRacao/(ultimaave);
        
        for (int x=0;x<ultimaave;x++){
            listaAves[x].setPeso((qtdcada*0.40));
        }
        this.qtdRacao=0;
            }
        }
    
    public void addCarga(Carga carg){
        Aves av[]=carg.getListaCorte();
        AveCorte corte;
        int x=0;
        while(av[x]!=null){
            corte=new AveCorte(av[x]);
            addAve(corte);
            x++;
            corte=null;
        }
    }
    
    @Override
    public String toString() {
        return "----------------------------------------\n"
                + "Galinheiro id:" + this.getIdGalinheiro() + 
                "\nLista de aves:" + this.listarAves() + "\nQuantidade de Ração: " + this.getQtdRacao();
    } 
}
