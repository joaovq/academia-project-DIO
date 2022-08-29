package me.dio.academia.service.impl;

import me.dio.academia.entity.Aluno;
import me.dio.academia.entity.Matricula;
import me.dio.academia.entity.form.MatriculaForm;
import me.dio.academia.repository.AlunoRepository;
import me.dio.academia.repository.MatriculaRepository;
import me.dio.academia.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaForm form) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        matricula.setAluno(aluno);

        return matriculaRepository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return matriculaRepository.findById(id).get();
    }

    @Override
    public List<Matricula> getAll(String bairro) {

        if(bairro == null){
            return matriculaRepository.findAll();
        }else{
            return matriculaRepository.findAlunosMatriculadosBairro(bairro);
        }

    }

    @Override
    public void delete(Long id) {
        boolean alunoIsPresent = matriculaRepository.findById(id).isPresent();

        if(alunoIsPresent){
            Matricula aluno = matriculaRepository.findById(id).get();
            matriculaRepository.delete(aluno);
        }
        else
            System.out.println("DELETE Falhou!!! Verifique se o id está certo ou se o aluno existe");
    }



}
