
import java.util.Scanner;

/*
 * Calcule a quantidade de litros de combus�vel gasta em uma viagem,
 *utilizandoum automóvel que faz 12 Km por litro.  
 */

/**
 *
 * @author marcos marins
 */
public class CalCarro {

    public static void main(String[] args) {
        // estânciando a classe scanner
        Scanner ler = new Scanner(System.in);
        
        
        // Lendo do console
        System.out.print("Insira o tempo gasto na viagem: ");
        double tempo_gasto = ler.nextDouble();
        
        System.out.print("Inria a velocidade média durante a viagem: ");
        double vel_media = ler.nextDouble();
        
        // criando a lógica
        double distancia =  tempo_gasto * vel_media;
        double litro_usado = distancia / 12;
        
        // Apresentando o resultado
        System.out.printf(
                "A distância percorrida foi %.2fkm"
                + " em uma velocidade média de %.2fkm/h ."
                + " A quantidade de litro gasto foi: %.2fL\n", 
                distancia, vel_media, litro_usado
        );
    }
    
}
