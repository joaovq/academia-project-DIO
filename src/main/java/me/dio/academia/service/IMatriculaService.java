package me.dio.academia.service;

import me.dio.academia.entity.Matricula;
import me.dio.academia.entity.form.MatriculaForm;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IMatriculaService {
    /**
     * Cria uma Matrícula e salva no banco de dados.
     * @param form - formulário referente aos dados para criação da Matrícula no banco de dados.
     * @return - Matrícula recém-criada.
     */
    Matricula create(MatriculaForm form);

    /**
     * Retorna uma Matrícula que está no banco de dados de acordo com seu Id.
     * @param id - id da Matrícula que será exibida.
     * @return - Matrícula de acordo com o Id fornecido.
     */
    Matricula get(Long id);

    /**
     * Retorna todas as Matrículas que estão no banco de dados.
     * @return - uma lista com todas as Matrículas que estão salvas no DB.
     */
    List<Matricula> getAll(String bairro);

    /**
     * Deleta uma Matrícula específica.
     * @param id - id da Matrícula que será removida.
     */
    void delete(Long id);

}
