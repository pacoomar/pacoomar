//import java.util.Scanner;

public class funciones {
    private static int suma(int numero1, int numero2) {
        int suma;
        suma = numero1 + numero2;
        return suma;

    }

    public static void main(String args[]) {
        int suma1, suma2, numero1, numero2;
        suma1 = suma(5, 7);
        suma2 = suma(10, 20);

        System.out.println(suma1 + " otra suma " + suma2);
    }
}
// PRUEBA COMMIT