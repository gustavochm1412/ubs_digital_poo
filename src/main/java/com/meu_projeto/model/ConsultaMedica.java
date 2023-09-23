package com.meu_projeto.model;

import com.meu_projeto.model.Paciente;
import com.meu_projeto.model.Medico;

public class ConsultaMedica implements AcaoMedica {
    private int id;
    private Paciente paciente;
    private Medico medico;
    private String sintomas;
    private String observacoes;

    public ConsultaMedica(int id, Paciente paciente, Medico medico, String sintomas, String observacoes) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.sintomas = sintomas;
        this.observacoes = observacoes;
    }

    @Override
    public void realizarAcaoMedica() {
        // Lógica para realizar uma consulta médica
        System.out.println("Realizando consulta médica para " + paciente.getNome());
    }
}
