package br.com.basis.prova.repositorio;

import br.com.basis.prova.dominio.Aluno;
import br.com.basis.prova.dominio.Disciplina;
import br.com.basis.prova.dominio.dto.AlunoDetalhadoDTO;
import br.com.basis.prova.dominio.dto.AlunoListagemDTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AlunoRepositorio extends JpaRepository<Aluno, Integer>, JpaSpecificationExecutor<Aluno> {

	/*CONSULTA*/
	@Query("SELECT new br.com.basis.prova.dominio.dto.AlunoListagemDTO(a.id,a.nome,a.matricula,a.dataNascimento) FROM Aluno a")
	List<AlunoListagemDTO>findAllListagem();
	
	
	/*EXCLUSÃO*/
    @Query(nativeQuery = true,value = "SELECT COUNT (ID_DISCIPLINA) FROM ALUNO_DISCIPLINA AD"
    		+ "JOIN ALUNO A ON A.ID_ALUNO WHERE A.MATRICULA =: matricula")
    		Integer existeDisciplina(@Param("matricula") String matricula);
    
    void deleteByMatricula(String matricula);
    
    Aluno findByCpf(String cpf);

    Optional<Aluno> findByMatricula(String matricula);

    List<Aluno> findAllByDisciplinas(Disciplina disciplina);
}
