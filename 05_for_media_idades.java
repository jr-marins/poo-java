import java.util.Random;
import java.util.Scanner;


/**
 *  Leia a idade de 20 pessoas e exiba a vlr_entrada das idades.
 * @author marco
 */
public class For_calc_idade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner leitor = new Scanner(System.in);
        Random random = new Random();
        
        // variavel de controle
        int vlr_entrada = 0;
        int maior_sim = 0;
        int idade_par = 0;
        
        // variavel de entrada
        int soma = 0;
        int media;
        int intervalo = 0;
        
        for(int i = 0; i <= 20; i++){
            //System.out.println("Digite sua idade: \n");
            //leitor.nextInt();
            vlr_entrada = random.nextInt(20);
            if(vlr_entrada > 18){
                maior_sim ++;
            }
            if(vlr_entrada % 2 == 0){
                idade_par ++;
            }
            // operação ternária
            intervalo = vlr_entrada > 0 && vlr_entrada < 100 ? intervalo + 1 : 0;
            System.out.println(vlr_entrada);
            soma += vlr_entrada;
        }
        
        media = soma / 20;
        System.out.println("\nA vlr_entrada das idades é: " + soma);
        System.out.println("A media das idades é: " + media);
        System.out.println("Pessoas com mais de 18 anos: " + maior_sim);
        System.out.println("As idades pares são: " + idade_par);
        System.out.println("A quantidade de idades menores que 100 é = " + intervalo);
        
        
        int resultado;
        
        for(int i = 0; i <= 10; i ++){
            resultado = 7 * i;
            
            System.out.println("Redutado da tabuada é: " + i + "=" + resultado);
        }
    }
    
    
    
    
}
