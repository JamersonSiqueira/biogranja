package br.com.biogranja.model;

public class Cliente {

    int idCliente;
    String nomeCliente;
    String endereco;
    int cpf;


    public Cliente() {
    }

    public Cliente(int idCliente, String nomeCliente, String endereco, int cpf) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.cpf = cpf;

    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereço(String endereco) {
        this.endereco = endereco;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    
    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + this.getIdCliente() + ", nomeCliente=" + this.getNomeCliente() + ", endereco=" + this.getEndereco() + ", cpf=" + this.getCpf() + '}';
    }
}
