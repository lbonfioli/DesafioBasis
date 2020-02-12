package br.com.basis.prova.dominio;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import antlr.collections.List;

import java.time.LocalDate;
import java.util.ArrayList;

@Entity
@Table(name = "PROFESSOR")
@Getter
@Setter
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name  = "ID", nullable = false)
    private Integer id;

	@Size(max = 100)
	@Column(name = "NOME", nullable = false)
    private String nome;
	
	@Size(max = 6)
	@Column(name = "MATRICULA", nullable = false)
    private String matricula;

	@Size(max = 200)
	@Column(name = "AREA_ATUACAO", nullable = false)
    private String area;

	@Column(name = "DATA_NASCIMENTO", nullable = false)
    private LocalDate dataNascimento;
	
}
