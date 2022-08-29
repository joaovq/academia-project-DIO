package me.dio.academia.entity.form;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class AlunoForm {
    @NotBlank(message = "Preencha o campo corretamente")
    @Size(min = 3,max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String nome;
    @NotBlank(message = "Preencha o campo corretamente")
    @CPF(message = "'${validatedValue}' é inválido")
    private String cpf;
    @Size(min = 3,max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String bairro;
    @NotNull(message = "Preencha o campo novamente")
    @Past(message = "Data '${validatedValue} é inválida") // válida se é uma data que aconteceu no passado
    private LocalDate dataDeNascimento;
}
