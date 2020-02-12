package br.com.basis.prova.servico;

import br.com.basis.prova.dominio.Disciplina;
import br.com.basis.prova.dominio.Professor;
import br.com.basis.prova.dominio.dto.ProfessorDTO;
import br.com.basis.prova.dominio.dto.ProfessorDetalhadoDTO;
import br.com.basis.prova.dominio.dto.ProfessorListagemDTO;
import br.com.basis.prova.repositorio.DisciplinaRepositorio;
import br.com.basis.prova.repositorio.ProfessorRepositorio;
import br.com.basis.prova.servico.mapper.ProfessorMapper;
import liquibase.statement.core.FindForeignKeyConstraintsStatement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ProfessorServico {

    private ProfessorRepositorio professorRepositorio;
    private ProfessorMapper professorMapper;

    public ProfessorServico(ProfessorMapper professorMapper, ProfessorRepositorio professorRepositorio) {
        this.professorMapper = professorMapper;
        this.professorRepositorio = professorRepositorio;
    }

    public ProfessorDTO salvar(ProfessorDTO professorDTO) {
        
    	Professor professor = professorMapper.toEntity(professorDTO);
    	professorRepositorio.save(professor);
    	return professorMapper.toDto(professor);
    }

    public void excluirProfessor(String matricula) throws Exception {
       if(professorRepositorio.existeProfessor(matricula) !=0) {
    	   throw new Exception();
       }
    	professorRepositorio.deleteByMatricula(matricula);
    }
    
    public List<ProfessorListagemDTO> consultar() {
        return professorRepositorio.findAllListagemProfessor();
    }

    @Transactional(readOnly = true)
    public ProfessorDetalhadoDTO detalhar(Integer id) {
        return professorMapper.toDetalhadoDTO(professorRepositorio.getOne(id));
    }

}
