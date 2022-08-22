package me.dio.academia.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
public class AvaliacaoFisica {

    private Long id;

    private Aluno aluno;

    private LocalDateTime localDateTime = LocalDateTime.now();

    private double peso;

    private double altura;


}
