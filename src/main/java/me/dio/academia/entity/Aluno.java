package me.dio.academia.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;

    private String cpf;

    private String bairro;

    private LocalDate dataDeNascimento;

    private List<AvaliacaoFisica> avaliacoes = new ArrayList<AvaliacaoFisica>();
}
