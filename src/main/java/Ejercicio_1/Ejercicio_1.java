package Ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {

    public static double raizCuadrada(int numero) {
        if (numero < 0)
            throw new IllegalArgumentException("El número no puede ser negativo");
        return Math.sqrt(numero);
    }

public static void iniciar() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número: ");
    try {
        int numero = sc.nextInt();
        System.out.println("La raíz cuadrada de " + numero + " es " + raizCuadrada(numero));
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
}

    public static void main(String[] args) {
        iniciar();
    }
}
