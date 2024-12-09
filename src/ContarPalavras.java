import java.util.Scanner;

public class ContarPalavras {
    public static void main(String[] args) {
        // Criando um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pedindo ao usuário para inserir uma frase
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

        // Dividindo a frase em palavras usando espaços em branco como delimitadores
        String[] palavras = frase.split(" ");

        // Contando o número de palavras
        int numeroDePalavras = palavras.length;

        // Exibindo o resultado
        System.out.println("Número de palavras na frase: " + numeroDePalavras);

        // Fechando o scanner
        scanner.close();
    }
}
