import java.util.Arrays;
import java.util.HashMap;

public class Anagrama {

    public int quantidadeAnagrama(String palavra) {

   HashMap<String, Integer> map= new HashMap<>();

    for(int i = 0; i < palavra.length(); i++){
        for(int j = i; j < palavra.length(); j++){

            char[] letras = palavra.substring(i, j+1).toCharArray();//"corta" a string em todas as combinações
            Arrays.sort(letras);
            String valor = new String(letras); // passando o conteúdo para uma nova variavel de tipo String
            if (map.containsKey(valor)){ //verifica se contem mais uma combinação e
                map.put(valor, map.get(valor)+1); //valor passa a ser 2
            }
            else
                map.put(valor, 1);
            }
        }
    int contarAnagrama = 0;
        for(String key: map.keySet()){
            int n = map.get(key);
            contarAnagrama += (n * (n-1))/2; //equação pra somar só aqueles que tem valor 2
        }
        return contarAnagrama;
    }
}