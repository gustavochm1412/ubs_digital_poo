package com.meu_projeto.model;

import com.meu_projeto.model.AcaoMedica;
import com.meu_projeto.model.ConsultaMedica;
import com.meu_projeto.model.ExameMedico;
import com.meu_projeto.model.Paciente;
import com.meu_projeto.model.Medico;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente(1, "João", "Rua ABC, 123", "1234567890");
        Medico medico = new Medico(101, "Dr. Smith", "Cardiologista", "12345");

        ConsultaMedica consulta = new ConsultaMedica(1001, paciente, medico, "Dor no peito", "Pressão alta");
        ExameMedico exame = new ExameMedico(2001, paciente, medico, "Hemograma", "Normal");

        // Usando polimorfismo para realizar ações médicas
        AcaoMedica acao1 = consulta;
        AcaoMedica acao2 = exame;

        acao1.realizarAcaoMedica();
        acao2.realizarAcaoMedica();
    }
}
