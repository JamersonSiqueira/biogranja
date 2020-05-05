
package br.com.biogranja.model;

public class Venda {
  String listaAvesVendas;
  int qtdOvos;
  String Cliente;
  String dadosPagos;
  
  public Venda(){
      
  }

    public Venda(String listaAvesVendas, int qtdOvos, String Cliente, String dadosPagos) {
        this.listaAvesVendas = listaAvesVendas;
        this.qtdOvos = qtdOvos;
        this.Cliente = Cliente;
        this.dadosPagos = dadosPagos;
    }

    public String getListaAvesVendas() {
        return listaAvesVendas;
    }

    public void setListaAvesVendas(String listaAvesVendas) {
        this.listaAvesVendas = listaAvesVendas;
    }

    public int getQtdOvos() {
        return qtdOvos;
    }

    public void setQtdOvos(int qtdOvos) {
        this.qtdOvos = qtdOvos;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getDadosPagos() {
        return dadosPagos;
    }

    public void setDadosPagos(String dadosPagos) {
        this.dadosPagos = dadosPagos;
    }

    @Override
    public String toString() {
        return "Venda{" + "listaAvesVendas=" + this.getListaAvesVendas() + ", qtdOvos=" + this.getQtdOvos() + ", Cliente=" + this.getCliente() + ", dadosPagos=" + this.getDadosPagos() + '}';
    }
  
    
}
