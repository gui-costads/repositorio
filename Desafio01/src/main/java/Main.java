import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InputMismatchException {

        Scanner scan = new Scanner(System.in);
        try {

            System.out.print("Digite quantos degraus deseja: ");
            int n = scan.nextInt();

            Escada escada = new Escada();
            escada.desenharEscada(n);

        } catch (InputMismatchException e) {
            System.err.println("Somente numeros inteiros positivos. Programa Encerrado.");
        }
    }
}
