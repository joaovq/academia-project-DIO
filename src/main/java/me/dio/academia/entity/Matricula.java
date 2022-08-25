package me.dio.academia.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_matriculas")
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
//    Toda alteração em matricula, vai refletir em aluno
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    private final LocalDateTime dataDeMatricula = LocalDateTime.now();
}
