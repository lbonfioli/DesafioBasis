package br.com.basis.prova.util;

import java.time.LocalDate;

public class IdadeUtil {
	public static int calculaIdade(LocalDate dataNascimento) {

		LocalDate hoje = LocalDate.now();

		int idade = hoje.getYear() - dataNascimento.getYear();

		if (hoje.getMonthValue() < dataNascimento.getMonthValue()) {
			idade--;
		} else {
			if (hoje.getMonthValue() == dataNascimento.getMonthValue()
					&& hoje.getDayOfMonth() < dataNascimento.getDayOfMonth()) {
				idade--;
			}
		}

		return idade;
	}

}
