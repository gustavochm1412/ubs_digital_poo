package com.meu_projeto.model;

public class Paciente extends Pessoa {
    private String endereco;
    private String telefone;

    public Paciente(int id, String nome, String endereco, String telefone) {
        super(id, nome);
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
