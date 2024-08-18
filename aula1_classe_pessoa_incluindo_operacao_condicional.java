public class Pessoa {
    String nome;
    String sobrenome;
    int idade;
    String end;
    String cidade;
    String cep;
    
    public void printStatus() {
        
        System.out.println("---------------------");
        
        System.out.println("Nome:" + nome);
        System.out.println("Segundo nome: " + sobrenome);
        System.out.println("Endereço: " + end);
        System.out.println("Cidade: " + cidade);
        System.out.println("Cep: " + cep);
        
        System.out.println("---------------------");
        
        if (idade >= 18) {
            System.out.println("Você é maior");
        }
        else{
            System.out.println("Você é menor");
        }
    }
    
    
    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        
        eu.nome = "Marcos";
        eu.sobrenome = "Junior";
        eu.idade = 15;
        eu.cidade = "Sorocaba/sp";
        eu.end = "Piazza di roma, 1522";
        eu.cep = "0000-0000";
        
        
        eu.printStatus();
        }
}