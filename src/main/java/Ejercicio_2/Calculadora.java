package Ejercicio_2;

import java.util.Scanner;

public class Calculadora {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        inicio();
    }

    public static void inicio() {
        do {
        System.out.println("Introduce el primer número: ");
        int a = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        int b = sc.nextInt();
        System.out.println("Introduce la operación que quieres realizar ( + , - , * , / ): ");
        String operacion = sc.next();
            try {
                switch (operacion) {
                    case "+":
                        System.out.println("El resultado de la suma es " + Operacion.sumar(a, b));
                        break;
                    case "-":
                        System.out.println("El resultado de la resta es " + Operacion.restar(a, b));
                        break;
                    case "*":
                        System.out.println("El resultado de la multiplicación es " + Operacion.multiplicar(a, b));
                        break;
                    case "/":
                        System.out.println("El resultado de la división es " + a / b);
                        break;
                    case "s":
                        System.out.println("Saliendo...");
                        return;
                    default:
                        System.out.println("Operación no válida");
                        break;
                }
            } catch (DesbordaCapacidadExcepcion e) {
                System.out.println(e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir entre 0");
            }
        } while (true);
    }
}
