package br.com.biogranja.model;

import java.util.Random;

public class Cliente {

    int idCliente;
    String nomeCliente;
    String endereco;
    String cpf;

    public Cliente() {
    }


    public Cliente(Cliente cli) {
        this.idCliente = cli.idCliente;
        this.nomeCliente = cli.nomeCliente;
        this.endereco = cli.endereco;
        this.cpf = cli.cpf;
    }

    public Cliente(String nomeCliente, String endereco, String cpf) {
        Random random = new Random();
        this.idCliente = random.nextInt((999999 - 100000) + 1) + 100000;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    @Override
    public String toString() {
        return "ID Cliente - " + this.getIdCliente() + "\nNome - " + this.getNomeCliente()
                + "\nEndereco - " + this.getEndereco()+ "\nCPF - " + this.getCpf();
    }
}
