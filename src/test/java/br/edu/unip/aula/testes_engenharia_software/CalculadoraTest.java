package br.edu.unip.aula.testes_engenharia_software;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void somarComSucesso() {
		
		Calculadora calculadora = new Calculadora();
		
		Integer esperado = 15;
		
		Integer resultado = calculadora.somar(10, 5);
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void verificarSituacaoAlunoAprovado() {
		
		Calculadora calculadora = new Calculadora();
		
		String esperado = "Aprovado";
		
		String resultado = calculadora.verificarSituacaoAluno(7.5, 9.5);
		
		assertEquals(esperado, resultado);
		
	}
	
	@Test
	public void verificarSituacaoAlunoReprovado() {
		
		Calculadora calculadora = new Calculadora();
		
		String esperado = "Reprovado";
		
		String resultado = calculadora.verificarSituacaoAluno(2.5, 4.5);
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void verificarSituacaoAlunoRecuperacao() {
		
		Calculadora calculadora = new Calculadora();
		
		String esperado = "Recuperação";
		
		String resultado = calculadora.verificarSituacaoAluno(5.5, 4.5);
		
		assertEquals(esperado, resultado);
	}
	

}
