package br.com.biogranja.model;

import java.util.Date;

public class Funcionario {
    private int id;
    private String nome;
    private Date dataAdmissao;
    private String senha;
    
    public void acessarControle(){
        
    }

    public Funcionario(int id, String nome, Date dataAdmissao, String senha) {
        this.id = id;
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.senha = senha;
    }
    
    public Funcionario(Funcionario f) {
        this.id = f.id;
        this.nome = f.nome;
        this.dataAdmissao = f.dataAdmissao;
        this.senha = f.senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return "ID: "+ id + " Nome: " + nome + ", Data de Admissão: " + dataAdmissao+"\n";
    }
    
}


