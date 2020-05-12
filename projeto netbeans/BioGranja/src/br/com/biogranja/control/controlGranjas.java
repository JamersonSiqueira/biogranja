package br.com.biogranja.control;

import br.com.biogranja.model.AveCorte;
import br.com.biogranja.model.GalinheiroCorte;
import br.com.biogranja.model.GalinheiroPostura;
import java.util.ArrayList;

public class controlGranjas {
  ArrayList<GalinheiroCorte> listacorte = new ArrayList<>();
  ArrayList<GalinheiroPostura> listapostura = new ArrayList<>();
  
  public ArrayList granjasCorte(){
      return listacorte;
  }
  
}
