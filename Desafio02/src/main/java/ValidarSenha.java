import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarSenha {

    public int validarSenha(String senha) {

        int requisito = validarCharEspecial(senha)
                        + validarMinuscula(senha)
                        + validarMaiuscula(senha)
                        +validarNumeral(senha);


        if (requisito + validarTamanho(senha) == 5) {//
            return 0;
        }
        if(requisito == 4 ){
            return 6 - senha.length() ;
        }
        if(requisito == 3 && senha.length()<6){
            return 6 - senha.length();
        }
        if( requisito == 2 && senha.length()<5){
            return  6 - senha.length();
        }
        if( requisito == 1 && senha.length()<= 3){
            return 6 - senha.length();
        }




        return 4-requisito;

}
    private static int validarMaiuscula(String senha) {
        //validar Maiuscula
        Pattern pattern = Pattern.compile("\\p{javaUpperCase}+");
        Matcher match = pattern.matcher(senha);

        if ( match.find()){
            return 1;
        }return 0;
    }
    private static int  validarMinuscula(String senha) {
        //validar Minusculo
        Pattern pattern = Pattern.compile("\\p{javaLowerCase}+");
        Matcher match = pattern.matcher(senha);
        if ( match.find()){
            return 1;
        }return 0;
    }
    private static int validarNumeral(String senha) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher match = pattern.matcher(senha);
        if ( match.find()){
            return 1;
        }return 0;
    }
    //validar caracteres especiais
    private static int validarCharEspecial(String senha) {
        Pattern pattern = Pattern.compile("[!@#$%^&*()\\-+]+");
        Matcher match = pattern.matcher(senha);
        if ( match.find()){
            return 1;
        }return 0;
    }
    //validar minimo 6 caracteres
    private int  validarTamanho(String senha) {
        if( senha.length() >= 6){
            return 1;
        }return 0;
    }
}