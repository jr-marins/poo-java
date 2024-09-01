
import java.util.Scanner;

/**
 *
 * @author marcos
 * 
 * Exercício: conveter pés em métros, seguindo o exercício anterior
 */
public class ConvertingPes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instaânciando a classe scanner
        Scanner ler = new Scanner(System.in);
        
        // entrada de dados pelo console
        System.out.print("Insira o valor em pés que deseja converter para métros : ");
        
        // lendo o valor inserido pelo usuário
        double pes = ler.nextDouble();
        double metros = 0.3048;
        double valor_convertido = pes * metros;
        // fazendo a conversão e mostrando o resultado.
        System.out.printf("O valor  em pés : %.2f convertido para métros é =  %.2f \n", pes , valor_convertido);
        
    }
    
}
