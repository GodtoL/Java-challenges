import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class ContadorPalabras {
    public static void main(String[] args){
        String word = "Hola como estamos HOY ? Y CON hoy me refiero a HOy y hola";
        word = word + " ";

        List<String> words = new ArrayList<>();
        char[] letters = new char[word.length()];
        int index = 0;

        for (char letter : word.toCharArray()){
            letters[index] = letter;
            index += 1;
            if (letter == ' '){
                String wordTemp = new String(letters);
                wordTemp = wordTemp.replace("\u0000", "").trim();
                words.add(wordTemp);
                Arrays.fill(letters, '\0');
            }
        }
        HashMap<String, Integer> wordsHash = new HashMap<>();
        for (String wordIndex : words){
            String wordLower = wordIndex.toLowerCase();
            if (wordsHash.containsKey(wordLower)){
                int count = wordsHash.get(wordLower) + 1;
                wordsHash.put(wordLower, count);
            } else{
                wordsHash.put(wordLower, 1);
            }
        }

        for (String name : wordsHash.keySet()) {
            System.out.println('"' + name + '"'+ " tiene " + wordsHash.get(name) + " repeticiones.");
        }
    }
}
