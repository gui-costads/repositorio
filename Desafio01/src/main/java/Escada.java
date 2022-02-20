public class Escada {

    public void desenharEscada(int n) {
        desenharEscada( n, 0);
    }
    private  String desenharEscada(int n, int j){

        if(n <= 0 ){

            return "";
        }
        String esp = " ";
        String ast = "*";
        String escada = (esp.repeat(n-1) + (ast.repeat(j+1)));
        System.out  .println(escada);

        return desenharEscada((n-1), j+1);
    }
}

