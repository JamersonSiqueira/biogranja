package br.com.biogranja.control;

import br.com.biogranja.model.Carga;
import java.util.ArrayList;

public class controlCarregamentos {
    
    ArrayList <Carga> cargas = new ArrayList<>();
        public ArrayList <Carga> lista()
    {
        return cargas;
    }
    
    //Métodos
    public void cadastrarCarga(Carga carga)
    {
        cargas.add(carga);
    }
    
    public boolean atualizarCarga(Carga carga)
    {
        for(int x = 0; x< cargas.size(); x++)        {
            if(cargas.get(x).getIdCarga() == carga.getIdCarga()){
                cargas.set(x,carga);
                return true;
            }         
        }
    return false;
    }
    
    public boolean removerCarga(Carga carga)
    {
        for(int x = 0; x < cargas.size(); x++)
        {
            if(cargas.get(x).getIdCarga() == carga.getIdCarga())
            {
                cargas.remove(x); return true;
            }
        }
        
        return false;
    }
    
    public Carga buscarCarga(int x)
    {
        for(int y = 0; y < cargas.size(); y++)
        {
            if(cargas.get(y).getIdCarga() == x)
            {
                return cargas.get(y);
            }
        }
        
        return null;
    }
}
