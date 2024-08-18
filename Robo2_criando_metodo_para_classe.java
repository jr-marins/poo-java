/* 
Melhorando o código :

Criando um método para a classe robô que 
imprima o seu status em vez de deixar a cargo da 
função main.

Essa alteração deiará a cargo da classe robô a responsabilidade 
de imprimir seu status

Dentro da função main somente iremos criar as instâncias da classe robo.
*/

// Definindo uma classe publica

public class Robo {
    String nome;
    String cor;
    float velocidadeMax;
    int nivelBateriaAtual;
    float pesoCargaMax;
    String tipoTracao;
    boolean temAntena;
// Criando o método de impressão de status da classe
    public void printStatus(){
        System.out.println("-----------------------------------");

        System.out.println("Meu nome: " + nome);
        System.out.println("Cor Robo: " + cor);
        System.out.println("Vel Max: " + velocidadeMax);
        System.out.println("Bateria atual: " + nivelBateriaAtual);
        System.out.println("Carga Max/ps: " + pesoCargaMax);
        System.out.println("Tação: " + tipoTracao);
        System.out.println("Tem antena: " + temAntena);
        
        System.out.println("-----------------------------------");
    }

// Declarando a função principal
    public static void main(String[] args) {
// Estanciando a classe
        Robo eurobo = new Robo();

        eurobo.nome = "Mr.1533";
        eurobo.cor = "Dourado";
        eurobo.velocidadeMax = 10;
        eurobo.nivelBateriaAtual = 80;
        eurobo.pesoCargaMax = 50;
        eurobo.tipoTracao = "Traseira";
        eurobo.temAntena = true;
// chamando o método da classe 
        eurobo.printStatus();

// criando mais uma instancia
        Robo robo2 = new Robo();

        robo2.nome = "Mr.420";
        robo2.cor = "Preto";
        robo2.velocidadeMax = 100;
        robo2.nivelBateriaAtual = 30;
        robo2.pesoCargaMax = 200;
        robo2.tipoTracao = "Traseira";
        robo2.temAntena = false;
// chamndo o método
        robo2.printStatus();
    }
    
}
