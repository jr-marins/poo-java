
import java.util.Scanner;


/**
 *
 * @author marco
 */
public class Try_calcular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        // tratando exceções
        
        System.out.println("Digite um numero : ");
        int numero = leitor.nextInt();
        
        try{
            int resultado = 10 / numero;
            
            System.out.println("O resultado é: " + resultado);
        }catch(ArithmeticException e) {
            System.out.println("Erro .... encerrando");
        }
        
    }
    
}
