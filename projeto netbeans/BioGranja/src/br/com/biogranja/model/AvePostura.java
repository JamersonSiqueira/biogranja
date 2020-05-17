package br.com.biogranja.model;
public class AvePostura {
    private int idAve;
    private boolean colocandoOvo;
    private String historicoPostura[] = new String[700];
    private int controlhist = 0;

    public AvePostura(Aves ave) {
        this.idAve = ave.getIdAve();
    }

    public int getIdAve() {
        return idAve;
    }

    public void setIdAve(int idAve) {
        this.idAve = idAve;
    }

    public boolean isColocandoOvo() {
        return colocandoOvo;
    }

    public void setColocandoOvo(boolean colocandoOvo) {
        this.colocandoOvo = colocandoOvo;
    }

    public String getHistoricoPostura() {
        String s = "";
        for(int x=0;x<controlhist;x++){
            s+=historicoPostura[x]+"\n";
        }
        return s;
    }

    public void adicionarHistorico(String hist) {
        historicoPostura[controlhist] = hist+"\n";
        controlhist++;
    }
    
        @Override
    public String toString() {
        String s="";
        if(this.getHistoricoPostura()==""){
            s+="Histórico Vazio";
        } else {
           s+=this.getHistoricoPostura(); 
        }
        return "Ave: "+ idAve + ", Está pondo?: " + this.isColocandoOvo()
                +"\nHistórico postura: "+s;
    }
    
}
