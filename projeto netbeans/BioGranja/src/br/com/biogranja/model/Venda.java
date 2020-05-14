package br.com.biogranja.model;

import java.util.Random;

public class Venda {
  int id;
  Produtos prod;
  Cliente cli;
  String dadosCartao;
  String endereco;
  double valor;
  
  public Venda(Produtos p,Cliente c,String cartao, String end){
      Random random = new Random();
      this.id= random.nextInt((999999 - 100000) + 1) + 100000;
      this.prod=p;
      this.cli = c;
      this.dadosCartao=cartao;
      this.endereco=end;
      
      this.valor=(prod.attValor()+10);
  }

    public int getId() {
        return id;
    }
    
      public String itenstotais(){
        String s=this.prod.listarAves();
        s+="------------------------------------------------------------"
                + "\nQtd ovos:"+this.prod.getQtdOvos();
        s+="------------------------------------------------------------"
                + "\nFrete Fixo: R$10,00 |  Total: R$"+this.valor;
        return s;
    }

    public Produtos getProd() {
        return prod;
    }

    public void setProd(Produtos prod) {
        this.prod = prod;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public String getDadosCartao() {
        return dadosCartao;
    }

    public void setDadosCartao(String dadosCartao) {
        this.dadosCartao = dadosCartao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
