import java.util.Scanner;

public class funcionesDos {
    private static void dibujaCuadrado(int lado) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (j == 0 || i == 0 || j == lado - 1 || i == lado - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void main(String args[]) {
        int lado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe el lado del cuadrado que quieres dibujar");
        lado = entrada.nextInt();
        dibujaCuadrado(lado);

        /*
         * int suma1, suma2, numero1, numero2;
         * suma1 = suma(5, 7);
         * suma2 = suma(10, 20);
         * 
         * System.out.println(suma1 + " otra suma " + suma2);
         * 
         */
    }
}
