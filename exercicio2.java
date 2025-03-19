import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class SomaNumeros {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: "); // Pede o primeiro número ao usuário
        int numero1 = scanner.nextInt(); // Lê o primeiro número inteiro
        
        System.out.print("Digite o segundo número: ");  // Pede o segundo número ao usuário
        int numero2 = scanner.nextInt(); 
        
        int soma = numero1 + numero2; // Calcula a soma dos dois números
        
        System.out.println("A soma é: " + soma); // Exibe o resultado da soma
        
        scanner.close();
    }
}