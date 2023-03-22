package Ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {

    public static double raizCuadrada(int numero) {
        if (numero < 0)
            throw new IllegalArgumentException("El número no puede ser negativo");
        return Math.sqrt(numero);
    }
}
