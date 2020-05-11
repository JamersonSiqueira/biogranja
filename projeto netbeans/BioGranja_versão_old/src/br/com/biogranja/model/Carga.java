package br.com.biogranja.model;

import java.util.Date;
import br.com.biogranja.model.Aves;

public class Carga {
    private int idCarga;
    private int ultimocorte=0;
    private int ultimopostura=0;
    private Aves[] listaCorte = new Aves[60];
    private Aves[] listaPostura = new Aves[60];
    private Date dataRecebida;

    public Carga(int idCarga, Date dataRecebida) {
        this.idCarga = idCarga;
        this.dataRecebida = dataRecebida;
    }

    public int getIdCarga() {
        return idCarga;
    }

    public void setIdCarga(int idCarga) {
        this.idCarga = idCarga;
    }

    public Aves[] getListaCorte() {
        return listaCorte;
    }

    public void setListaCorte(Aves[] listaCorte) {
        this.listaCorte = listaCorte;
    }

    public Aves[] getListaPostura() {
        return listaPostura;
    }

    public void setListaPostura(Aves[] listaPostura) {
        this.listaPostura = listaPostura;
    }

    public Date getDataRecebida() {
        return dataRecebida;
    }

    public void setDataRecebida(Date dataRecebida) {
        this.dataRecebida = dataRecebida;
    }
            
    public void addListaCorte(Aves ave) {
        listaCorte[ultimocorte]=ave;
        ultimocorte++;
    }    

    public void addListaPostura(Aves ave) {
        listaPostura[ultimopostura]=ave;
        ultimopostura++;
    }      
}
