package br.com.basis.prova.dominio.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class DisciplinaListagemDTO {

	private Integer id;
	private String nome;
	private String descricao;
	private Integer cargaHoraria;

	public DisciplinaListagemDTO(Integer id, String nome, String descricao, Integer cargaHoraria) {

		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;

	}

}
