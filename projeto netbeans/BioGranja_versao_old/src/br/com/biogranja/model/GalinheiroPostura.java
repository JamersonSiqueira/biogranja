
package br.com.biogranja.model;

public class GalinheiroPostura {
    
    int idGalinheiro;
    AvePostura listaAves[];
    int ultimaave=0;
    int ultimogalinheiro=0;
    
    public GalinheiroPostura() {
        this.idGalinheiro = ultimogalinheiro;
        ultimogalinheiro++;
    }

    public int getIdGalinheiro() {
        return idGalinheiro;
    }

    public void setIdGalinheiro(int idGalinheiro) {
        this.idGalinheiro = idGalinheiro;
    }

    public AvePostura[] getListaAves() {
        return listaAves;
    }

    public void setListaAves(AvePostura[] listaAves) {
        this.listaAves = listaAves;
    }
    
    public void addAve(AvePostura ave){
        listaAves[ultimaave]=ave;
        ultimaave++;
    }

    public String histAve(int id){
        String s="";
        if(listaAves[id]!=null){
            s+=listaAves[id].getHistoricoPostura();
        }
        return s;
    }
    
    public void addCarga(Carga carg){
        Aves av[]=carg.getListaPostura();
        AvePostura corte;
        int x=0;
        while(av[x]!=null){
            corte=new AvePostura(av[x]);
            addAve(corte);
            x++;
            corte=null;
            }
        }
    
    public String status(){
        String s="";
        int x=0;
        while(listaAves[x]!=null){
            s+="Ave ID: "+listaAves[x].getIdAve()+" - Está pondo? "+listaAves[x].isColocandoOvo();
            x++;
        }
        return s;
    }
    
    @Override
    public String toString() {
        return "Galinheiro id:" + this.getIdGalinheiro() + ", Lista de Aves:" + this.getListaAves();
    }
}
