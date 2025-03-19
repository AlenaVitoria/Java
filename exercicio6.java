import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class VerificacaoMaioridade {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite sua idade: "); // Pede a idade ao usuário
        int idade = scanner.nextInt(); // Lê a idade como um número inteiro
        
        // Verifica se a pessoa é maior de idade
        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }
        
        scanner.close();
    }
}