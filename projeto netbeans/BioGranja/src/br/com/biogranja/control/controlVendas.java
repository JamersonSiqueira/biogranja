package br.com.biogranja.control;

import br.com.biogranja.model.Venda;
import java.util.ArrayList;

public class controlVendas {
    
    ArrayList <Venda> listavendas = new ArrayList<>();
    
     public void cadastrarVenda(Venda v)
    {
        listavendas.add(v);
    }
    
    public boolean atualizarVenda(Venda v)
    {
        for(int x = 0; x< listavendas.size(); x++)        {
            if(listavendas.get(x).getId()== v.getId()){
                listavendas.set(x,v);
                return true;
            }         
        }
    return false;
    }
    
    public boolean removerVenda(Venda v)
    {
        for(int x = 0; x < listavendas.size(); x++)
        {
            if(listavendas.get(x).getId() == v.getId())
            {
                listavendas.remove(x); return true;
            }
        }
        
        return false;
    }
    
    public Venda buscarVenda(int x)
    {
        for(int y = 0; y < listavendas.size(); y++)
        {
            if(listavendas.get(y).getId() == x)
            {
                return listavendas.get(y);
            }
        }
        
        return null;
   }
    
    public String listarVendas(){
        String s="";
        for(int y = 0; y < listavendas.size(); y++)
        s+=listavendas.get(y).itenstotais();    
        return s;
    }
}
