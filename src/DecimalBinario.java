/*
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecimalBinario {
    public static void main(String[] args) {
        double decimalNumber = 12.50;
        int integerPart = (int) decimalNumber;
        double onlyDecimalNumber = decimalNumber - integerPart;

        // Convertir la parte entera a binario
        List<Integer> binaryNumbers = new ArrayList<>();
        int quotient = integerPart;

        while (quotient != 0) {
            int remainder = quotient % 2;
            binaryNumbers.add(remainder);
            quotient /= 2;
        }

        // Invertir la lista para obtener el orden correcto
        Collections.reverse(binaryNumbers);

        // Convertir la parte decimal a binario
        List<Integer> binaryFractional = new ArrayList<>();
        while (onlyDecimalNumber > 0 && binaryFractional.size() < 10) {  // Limitar a 10 dígitos decimales
            onlyDecimalNumber *= 2;
            int bit = (int) onlyDecimalNumber;
            binaryFractional.add(bit);
            onlyDecimalNumber -= bit;
        }

        // Mostrar el resultado
        System.out.print("El binario de " + decimalNumber + " es: ");
        for (int binaryNumber : binaryNumbers) {
            System.out.print(binaryNumber);
        }

        // Mostrar la parte fraccionaria si existe
        if (!binaryFractional.isEmpty()) {
            System.out.print(".");
            for (int bit : binaryFractional) {
                System.out.print(bit);
            }
        }
    }
}

