package me.dio.academia.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Matricula {
    private Long id;

    private Aluno aluno;

    private final LocalDateTime dataDeMatricula = LocalDateTime.now();
}
