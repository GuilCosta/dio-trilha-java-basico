import java.util.InputMismatchException;
import java.util.Scanner;

// Exceção para os parâmetros inválidos
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        int parametroUm = 0;
        int parametroDois = 0;

        try {
            // Recebe o primeiro parâmetro do usuário
            System.out.println("Digite o primeiro parâmetro:");
            parametroUm = lerInteiro(terminal);

            // Recebe o segundo parâmetro do usuário
            System.out.println("Digite o segundo parâmetro:");
            parametroDois = lerInteiro(terminal);

            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (InputMismatchException e) {
            // Mensagem de erro se o usuário não digitar um número inteiro
            System.out.println("Erro: O número precisa ser um inteiro.");
        
        } catch (ParametrosInvalidosException e) {
            // Mensagem de erro se o segundo parâmetro for menor que o primeiro
            System.out.println("Erro: " + e.getMessage());
        
        } finally {
            // Fecha o Scanner
            terminal.close();
        }
    }

    // Método para garantir que a entrada é um inteiro
    public static int lerInteiro(Scanner terminal) throws InputMismatchException {
        int numero;
        try {
            numero = terminal.nextInt();
        } catch (InputMismatchException e) {
            terminal.next(); // Limpa a entrada inválida do scanner
            throw new InputMismatchException("Entrada inválida. O número precisa ser um inteiro.");
        }
        return numero;
    }

    // Método contar, que verifica e faz a contagem
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o primeiro parâmetro é maior que o segundo e lança a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        // Calcula a quantidade de iterações e executa a contagem
        int contagem = parametroDois - parametroUm;
        
        // Executa o loop para imprimir os números conforme a contagem calculada
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
