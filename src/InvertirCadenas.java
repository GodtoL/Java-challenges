import java.util.Scanner;

public class InvertirCadenas {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String word = scanner.nextLine();
        char[] charWord = word.toCharArray();
        for (int i = charWord.length - 1; i >= 0; i-- ){
            System.out.println(charWord[i]);
        }}
    }

