package me.dio.academia.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_avaliacoes")
public class AvaliacaoFisica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    // A alteração que eu fizer aqui, vai refletir em aluno
    @JoinColumn(name = "aluno_id")
//    Vai relacionar a avalização física com o ID
    private Aluno aluno;

    private LocalDateTime localDateTime = LocalDateTime.now();

    @Column(name = "peso_atual")
    private double peso;
    @Column(name = "altura_atual")
    private double altura;


}
