
import java.util.Random;



/**
 * 10. Faça um programa que receba a idade e o peso de sete
    pessoas. Calcule e mostre:
- a quantidade de pessoas com mais de 90 quilos;
- a média das idades das sete pessoas
 *
 * @author marco
 */
public class Media_PesoIdade {

    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        
        // variaveis de controle
        int pessoas = 0;
        int acimaPeso = 0;
        int idade_count = 0;
        
        do{
        int idade = random.nextInt(101);
        double peso = random.nextDouble(101.0);
        
        if (peso > 90){
            acimaPeso ++;
        }
        
        if (idade > 0){
            idade_count += idade;
        }
        
        pessoas ++;
        }while(pessoas <= 7);
        
        //processamneto
        int media = idade_count / pessoas;
        
        System.out.printf("A quantidade de pessoa intrevistadas que estão a cima de 90klg é de : %d\n ", acimaPeso);
        System.out.printf("A media de idade entre as 7 pessoas intrevistadas é: %d\n ", media);
        
        
        
    }
    
}
