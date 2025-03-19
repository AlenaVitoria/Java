import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class MultiplicacaoNumeros {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: "); // Pede o primeiro número ao usuário
        int numero1 = scanner.nextInt(); // Lê o primeiro número inteiro
        
        System.out.print("Digite o segundo número: ");  // Pede o segundo número ao usuário
        int numero2 = scanner.nextInt(); // Lê o segundo número inteiro
        
        int produto = numero1 * numero2; // Calcula o produto dos dois números

        System.out.println("O produto é: " + produto); // Exibe o resultado do produto
        
        scanner.close();
    }
}