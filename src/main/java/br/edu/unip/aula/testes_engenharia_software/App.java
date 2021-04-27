package br.edu.unip.aula.testes_engenharia_software;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Calculadora" );
        
        Calculadora calculadora = new Calculadora();
        
        Integer resultado = calculadora.somar(3, 7);
        
        System.out.println("Resultado: " + resultado);
        
    }
}
