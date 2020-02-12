package br.com.basis.prova.dominio.dto;

import br.com.basis.prova.dominio.Professor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor

@Getter
@Setter
public class DisciplinaDetalhadaDTO {
	private Integer id;
	private String nome;
	private Integer cargaHoraria;
	private Professor professor;

	
	public DisciplinaDetalhadaDTO(Integer id, String nome, Integer cargaHoraria, Professor professor) {

		this.id = id;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.professor = professor;
	}
}
