
import java.util.Scanner;

/*
 Escreva um algoritmo que calcule a média dos números
digitados pelo usuário, se eles forem pares. Termine a leitura
se o usuário digitar zero (0).
 */

/**
 *
 * @author marco
 */
public class Media_par {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        int valor;
        int valor_par = 0;
        double media;
        System.out.println("########Calculo de média dos valores pares.########");
        do{
            
            System.out.println("digite um valor.: ");
            valor = leitor.nextInt(); 
            
            if (valor == 0) {
                System.out.println("\nEncerrando...");
                break;
            }
            
            if (valor % 2 == 0){
                valor_par += valor;
                cont++;
            }
            
            
            
            
        }while(true);
        
        if(cont > 0) {
            media = (double)valor_par / cont;   
            System.out.println(valor_par);
            System.out.printf("A média dos valores, é %.2f: \n", media);
        }else{
            System.out.println("Nenhum número par foi inserido.");
        }
    }
    
}
