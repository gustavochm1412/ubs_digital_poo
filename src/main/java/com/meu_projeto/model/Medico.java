package com.meu_projeto.model;

public class Medico extends Pessoa {
    private String especialidade;
    private String crm;

    public Medico(int id, String nome, String especialidade, String crm) {
        super(id, nome);
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}
