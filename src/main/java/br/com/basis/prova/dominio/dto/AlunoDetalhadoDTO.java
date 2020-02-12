package br.com.basis.prova.dominio.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RequiredArgsConstructor
@Getter
@Setter
public class AlunoDetalhadoDTO {

    private Integer id;
    private String nome;
    private String matricula;
    private List<DisciplinaListagemDTO> disciplinas = new ArrayList<>();
    
    @Autowired
    public AlunoDetalhadoDTO(Integer id,String nome,String matricula,List<DisciplinaListagemDTO> disciplinas ) {
    	
    	this.id = id;
    	this.nome = nome;
    	this.matricula = matricula;
    	this.disciplinas = disciplinas;
    	
    }
    @Autowired
    public AlunoDetalhadoDTO(Integer id,String nome,String matricula,Collection disciplinas ) {
    	
    	this.id = id;
    	this.nome = nome;
    	this.matricula = matricula;
    	this.disciplinas = (List<DisciplinaListagemDTO>) disciplinas;
    	
    }

}
