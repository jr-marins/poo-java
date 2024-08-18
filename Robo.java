/*
Welcome to JDoodle!

You can execute code here in 88 languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
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