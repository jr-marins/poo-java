/* 
Neste projeto, você criará um programa que calcula a que distância, em pés, um ouvinte
está da queda de um relâmpago. O som viaja a aproximadamente 1.100 pés por
segundo pelo ar. Logo, conhecer o intervalo entre o momento em que você viu um
relâmpago e o momento em que o som o alcançou lhe permi�rá calcular a distância do
relâmpago. 
*/

import java.util.Scanner; 

/**
 *
 * @author marcos
 */
public class ExercicioCalculoSom {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Exercicío para calcular a distância em que caiu um relâmpago.
        // instânciando um objeto scanner (lê do console)
        Scanner ler = new Scanner(System.in);
// in para referenciar a entrada padrao de uma máquina(teclado)

        System.out.print("Digite o tempo em que o som demorou para surgir: ");

// pegando um valor double inserido pelo usuário no console. veja como chamar o método        
        double tempo = ler.nextDouble();
        double velocidade = 1.100;
        double distancia = velocidade * tempo;
        
// apresentando o resultado para o usuário, usando uma saída formatada.
        System.out.printf("A distância em que o ouvinte está da queda do relâmpago é %.2f \n ", distancia);
    
    }
    
}
