package br.com.biogranja.control;

import br.com.biogranja.model.Cliente;
import java.util.ArrayList;

public class controlClientes {
    
    ArrayList <Cliente> listacli = new ArrayList<>();

     public void cadastrarCliente(Cliente f)
    {
        listacli.add(f);
    }
    
    public boolean atualizarCliente(Cliente f)
    {
        for(int x = 0; x< listacli.size(); x++)        {
            if(listacli.get(x).getIdCliente()== f.getIdCliente()){
                listacli.set(x,f);
                return true;
            }         
        }
    return false;
    }
    
    public boolean removerCliente(Cliente f)
    {
        for(int x = 0; x < listacli.size(); x++)
        {
            if(listacli.get(x).getIdCliente() == f.getIdCliente())
            {
                listacli.remove(x); return true;
            }
        }
        
        return false;
    }
    
    public Cliente buscarCliente(String x)
    {
        for(int y = 0; y < listacli.size(); y++)
        {
            if(listacli.get(y).getCpf().equals(x))
            {
                return listacli.get(y);
            }
        }
        
        return null;
   }
}
