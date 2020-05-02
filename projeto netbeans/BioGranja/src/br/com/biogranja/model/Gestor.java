package br.com.biogranja.model;

import java.util.Date;

public class Gestor {
    private int id;
    private String nome;
    private Date dataAdmissao;

    public Gestor(int id, String nome, Date dataAdmissao) {
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

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
    private void acessarControleFunc(){
        
    }
    
    private void criaGalinheiroPostura(){
        
    }
    
    private void removerGalinheiroPostura(){
        
    }
    
    private void buscarGalinheiroPostura(){
        
    }
    
    private void atualizarGalinheiroPostura(){
        
    }
    
    private void criaGalinheiroCorte(){
        
    }
    
    private void removerGalinheiroCorte(){
        
    }
    
    private void buscarGalinheiroCorte(){
        
    }
    
    private void atualizarGalinheiroCorte(){
        
    }
    
    private String relatorioGalinheiros() {
        return "a";
    }
}
