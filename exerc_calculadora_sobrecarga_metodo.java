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
 */
public class Calculadora {

    // Método para somar dois inteiros
    // assinatura > int
    int somar(int a, int b) {
        return a + b ;
    }
    
    // Método para somar dois doubles
    // assinatura > double
    double somar(double a, double b) {
        return a + b;
    }
    
    // Método subtrair dois inteiros
    int subtracao(int a, int b) {
        return a - b;
    }
    
    // Método para subtrair dois doubles
    double subtracao(double a, double b) {
        return a - b;
    }
    
    // Método para multiplicar dois inteiros
    int multiplicacao(int a, int b) {
        return a * b;
    }
    
    // Método para multiplicar dois doubles
    double multiplicacao(double a, double b) {
        return a * b;
    }
    
    // Método que divide dois inteiros
    int dividir(int a, int b) {
        return a / b;
    }
    
    // Método para dividir dois double
    double dividir(double a, double b) {
        return a / b;
    }
    
    
    
    public static void main(String[] args) {
        // Estanciando a classe
        Calculadora calc = new Calculadora();
        
        //Métodos soma
        System.out.println("Soma inteiro: " + calc.somar(10, 90));
        System.out.println("Soma decimal:" + calc.somar(5.5, 10.9));
        
        //Métodos subtração
        System.out.println("Subtra inteiro: " + calc.subtracao(25, 5));
        System.out.println("Subtra decimal: " + calc.subtracao(20.2, 0.2));
        
        //Método de Multiplicar
        System.out.println("Mult inteiro: " + calc.multiplicacao(2, 250));
        System.out.println("Mult decimal: " + calc.multiplicacao(10.0, 30.3));
        
        //Método de divisão
        System.out.println("Divisão inteiro: " + calc.dividir(10, 2));
        System.out.println("Divisão dedcimal: " + calc.dividir(25.0, 5.0));
        
    }
    
}
