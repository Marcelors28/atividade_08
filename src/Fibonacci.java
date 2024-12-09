import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Criando um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pedindo ao usuário para inserir o valor de n
        System.out.print("Digite o número de termos da sequência de Fibonacci que deseja calcular: ");
        int n = scanner.nextInt();

        // Verificando se n é positivo
        if (n <= 0) {
            System.out.println("Por favor, insira um número positivo.");
        } else {
            System.out.println("Os primeiros " + n + " números da sequência de Fibonacci são:");

            // Calculando e exibindo os primeiros n números da sequência de Fibonacci
            long[] fibonacci = new long[n];
            fibonacci[0] = 0;

            if (n > 1) {
                fibonacci[1] = 1;
                for (int i = 2; i < n; i++) {
                    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                }
            }

            // Imprimindo a sequência
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci[i] + " ");
            }
        }

        // Fechando o scanner
        scanner.close();
    }
}
