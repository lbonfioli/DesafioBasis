package br.com.basis.prova.repositorio;

import br.com.basis.prova.dominio.Disciplina;
import br.com.basis.prova.dominio.Professor;
import br.com.basis.prova.dominio.dto.AlunoDetalhadoDTO;
import br.com.basis.prova.dominio.dto.DisciplinaDetalhadaDTO;
import br.com.basis.prova.dominio.dto.DisciplinaListagemDTO;
import br.com.basis.prova.dominio.dto.ProfessorListagemDTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisciplinaRepositorio extends JpaRepository<Disciplina, Integer>, JpaSpecificationExecutor<Disciplina> {

    List<Disciplina> findByProfessor(Professor professor);
    /*CONSULTA*/
    @Query("SELECT new br.com.basis.prova.dominio.dto.DisciplinaListagemDTO(d.id,d.nome,d.descricao,d.cargaHoraria) FROM Disciplina d")
    List<DisciplinaListagemDTO>findAllListagemD();
    
    /*CONSULTA DETALHADA*/
    @Query("SELECT new br.com.basis.prova.dominio.dto.DisciplinaDetalhadaDTO(d.id,d.nome,d.cargaHoraria,d.professor) FROM Disciplina d WHERE d.id = :id")
    DisciplinaDetalhadaDTO findDetalhadaById(@Param("id") Integer id);
    
    /*EXCLUSAO*/
    @Query("DELETE FROM Disciplina d WHERE d.id=:id")
    DisciplinaListagemDTO excluirDisciplinaListagemDTOById(@Param("id") Integer id);
    
}
