package me.dio.academia.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Matricula {
    private Long id;

    private Aluno aluno;

    private final LocalDateTime dataDeMatricula = LocalDateTime.now();
}
