package Ejercicio_2;

public class Operacion {

    public static int sumar(int a, int b) throws DesbordaCapacidadExcepcion {
        int resultado = a + b;
        if (resultado - b != a)
            throw new DesbordaCapacidadExcepcion("El resultado de la suma es demasiado grande");
        return resultado;
    }

    public static int restar(int a, int b) throws DesbordaCapacidadExcepcion {
        int resultado = a - b;
        if (resultado + b != a)
            throw new DesbordaCapacidadExcepcion("El resultado de la resta es demasiado pequeño");
        return resultado;
    }

    public static int multiplicar(int a, int b) throws DesbordaCapacidadExcepcion {
        int resultado = a * b;
        if (resultado / a != b)
            throw new DesbordaCapacidadExcepcion("El resultado de la multiplicación es demasiado grande");
        return resultado;
    }
}
