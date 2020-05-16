package br.com.biogranja.control;

import br.com.biogranja.model.Funcionario;
import java.util.ArrayList;

public class controlFuncionarios {
    
    ArrayList <Funcionario> listafunc = new ArrayList<>();
    
     public void cadastrarFuncionario(Funcionario f)
    {
        listafunc.add(f);
    }
    
    public boolean atualizarFuncionario(Funcionario f)
    {
        for(int x = 0; x< listafunc.size(); x++)        {
            if(listafunc.get(x).getId()== f.getId()){
                listafunc.set(x,f);
                return true;
            }         
        }
    return false;
    }
    
    public boolean removerFuncionario(Funcionario f)
    {
        for(int x = 0; x < listafunc.size(); x++)
        {
            if(listafunc.get(x).getId() == f.getId())
            {
                listafunc.remove(x); 
                return true;
            }
        }
        
        return false;
    }
    
    public Funcionario buscarFuncionario(int x)
    {
        for(int y = 0; y < listafunc.size(); y++)
        {   
            if(listafunc.get(y) == null){
                return null;
            }
            if(listafunc.get(y).getId() == x)
            {
                return listafunc.get(y);
            }
        }
        
        return null;
   }
    
    public String listarFuncionario(){
        String s="";
        for(int y = 0; y < listafunc.size(); y++)
        s+=listafunc.get(y).toString();    
        return s;
    }
}
