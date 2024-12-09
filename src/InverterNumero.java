import java.util.Scanner;

public class InverterNumero {
    public static void main(String[] args) {
        // Criando um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pedindo ao usuário para inserir um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Variável para armazenar o número invertido
        int numeroInvertido = 0;

        // Invertendo o número
        while (numero != 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }

        // Exibindo o número invertido
        System.out.println("Número invertido: " + numeroInvertido);

        // Fechando o scanner
        scanner.close();
    }
}
