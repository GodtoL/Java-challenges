import java.util.*;

/*
 * Crea una función que reciba dos cadenas como parámetro (str1, str2)
 * e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO
 *   estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO
 *   estén presentes en str1.
 */
public class EliminaCaracteres {
    public static void main (String[] args){
        String str1 = "calculadora";
        String str2 = "ventiladorv2";
        // salida esperada en out1 = "ccu"
        filterWords(str1, str2);
        // salida espeda en out2 = "ventiv2"
    }

    public static void filterWords(String str1, String str2) {
        int count = 0;
        List<Character> result1 = new ArrayList<>();
        List<Character> result2 = new ArrayList<>();
        Set<Character> charactersToDelete = new HashSet<>();
        for (char c : str1.toCharArray()){
            result1.add(c);
            count++;
            for (char a : str2.toCharArray()){
                if (count == 1){
                    result2.add(a);
                }
                if (a == c){
                    charactersToDelete.add(c);
                }
            }
        }
        result1.removeAll(charactersToDelete);
        result2.removeAll(charactersToDelete);
        String out1 = result1.toString();
        String out2 = result2.toString();
        System.out.println(out1);
        System.out.println(out2);
    }
}
