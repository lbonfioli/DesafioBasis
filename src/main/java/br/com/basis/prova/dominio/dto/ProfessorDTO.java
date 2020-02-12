package br.com.basis.prova.dominio.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfessorDTO {
    private Integer id;
    private String nome;
    private String matricula;
    private String area;
    private LocalDate dataNascimento;
}
