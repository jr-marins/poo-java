/*
Entendedo como funciona a função principal e as demais palavaras
reservadas de java.
*/

public class Robo {
    String nome;
    String cor;
    float velocidadeMax;
    int nivelBateriaAtual;
    float pesoCargaMax;
    String tipoTracao;
    boolean temAntena;
    
    public static void main(String[] args) {
        Robo obj1 = new Robo();
        obj1.nome = "R-1533";
        obj1.cor = "Azul";
        obj1.velocidadeMax = 6;
        obj1.nivelBateriaAtual = 80;
        obj1.pesoCargaMax = 10;
        obj1.tipoTracao = "Esteira";
        obj1.temAntena = true;
        
        System.out.println("Meu nome: " + obj1.nome);
        System.out.println("Cor do robô: " + obj1.cor);
        System.out.println("Vel max: " + obj1.velocidadeMax);
        System.out.println("Nivel Bateria: " + obj1.nivelBateriaAtual);
        System.out.println("Peso Max: " + obj1.pesoCargaMax);
        System.out.println("Tração: " + obj1.tipoTracao);
        System.out.println("Antena: " + obj1.temAntena);
    }
}