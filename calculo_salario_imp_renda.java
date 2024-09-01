
import java.util.Scanner;

/**
 *
 * @author marco
 * Exercício: Calcular o imposto de renda com base no salário bruto e retornar o salário líquido
 * 
 */

public class mp_renda {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        
        // Inserindo os valores pelo console
        
        
        // crinado minhas variáveis
        // lendo do console
        System.out.println("Insira seu salário base com casas decimais, por favor: ");
        double sal_base = ler.nextDouble();
        
        System.out.println("Insira sua gratificação, caso não receba inclua apeas o valor zero: ");
        double gratificacao = ler.nextDouble();
        
        // Calculando o salário bruto
        double sal_bruto = sal_base + gratificacao;
        
        // criando condicionais com a operação ternária
        double imp_renda = (sal_bruto > 1.000)?  sal_bruto *0.20 : sal_bruto * 0.15;
        
        // criando variavél final que armazenará o salário liquido.
        double sal_liquido = sal_bruto - imp_renda;
        
        // exibindo o resultado
        
        System.out.printf("Seu salário líquido é de: %.2f . Você paga de imposto de renda o valor de : %.2f . " , sal_liquido, imp_renda);
        // encerrando meu scanner
        ler.close();
    }
    
}
