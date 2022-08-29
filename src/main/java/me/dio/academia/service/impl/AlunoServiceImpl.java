package me.dio.academia.service.impl;

import me.dio.academia.entity.Aluno;
import me.dio.academia.entity.AvaliacaoFisica;
import me.dio.academia.entity.form.AlunoForm;
import me.dio.academia.entity.form.AlunoUpdateForm;
import me.dio.academia.infra.utils.JavaTimeUtils;
import me.dio.academia.repository.AlunoRepository;
import me.dio.academia.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {


    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());

        return repository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
//    O Get no Postman: http://localhost:8081/dataDeNacimento={dataDeNacimento}
//    Vai retornar todos os alunos com a data de nascimento requisitada
//    Obs:  dataDeNacimento é o KEY do postman
    public List<Aluno> getAll(String dataDeNascimento) {

        if(dataDeNascimento == null) {
            return repository.findAll();
        } else {
            LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return repository.findByDataDeNascimento(localDate);
        }

    }


    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {
        boolean alunoIsPresent = repository.findById(id).isPresent();

        if(alunoIsPresent){
            Aluno aluno = repository.findById(id).get();
            repository.delete(aluno);
        }
        else
            System.out.println("DELETE Falhou!!! Verifique se o id está certo ou se o aluno existe");
    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {

        Aluno aluno = repository.findById(id).orElseThrow();

        return aluno.getAvaliacoes();

    }

}
