
package br.com.biogranja.model;

public class Produtos {
    
    int id;
    String nome;
    String dataAdmissao;
    
    public Produtos(){
        
    }
    public Produtos(int id, String nome, String dataAdmissao) {
        this.id = id;
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return "Produtos{" + "id=" + this.getId()+ ", nome=" + this.getNome() + ", dataAdmissao=" + this.getDataAdmissao() + '}';
    }
    
    
}
