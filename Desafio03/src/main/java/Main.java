import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scan.nextLine();

        Anagrama anagrama = new Anagrama();
        if (palavra.length()>1) {
            System.out.println("Quantidade de anagramas possíveis: " + anagrama.quantidadeAnagrama(palavra));

        } else {
            System.err.println("Deve conter no minimo 2 letras");
        }
    }
}