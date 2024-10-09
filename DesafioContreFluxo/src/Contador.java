import java.util.Scanner;
public class Contador {

        public static void main(String[] args) {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = terminal.nextInt();

            try {

                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException exception) {
                // Imprimindo a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println(exception.getMessage());
            }
        }

        static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
            // Validar se o parametroUm é maior que parametroDois e lançar a exceção
            if (parametroUm >= parametroDois) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            }

            // Realizar a contagem
            int contagem = parametroDois - parametroUm;
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número: " + i);
            }
        }
    }


