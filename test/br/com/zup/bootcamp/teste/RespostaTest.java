package br.com.zup.bootcamp.teste;

import org.junit.Before;
import org.junit.Test;

import br.com.zup.bootcamp.modelo.Aluno;
import br.com.zup.bootcamp.modelo.Avaliacao;
import br.com.zup.bootcamp.servico.RespostaQuestao;

public class RespostaTest {

	private Avaliacao avaliacaoNula;
	private Avaliacao avaliacaoNaoNula; 
    
	private Aluno alunoNulo; 
    private Aluno alunoNaoNulo;
    
    private int notaSete;
    private int notaMenorZero;
    private int notaMaiorDez;
    private int notaZero;
    private int notaDez;
    
    private RespostaQuestao rq1;
	
	@Before
	public void setUp()
	{
		
	   avaliacaoNula = null;
	   alunoNulo = null;
	   
	   avaliacaoNaoNula = new Avaliacao();
	   alunoNaoNulo = new Aluno();
	   
	   notaSete = 7;
	   notaMenorZero = -1;
	   notaMaiorDez = 12;
	   notaZero = 0;
	   notaDez = 10;
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void deveSerNulaAAvaliacao()
	{
		rq1 = new RespostaQuestao(avaliacaoNula, alunoNaoNulo, notaSete);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void deveSerNuloOAluno()
	{
		rq1 = new RespostaQuestao(avaliacaoNaoNula, alunoNulo, notaSete);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void deveSerMenorDoQueZeroANota()
	{
		rq1 = new RespostaQuestao(avaliacaoNaoNula, alunoNaoNulo, notaMenorZero);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void deveSerMaiorDoQueDezANota()
	{
		rq1 = new RespostaQuestao(avaliacaoNaoNula, alunoNaoNulo, notaMaiorDez);
	}
	
	@Test
	public void deveSerZeroANota()
	{
		rq1 = new RespostaQuestao(avaliacaoNaoNula, alunoNaoNulo, notaZero);
	}
	
	@Test
	public void deveSerDezANota()
	{
		rq1 = new RespostaQuestao(avaliacaoNaoNula, alunoNaoNulo, notaDez);
	}
	
	@Test
	public void DeveEstarEntreZeroEDezANota()
	{
		rq1 = new RespostaQuestao(avaliacaoNaoNula, alunoNaoNulo, notaSete);
	}	
}
