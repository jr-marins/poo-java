import java.util.Scanner;

public class Calc_porcento_produto {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Variáveis para acumular as médias e contagem de produtos
        double somaPrecoOriginal = 0;
        double somaPrecoNovo = 0;
        int contadorProdutos = 0;

        // Variáveis de entrada
        int codigo;
        double precoCusto;
        
        // Loop para ler os produtos
        while (true) {
            System.out.println("Digite o código do produto (valor negativo para sair): ");
            codigo = leitor.nextInt();
            
            // Se o código for negativo, sair do loop
            if (codigo < 0) {
                break;
            }
            
            System.out.println("Digite o preço de custo do produto: ");
            precoCusto = leitor.nextDouble();
            
            // Calcular o novo preço com aumento de 20%
            double precoNovo = precoCusto * 1.20;
            
            // Mostrar o código e o preço novo
            System.out.printf("Produto código %d - Preço novo: R$ %.2f\n", codigo, precoNovo);
            
            // Acumular os preços para calcular a média
            somaPrecoOriginal += precoCusto;
            somaPrecoNovo += precoNovo;
            contadorProdutos++;
        }
        
        // Verificar se há produtos para evitar divisão por zero
        if (contadorProdutos > 0) {
            // Calcular as médias
            double mediaPrecoOriginal = somaPrecoOriginal / contadorProdutos;
            double mediaPrecoNovo = somaPrecoNovo / contadorProdutos;
            
            // Exibir as médias
            System.out.printf("Média dos preços sem aumento: R$ %.2f\n", mediaPrecoOriginal);
            System.out.printf("Média dos preços com aumento: R$ %.2f\n", mediaPrecoNovo);
        } else {
            System.out.println("Nenhum produto foi inserido.");
        }
    }
}
