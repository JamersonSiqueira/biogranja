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

    public String[] getHistoricoPostura() {
        return historicoPostura;
    }

    public void adicionarHistorico(String hist) {
        historicoPostura[controlhist] = hist;
    }
    
    
}
