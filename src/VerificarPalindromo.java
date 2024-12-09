import java.util.Scanner;

public class VerificarPalindromo {
    public static void main(String[] args) {
        // Criando um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pedindo ao usuário para inserir uma palavra
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        // Convertendo a palavra para minúsculas para ignorar diferenças de caso
        palavra = palavra.toLowerCase();

        // Variável para armazenar a palavra invertida
        String palavraInvertida = "";

        // Invertendo a palavra
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }

        // Verificando se a palavra original é igual à palavra invertida
        if (palavra.equals(palavraInvertida)) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }

        // Fechando o scanner
        scanner.close();
    }
}
