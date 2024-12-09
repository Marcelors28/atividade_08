import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        // Criando um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Criando um objeto Random para gerar o número aleatório
        Random random = new Random();
        int numeroAleatorio = random.nextInt(50) + 1; // Gera um número entre 1 e 50

        // Variável para armazenar o palpite do usuário
        int palpite = 0;

        // Loop do jogo de adivinhação
        while (palpite != numeroAleatorio) {
            // Pedindo ao usuário para inserir um palpite
            System.out.print("Digite um número entre 1 e 50: ");
            palpite = scanner.nextInt();

            // Verificando se o palpite está correto ou errado
            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você adivinhou o número!");
            } else {
                System.out.println("Errado. Tente novamente.");
            }
        }

        // Fechando o scanner
        scanner.close();
    }
}
