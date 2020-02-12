package br.com.basis.prova.dominio.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class ProfessorDetalhadoDTO {
	private Integer id;
	private String nome;
	private String matricula;

	public ProfessorDetalhadoDTO(Integer id, String nome, String matricula) {

		this.id = id;
		this.nome = nome;
		this.matricula = matricula;
	}
}
