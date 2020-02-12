package br.com.basis.prova.repositorio;

import br.com.basis.prova.dominio.Professor;
import br.com.basis.prova.dominio.dto.ProfessorDetalhadoDTO;
import br.com.basis.prova.dominio.dto.ProfessorListagemDTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProfessorRepositorio extends JpaRepository<Professor, Integer>, JpaSpecificationExecutor<Professor> {
    Optional<Professor> findByMatricula(String matricula);
    
    /*CONSULTA*/
    @Query("SELECT new br.com.basis.prova.dominio.dto.ProfessorListagemDTO(p.id,p.nome,p.area,p.dataNascimento) FROM Professor p")
    List<ProfessorListagemDTO> findAllListagemProfessor();
    
	/*EXCLUSAO*/
    @Query(nativeQuery = true,value = "SELECT COUNT (PROFESSOR) FROM Disciplina D"
    		+ "JOIN Professor p ON p.disciplina WHERE p.matricula =: matricula")
    Integer existeProfessor(@Param("matricula") String matricula);
    
    void deleteByMatricula(String matricula);

}