import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numeroUm = entrada.nextInt();
        System.out.println("Digite o primeiro número: ");
        int numeroDois = entrada.nextInt();
        try {
            contar(numeroUm, numeroDois);
        } catch (ParametrosInvalidosException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    public static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException {
        if (numeroDois < numeroUm) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }
        int contador = numeroDois - numeroUm;
        for (int x = numeroUm; x <= numeroDois; x++) {
            System.out.println("Contando..." + x);
        }
    }
}