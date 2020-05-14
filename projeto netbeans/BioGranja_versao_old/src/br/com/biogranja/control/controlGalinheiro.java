package br.com.biogranja.control;

import br.com.biogranja.model.GalinheiroCorte;
import br.com.biogranja.model.GalinheiroPostura;
import java.util.ArrayList;

public class controlGalinheiro {
    
  ArrayList<GalinheiroCorte> listacorte = new ArrayList<>();
  ArrayList<GalinheiroPostura> listapostura = new ArrayList<>();
  
  
  public void cadastrarCorte(GalinheiroCorte gal)
    {
        listacorte.add(gal);
    }
  
  public void cadastrarPostura(GalinheiroPostura gal)
    {
        listapostura.add(gal);
    }
    
    public boolean atualizarCorte(GalinheiroCorte gal)
    {
        for(int x = 0; x< listacorte.size(); x++)        {
            if(listacorte.get(x).getIdGalinheiro()== gal.getIdGalinheiro()){
                listacorte.set(x,gal);
                return true;
            }         
        }
    return false;
    }
    
    public boolean atualizarPostura(GalinheiroPostura gal)
    {
        for(int x = 0; x< listapostura.size(); x++)        {
            if(listapostura.get(x).getIdGalinheiro()== gal.getIdGalinheiro()){
                listapostura.set(x,gal);
                return true;
            }         
        }
    return false;
    }
    
    public boolean removerCorte(GalinheiroCorte gal)
    {
        for(int x = 0; x < listacorte.size(); x++)
        {
            if(listacorte.get(x).getIdGalinheiro() == gal.getIdGalinheiro())
            {
                listacorte.remove(x); return true;
            }
        }
        
        return false;
    }
    
    public boolean removerPostura(GalinheiroPostura gal)
    {
        for(int x = 0; x < listapostura.size(); x++)
        {
            if(listapostura.get(x).getIdGalinheiro() == gal.getIdGalinheiro())
            {
                listapostura.remove(x); return true;
            }
        }
        
        return false;
    }
    
    public GalinheiroCorte buscarCorte(int x)
    {
        for(int y = 0; y < listacorte.size(); y++)
        {
            if(listacorte.get(y).getIdGalinheiro() == x)
            {
                return listacorte.get(y);
            }
        }
        
        return null;
   }
    
    public GalinheiroPostura buscarPostura(int x)
    {
        for(int y = 0; y < listapostura.size(); y++)
        {
            if(listapostura.get(y).getIdGalinheiro() == x)
            {
                return listapostura.get(y);
            }
        }
        
        return null;
   }
}
