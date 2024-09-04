/*
 * Crea un programa que sea capaz de transformar texto natural a código
 * morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar
 *   la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras
 *   o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en
 *   https://es.wikipedia.org/wiki/Código_morse.
 */

import java.util.HashMap;
import java.util.Map;

public class MorseAlfabeto {
    // Colecciones de alfabetos a morse y viceversa
    private static final Map<String, String> morseToAlphabet = new HashMap<>();
    private static final Map<String, String> alphabetToMorse = new HashMap<>();

    static {
        initializeAlphabetToMorse();
        initializeMorseToAlphabet();
    }

    public static void main(String[] args) {
        String textAlphabetToMorse = convAlphaabethToMorse("Hola mundo");
        System.out.println(textAlphabetToMorse);
        String textAMorseToAlphabet = convMorseToAlphabet(".... --- .-.. .-   -- ..- -. -.. ---");
        System.out.println(textAMorseToAlphabet);
    }

    // Agregar las letras del alfabeto y sus correspondientes códigos Morse
    public static void initializeAlphabetToMorse() {
        alphabetToMorse.put("A", "·—");
        alphabetToMorse.put("B", "—···");
        alphabetToMorse.put("C", "—·—·");
        alphabetToMorse.put("D", "—··");
        alphabetToMorse.put("E", "·");
        alphabetToMorse.put("F", "··—·");
        alphabetToMorse.put("G", "——·");
        alphabetToMorse.put("H", "····");
        alphabetToMorse.put("I", "··");
        alphabetToMorse.put("J", "·———");
        alphabetToMorse.put("K", "—·—");
        alphabetToMorse.put("L", "·—··");
        alphabetToMorse.put("M", "——");
        alphabetToMorse.put("N", "—·");
        alphabetToMorse.put("O", "———");
        alphabetToMorse.put("P", "·——·");
        alphabetToMorse.put("Q", "——·—");
        alphabetToMorse.put("R", "·—·");
        alphabetToMorse.put("S", "···");
        alphabetToMorse.put("T", "—");
        alphabetToMorse.put("U", "··—");
        alphabetToMorse.put("V", "···—");
        alphabetToMorse.put("W", "·——");
        alphabetToMorse.put("X", "—··—");
        alphabetToMorse.put("Y", "—·——");
        alphabetToMorse.put("Z", "——··");

        // Agregar los números del 0 al 9 y sus correspondientes códigos Morse
        alphabetToMorse.put("0", "—————");
        alphabetToMorse.put("1", "·————");
        alphabetToMorse.put("2", "··———");
        alphabetToMorse.put("3", "···——");
        alphabetToMorse.put("4", "····—");
        alphabetToMorse.put("5", "·····");
        alphabetToMorse.put("6", "—····");
        alphabetToMorse.put("7", "——···");
        alphabetToMorse.put("8", "———··");
        alphabetToMorse.put("9", "————·");
    }

    // Agregando los datos de alfabeto a morse
    public static void initializeMorseToAlphabet() {
        for (Map.Entry<String, String> entry : alphabetToMorse.entrySet()) {
            String key = entry.getValue();
            String value = entry.getKey();
            morseToAlphabet.put(key, value);
        }
    }

    // Conversor de alfabeto a morse
    public static String convAlphaabethToMorse(String alfabeth) {
        StringBuilder sbResult = new StringBuilder();
        for (char letter : alfabeth.toUpperCase().toCharArray()) {
            String morse = alphabetToMorse.get(String.valueOf(letter));
            if (morse != null) {
                sbResult.append(morse).append(" ");
            } else if (letter == ' ') {
                sbResult.append("  ");
            }
        }
        return sbResult.toString();
    }

    // Conversor de morse a alfabeto
    public static String convMorseToAlphabet(String morse){
        StringBuilder result = new StringBuilder();
        // Usa una expresión regular para dividir por espacios simples o dobles
        String[] morseArray = morse.trim().split("\\s{1,}");

        for (String morseCode : morseArray) {
            if (morseCode.isEmpty()) {
                result.append(" "); // Añade un espacio para separar palabras
            } else {
                String letter = morseToAlphabet.get(morseCode);
                if (letter != null) {
                    result.append(letter);
                } else {
                    result.append('?'); // Añade un símbolo de interrogación para caracteres no encontrados
                }
            }
        }
        return result.toString();
    }
}
