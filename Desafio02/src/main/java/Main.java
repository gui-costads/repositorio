import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            Scanner scan = new Scanner(System.in);

            System.out.println("Digite seu nome: ");
            String nome = scan.nextLine();

            System.out.println("Digite sua senha: ");
            String senha = scan.nextLine();

            ValidarSenha validarSenha = new ValidarSenha();

            if (validarSenha.validarSenha(senha) == 0) {
                System.out.println(nome + ", senha cadastrada.");
            } else {
                System.out.println("Precisa preencher mais " + validarSenha.validarSenha(senha) + " requisitos.");

                System.err.println("""
                        Possuir no mínimo 6 caracteres.Possuir mínimo 1 digito.
                        Possuir no mínimo 1 letra em minúsculo.
                        Possuir no mínimo 1 letra em maiúsculo.
                        Possuir no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+""");
            }
        }
    }
}
