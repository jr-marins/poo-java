/*
 * Em Java, os construtores são métodos especiais
 * usados para inicializar objetos.
 * A vantagem principal de usar construtores é garantir
 * que um objeto seja criado em um estado válido e que seus
 * atributos sejam configurados de maneira correta desde o início.
 */

/**
 *
 * @author marcos marins
 */
public class Carro {
    String marca;
    int ano;
    
    //Construtor com dois parâmetros
    Carro(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }
    
    //Construtor sobrecarregado com um parâmetro
    Carro(String marca) {
        this.marca = marca;
        this.ano = 2024; // ano padrão
    }
    
    //Sobreescrevendo o método toString para exibir informações do carro
    @Override
    public String toString() {
        return "Carro {Marca: " + marca + ", Ano: " + ano + "}";
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Carro carro1 = new Carro("Toyota", 2024); 
        Carro carro2 = new Carro("Honda", 2023);
        Carro carro3 = new Carro ("Ford");
        
        System.out.println(carro1); // chama o método toString automaticamente
        System.out.println(carro2); // chama o método toString automaticamente
        System.out.println(carro3); // chama o método toString automaticamente
        
    
    }
    
}