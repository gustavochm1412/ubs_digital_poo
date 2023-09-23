package com.meu_projeto.model;

import com.meu_projeto.model.Paciente;
import com.meu_projeto.model.Medico;

public class ExameMedico implements AcaoMedica {
    private int id;
    private Paciente paciente;
    private Medico medico;
    private String tipoExame;
    private String resultado;

    public ExameMedico(int id, Paciente paciente, Medico medico, String tipoExame, String resultado) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.tipoExame = tipoExame;
        this.resultado = resultado;
    }

    @Override
    public void realizarAcaoMedica() {
        // Lógica para realizar um exame médico
        System.out.println("Realizando exame médico para " + paciente.getNome());
    }
}
