import java.util.Arrays;
import java.util.Scanner;

public class VerificarAnagramas {
    public static void main(String[] args) {
        // Criando um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pedindo ao usuário para inserir as duas palavras
        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        // Verificando se as palavras são anagramas
        if (saoAnagramas(palavra1, palavra2)) {
            System.out.println("As palavras são anagramas.");
        } else {
            System.out.println("As palavras não são anagramas.");
        }

        // Fechando o scanner
        scanner.close();
    }

    // Método para verificar se duas palavras são anagramas
    public static boolean saoAnagramas(String palavra1, String palavra2) {
        // Convertendo as palavras para minúsculas para ignorar diferenças de caso
        palavra1 = palavra1.toLowerCase();
        palavra2 = palavra2.toLowerCase();

        // Convertendo as palavras para arrays de caracteres
        char[] array1 = palavra1.toCharArray();
        char[] array2 = palavra2.toCharArray();

        // Ordenando os arrays de caracteres
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Verificando se os arrays ordenados são iguais
        return Arrays.equals(array1, array2);
    }
}
