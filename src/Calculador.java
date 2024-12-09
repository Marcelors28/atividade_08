import java.util.Scanner;

public class Calculador {
    public static void main(String[] args) {
        // Criando um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pedindo ao usuário para inserir dois números
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Pedindo ao usuário para inserir um operador
        System.out.print("Digite um operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        double resultado = 0;
        boolean operadorValido = true;

        // Realizando a operação indicada pelo operador
        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    operadorValido = false;
                }
                break;
            default:
                System.out.println("Erro: Operador inválido.");
                operadorValido = false;
                break;
        }

        // Exibindo o resultado se o operador for válido
        if (operadorValido) {
            System.out.println("Resultado: " + resultado);
        }

        // Fechando o scanner
        scanner.close();
    }
}
