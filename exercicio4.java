import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class ParOuImpar {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita um número ao usuário
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt(); // Lê o número inteiro
        
        // Verifica se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par");
        } else {
            System.out.println("O número " + numero + " é ímpar");
        }
        
        // Fecha o objeto Scanner para evitar vazamento de recursos
        scanner.close();
    }
}