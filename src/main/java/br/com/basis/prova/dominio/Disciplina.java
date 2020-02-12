package br.com.basis.prova.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "DISCIPLINA")
@Getter
@Setter
@NoArgsConstructor
public class Disciplina {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private Integer id;

	@Size(min = 4 , max = 50)
	@Column(name = "NOME", nullable = false)
	private String nome;

	@Size(max = 200)
	@Column(name = "DESCRICAO", nullable = false)
	private String descricao;

	@Column(name = "CARGA_HORARIA", nullable = false)
	private Integer cargaHoraria;

	@Column(name = "ATIVA", nullable = true)
	private Integer ativa;
	
	@JoinColumn(name = "ID_PROFESSOR", nullable = false)
	@ManyToOne(optional = false)
	private Professor professor;

}
