
import java.util.Scanner;

/*
 . Em uma eleição presidencial existem quatro candidatos. Os
votos são informados através de códigos. Os dados utilizados
para a contagem dos votos obedecem à seguinte codificação:

1,2,3,4 = voto para os respectivos candidatos;
5 = voto nulo;
6 = voto em branco;

Elabore um algoritmo que leia o código do candidato em um
voto. Calcule e escreva:

- total de votos para cada candidato;
- total de votos nulos;
- total de votos em branco;

Como finalizador do conjunto de votos, tem-se o valor 0.
 */

/**
 *
 * @author marco
 */
public class Voto_eleicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor = new Scanner(System.in);
        
        // candidatos 4
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        
        int voto_nulo = 0;
        int voto_branco = 0;
        int opcao;
        
        
        
        do {
            
            //int votos;
            
            System.out.println("##### Seja bem vindo a bancada de Votos #####");
            System.out.println("Escolha com sabedoria o responsável pela nação.");
            
            System.out.println("\n[1] Tiririca");
            System.out.println("[2] ladyGaga");
            System.out.println("[3] lilWane");
            System.out.println("[4] teletames");
            
            System.out.println("Para finalizar, precione zero(0)");
            opcao = leitor.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("1 Voto para Tiririca.\n");
                    candidato1 ++;
                    break;
                case 2:
                    System.out.println("1 Voto para LadyGaga\n");
                    candidato2 ++;
                    break;
                case 3:
                    System.out.println("1 Voto para LilWane\n");
                    candidato3 ++;
                    break;
                case 4:
                    System.out.println("1 Voto para teletames\n");
                    candidato4 ++;
                    break;
                case 5:
                    System.out.println("1 voto NULO\n");
                    voto_nulo ++;
                    break;
                case 6:
                    System.out.println("1 voto BRANCO\n");
                    voto_branco ++;
                    break;
                
                    
                }
            
            
        } while(opcao > 0);
        if (opcao == 0) {
            System.out.println("Fechando...\n");
            System.out.println("Candidato1: " + candidato1);
            System.out.println("Candidato2: " + candidato2);
            System.out.println("candidato3: " + candidato3);
            System.out.println("candidato4: " + candidato4);
            System.out.println("voto NULLO: " + voto_nulo);
            System.out.println("voto em branco: " + voto_branco);
            

        }
        
            
    }
    
}
