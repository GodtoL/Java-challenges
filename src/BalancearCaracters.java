import java.util.Stack;

/*
 * Crea un programa que comprueba si los paréntesis, llaves y corchetes
 * de una expresión están equilibrados.
 * - Equilibrado significa que estos delimitadores se abren y cieran
 *   en orden y de forma correcta.
 * - Paréntesis, llaves y corchetes son igual de prioritarios.
 *   No hay uno más importante que otro.
 * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
 * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
 */
import java.util.Stack;

public class BalancearCaracters {
    public static void main(String[] args) {
        String expresion1 = "{ [ a * ( c + d ) ] - 5 }";
        String expresion2 = "{ a * ( c + d ) ] - 5 }";
        String expresion3 = "((([{}])))[[{{}}]]({[]})";
        String expresion4 = "(a + b) * {c - [d + e)] / 2}";
        String[] expresions = {expresion4, expresion3, expresion1, expresion2};
        for (int i = 0; i < expresions.length; i++) {
            if (isBalanced(expresions[i])) {
                System.out.println("La expresión " + i + " es balanceada");
            } else {
                System.out.println("La expresión " + i + " es falsa");
            }
        }
    }

    public static Boolean isBalanced(String expresion) {
        Stack<Character> charactersStack = new Stack<>();
        for (char c : expresion.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                // Agregar los paréntesis de apertura a la pila
                charactersStack.push(c);
            } else if (c == '}' || c == ')' || c == ']') {
                // Verificar si la pila está vacía o si no coinciden los paréntesis
                if (charactersStack.empty()) {
                    return false;
                }
                char top = charactersStack.pop();
                if ((c == '}' && top != '{') ||
                        (c == ')' && top != '(') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        // Verificar si la pila está vacía al final
        return charactersStack.empty();
    }
}
