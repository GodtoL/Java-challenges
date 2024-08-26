import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera palabra: ");
        String word1 = scanner.nextLine();

        System.out.print("Ingrese la segunda palabra: ");
        String word2 = scanner.nextLine();

        word1 = word1.replace(" ", "").toLowerCase();
        word2 = word2.replace(" ", "").toLowerCase();

        char[] characters1 = word1.toCharArray();
        char[] characters2 = word2.toCharArray();

        Arrays.sort(characters1);
        Arrays.sort(characters2);

        if (Arrays.equals(characters1, characters2)){
            System.out.println("Es un anagrama");
        }
        else {
            System.out.println("No es anagrama");
        }
    }
}
