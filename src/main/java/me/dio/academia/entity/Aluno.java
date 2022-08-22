package me.dio.academia.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Aluno {

    private String nome;

    private String cpf;

    private String bairro;

    private LocalDate dataDeNascimento;

    private List<AvaliacaoFisica> avaliacoes = new ArrayList<AvaliacaoFisica>();
}
