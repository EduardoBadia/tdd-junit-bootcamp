package br.com.zup.bootcamp.servico;

import br.com.zup.bootcamp.modelo.Aluno;
import br.com.zup.bootcamp.modelo.Avaliacao;

public class RespostaQuestao {

	private Avaliacao avaliacao;
	private Aluno aluno;
	private int nota;

	// construtor

	public RespostaQuestao(Avaliacao avaliacao, Aluno aluno, int nota){

	       if(avaliacao == null){

	           throw new IllegalArgumentException("A avalia��o n�o pode ser nula");
	       }


	       if(aluno == null){

	           throw new IllegalArgumentException("O aluno n�o pode ser nula");

	       }

	       if(nota < 0){

	           throw new IllegalArgumentException("A nota n�o pode ser menor que zero");

	       }
	       
	       if(nota > 10){

	           throw new IllegalArgumentException("A nota n�o pode ser maior que10");

	       }
     }
}