import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*  
    Escreva um algoritmo que leia o código do item adquirido pelo
    consumidor e a quantidade, calculando e mostrando o valor a
    pagar. Não será necessário exibir o produto e o valor, somente o
    valor final.
*/

class Lanche {
    private String nome;
    private double valor;

    public Lanche(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + String.format("%.2f", valor);
    }
}

public class Cardapio {
    public static void main(String[] args) {
        // Criando o HashMap para armazenar o cardápio
        HashMap<Integer, Lanche> cardapio = new HashMap<>();

        // Adicionando lanches ao cardápio
        cardapio.put(1, new Lanche("Hambúrguer", 15.50));
        cardapio.put(2, new Lanche("Pizza", 30.00));
        cardapio.put(3, new Lanche("Cachorro-Quente", 10.00));
        cardapio.put(4, new Lanche("Batata Frita", 8.50));
        cardapio.put(5, new Lanche("Refrigerante", 5.00));

        // Exibindo o cardápio dentro do loop
        System.out.println("############ Lanchonete Dog Quente ######################\n");
        System.out.println("---- Cardápio ----");
        for (Map.Entry<Integer, Lanche> entry : cardapio.entrySet()) {
            System.out.println("Código: " + entry.getKey() + ", " + entry.getValue());

        }

        // Inicializando o Scanner para ler as escolhas do cliente
        Scanner leitor = new Scanner(System.in);

        double totalAPagar = 0.0; // Variável para armazenar o valor total
        StringBuilder pedido = new StringBuilder(); // Para armazenar os itens escolhidos

        while (true) {
            System.out.println("\nDigite o código do lanche que deseja adicionar ao pedido (ou 0 para finalizar): ");
            int codigoLanche = leitor.nextInt();

            if (codigoLanche == 0) {
                break; // Finaliza o pedido
            }

            Lanche lancheEscolhido = cardapio.get(codigoLanche);
            if (lancheEscolhido != null) {
                
                // Adicionando o valor do lanche ao total
                totalAPagar += lancheEscolhido.getValor();
                
                // Adicionando o nome do lanche ao pedido
                pedido.append(lancheEscolhido.getNome()).append(" - R$ ").append(String.format("%.2f", lancheEscolhido.getValor())).append("\n");
                System.out.println(lancheEscolhido.getNome() + " adicionado ao pedido.");
            } else {
                System.out.println("Código inválido, tente novamente.");
            }
        }

        // Exibir o pedido final e o total a pagar
        System.out.println("############ Lanchinete Dog Quente ######################\n");
        System.out.println("\n---- Seu Pedido ----");
        System.out.println(pedido.toString());
        System.out.println("Total a pagar: R$ " + String.format("%.2f", totalAPagar));

        leitor.close();
    }
}
