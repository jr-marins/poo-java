/**
 * Escreva um programa para imprimir a série de Fibonacci
    até a centésima posição.
    Exemplo: 0 1 1 2 3 5 8 13 24 ..…
 * @author marco
 */
public class For_fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variaveis de controle
        int num1 = 0, num2 = 1;
        
        for(int i = 0; i <= 100; i ++){
            
            System.out.println(num1 + "");
            
            int nextnum = num1 + num2;
            num1 = num2;
            num2 = nextnum;
        }
    }
    
}
