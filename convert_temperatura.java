
import java.util.Scanner;

/*
 * Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus
Celsius.

A fórmula de conversão a ser utilizada pode ser C = ((F - 32) * 5) / 9
em que a variável F é a temperatura em graus Fahrenheit e a variável C é a
temperatura em graus Celsius.
 
 */

/**
 *
 * @author marcos amrins
 */
public class Converte_temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // estânciando a classe scanner
        Scanner ler = new Scanner(System.in);
        
        // lendo do console
        System.out.println("Insira a temperatura em fahrehit: ");
        double fahrenheit = ler.nextDouble();
        
        // criando a logica
        double celcius = ((fahrenheit - 32)*5)/9;
        
        // exibindo resultado
        System.out.printf("A temperatura convertida é : %.2f C°", celcius);
        
                
        
    }
    
}
