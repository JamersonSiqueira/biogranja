
package br.com.biogranja.model;

public class GalinheiroPostura {
    
    int idGalinheiro;
    AvePostura listaAves[] = new AvePostura[700];
    int ultimaave=0;
    int qtdOvos=0;
    
    public GalinheiroPostura(int id) {
        this.idGalinheiro = id;
    }

    public int getQtdOvos() {
        return qtdOvos;
    }

    public void setQtdOvos(int qtdOvos) {
        this.qtdOvos = qtdOvos;
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
            s+="ID: "+listaAves[id].getIdAve()+"\n"+listaAves[id].getHistoricoPostura();
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
    
    public String listarAves(){
        String s="";
        int x=0;
        while(listaAves[x]!=null){
            s+="\n";
            s+=listaAves[x].toString();
            x++;
        }
        if(s.equals("")){
            s+="N�o existem aves";
        }
        return s;
    }
    
    public String status(){
        String s="";
        int x=0;
        while(listaAves[x]!=null){
            s+="Ave ID: "+listaAves[x].getIdAve()+" - Est� pondo? "+listaAves[x].isColocandoOvo();
            x++;
        }
        return s;
    }

    public int getUltimaave() {
        return ultimaave;
    }
    

    @Override
    public String toString() {
        return "----------------------------------------\n"
                + "Galinheiro id:" + this.getIdGalinheiro() + 
                "\nLista de aves:" + this.listarAves() + "\nQuantidade total de Ovos: " + this.getQtdOvos();
    } 
}
