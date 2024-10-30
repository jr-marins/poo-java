
import java.util.Scanner;

  
public class Calc_intervalos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor = new Scanner(System.in);
        
        int valor = 0;
        int primeiro_intervalo = 0;
        int segundo_intervalo = 0;
        int terceiro_intervalo = 0;
        int quarto_intervalo = 0;
        
        do{
            System.out.println("Insira um valor inteiro.\nPara sair, digite um valor negativo: ");
            valor = leitor.nextInt();
            
            if (valor < 0) {
                System.out.println("Encerrando ...");
                break;
            }
            
            if(valor >= 0 && valor <= 25){
                primeiro_intervalo +=1;
            } 
            else if(valor >= 26 && valor <= 50){
                segundo_intervalo +=1;
            }else if(valor >= 51 && valor <= 75){
                terceiro_intervalo +=1;
            }else if(valor >= 76 && valor <= 100){
                quarto_intervalo +=1;
            }else{
                System.out.println("Operação incorreta.");
            }
            
            
        }while(valor >= 0);
        
        System.out.println("Intervalo [0 a 25]: " + primeiro_intervalo);
        System.out.println("Intervalo [26 a 50]: " + segundo_intervalo);
        System.out.println("Intervalo [51 a 75]: " + terceiro_intervalo);
        System.out.println("Intervalo [76 a 100]: " + quarto_intervalo);
    }
    
}
