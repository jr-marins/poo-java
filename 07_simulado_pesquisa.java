
import java.util.Random;
import java.util.Scanner;

/*
9. Foi feita uma pesquisa entre os 1000 habitantes de uma
região para coletar os seguintes dados:
sexo (0-feminino, 1-masculino), idade e altura.
Faça um algoritmo que leia as informações coletadas e
mostre as seguintes informações:
a) média da idade do grupo;
b) média da altura das mulheres;
c) média da idade dos homens;
d) percentual de pessoas com idade entre 18 e 35 anos
(inclusive).
*/
public class IBGE_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();
        
        //variáveis de controle
        int total = 0;
        int sexo_masc = 0;
        int sexo_femin = 0;
        int idade_masc = 0;
        double altura_femin =0;
        int calc_faixa_etaria = 0;
        
        
        //variáveis de entrada
        /*int sexo;
        int idade;
        double altura;*/
        
        System.out.println("#### Pesquisa IBGE by Marcos Marins ####\n");
        
        do{            
           /*System.out.println("\n qual seu sexo ?");
           System.out.println("\n [0] Masculino");
           System.out.println("\n [1] Feminino");
           sexo = leitor.nextInt();*/
           
           // Para não preencher manualmente fiz uso do método Random
            int sexo = random.nextInt(2); //0 ou 1
            int idade = random.nextInt(101); // Idade entre 0 e 100
            double altura = 1.5 + random.nextDouble() * 0.6; // Altura entre 1.5 e 2.1 metros
           
           if(sexo == 0) {
               
               idade_masc += idade;
               sexo_masc ++;
               
           }else{
                 
               altura_femin += altura;
               sexo_femin ++;
           }
           
           if (idade >= 18 && idade <= 35){
               calc_faixa_etaria ++;
           }
           total ++;
        }while(total < 4);
             
               
        double media_idade = sexo_masc > 0 ? (double)idade_masc / sexo_masc: 0;
        double media_altura = sexo_femin > 0 ? altura_femin / sexo_femin: 0;
        double percentual = (calc_faixa_etaria / (double) total) * 100;
        
        System.out.printf("Percentual de pessoas com idade entre 18 e 35 anos = %.2f%%\n", percentual);
        System.out.printf("Média de idade dos homens = %.2f anos\n", media_idade);
        System.out.printf("Média de altura das mulheres = %.2f metros\n", media_altura);
        
        /*
        System.out.printf("Percentual de pessoas com idade entre 18 e 35 anos = %.2f \n", percentual);
        System.out.printf("A media de idade dos homens é de %d\n ", media_idade);
        System.out.printf("A media de altura das mulheres é de %.2f\n ", media_altura);
        }
        */
    }
}
