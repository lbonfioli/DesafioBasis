package br.com.basis.prova.dominio.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.basis.prova.util.IdadeUtil;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@RequiredArgsConstructor
@Getter
@Setter
public class AlunoListagemDTO {

    private Integer id;
    private String nome;
    private String matricula;
    @JsonIgnore
    private LocalDate dataNascimento;
    private Integer idade;
    
    public AlunoListagemDTO(Integer id,String nome,String matricula,LocalDate dataNascimento) {
    	
    	this.id = id;
    	this.nome = nome;
    	this.matricula = matricula;
    	this.idade = IdadeUtil.calculaIdade(dataNascimento);
    }
    
}
