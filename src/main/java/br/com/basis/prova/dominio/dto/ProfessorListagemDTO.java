package br.com.basis.prova.dominio.dto;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.basis.prova.util.IdadeUtil;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class ProfessorListagemDTO {
	private Integer id;
	private String nome;
	private String area;
	private LocalDate dataNascimento;
	private Integer idade;


	
	public ProfessorListagemDTO(Integer id, String nome, String area, LocalDate dataNascimento) {

		this.id = id;
		this.nome = nome;
		this.area = area;
		this.idade = IdadeUtil.calculaIdade(dataNascimento);
	}
	
}