package br.edu.unip.aula.testes_engenharia_software;

public class Calculadora {

	public Integer somar(Integer a, Integer b) {
		
		Integer soma = a + b;
		
		return soma;
	}
	
	
	public String verificarSituacaoAluno(Double nota1, Double nota2) {
		
		//ate 4 reporvado; acima de 4 até 6 recuperacao; acima de 6 aprovado
		Double media = (nota1 + nota2) / 2;
		
		if(media <= 4) {
			return "Reprovado";
		} else if(media > 4 && media <= 6 ) {
			return "Recuperação";
		} else {
			return "Aprovado";
		}
		
	}
}
