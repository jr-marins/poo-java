
import java.util.Scanner;

/*
 * EXERCÍCIO:
 * Criar uma calculadora Usando sobre carga de métodos.

 * A sobrecarga em Java é o processo de definir múltiplos 
 * métodos ou construtores com o mesmo nome, mas com diferentes assinaturas
 * dentro de uma mesma classe.
 * A assinatura de um método é definida pelo número de parâmetros,
 * tipo de parâmetros e/ou a ordem dos parâmetros.
 * Isso permite que você reutilize o nome de um método ou construtor,
 * mas variando como ele será chamado dependendo dos argumentos passados.
 */

/**
 *
 * @author marcos marins
 * Na versão 1 eu chamei os métodos já passando os argumentos:
 * 
//        //Métodos soma
//        System.out.println("Soma inteiro: " + calc.somar(10, 90));
//        System.out.println("Soma decimal:" + calc.somar(5.5, 10.9));
//        
//        //Métodos subtração
//        System.out.println("Subtra inteiro: " + calc.subtracao(25, 5));
//        System.out.println("Subtra decimal: " + calc.subtracao(20.2, 0.2));
//        
//        //Método de Multiplicar
//        System.out.println("Mult inteiro: " + calc.multiplicacao(2, 250));
//        System.out.println("Mult decimal: " + calc.multiplicacao(10.0, 30.3));
//        
//        //Método de divisão
//        System.out.println("Divisão inteiro: " + calc.dividir(10, 2));
//        System.out.println("Divisão dedcimal: " + calc.dividir(25.0, 5.0));
//        
 * 
 *  VERSÃO 2 
 * Construí o algoritmo de forma que o usuário
 * insira a entrada, baseando-se em opções de operações de matemáticas.
 */
public class Calculadora {

    // Método para somar dois inteiros
    // assinatura > int
    public int somar(int a, int b) {
        return a + b ;
    }
    
    // Método para somar dois doubles
    // assinatura double
    public double somar(double a, double b) {
        return a + b;
    }
    
    // Método subtrair dois inteiros
    public int subtracao(int a, int b) {
        return a - b;
    }
    
    // Método para subtrair dois doubles
    public double subtracao(double a, double b) {
        return a - b;
    }
    
    // Método para multiplicar dois inteiros
    public int multiplicacao(int a, int b) {
        return a * b;
    }
    
    // Método para multiplicar dois doubles
    public double multiplicacao(double a, double b) {
        return a * b;
    }
    
    // Método que divide dois inteiros
    public int dividir(int a, int b) {
        return a / b;
    }
    
    // Método para dividir dois double
    public double dividir(double a, double b) {
        return a / b;
    }
    
    
    
    public static void main(String[] args) {
        // Estanciando a classe
        Calculadora calc = new Calculadora();
        Scanner leitor = new Scanner(System.in);
        
        int opcao;
        double a, b, resultado = 0.0;
        
        System.out.println("Sistema de calculadora >> Marcos Marins <<");
        
        do {
            
            System.out.println("(0).Somar ");
            System.out.println("(1).Subtrair ");
            System.out.println("(2).Multiplicar ");
            System.out.println("(3).Dividir ");
            System.out.println("(4).Sair ");
            System.out.println("Escolha uma opção: ");
            
            opcao = leitor.nextInt();
            if (opcao < 0 || opcao > 4) {
                System.out.println("Opção inválida");
                continue;
            }
            
            if (opcao == 4) break;
            
            System.out.println("Digite um valor: ");
            a = leitor.nextDouble();
            
            System.out.println("Digite o ssegundo valor: ");
            b = leitor.nextDouble();
            
            switch (opcao) {
                case 0:
                    resultado = calc.somar(a, b);
                    break;
                case 1:
                    resultado = calc.subtracao(a, b);
                    break;
                case 2:
                    resultado = calc.multiplicacao(a, b);
                    break;
                case 3:
                    resultado = calc.dividir(a, b);
                    break;
            }
            
            System.out.printf("O resultado da operação é: %.3f\n", resultado);
            
            
        } while (opcao !=4);
        
        
    }
    
}
