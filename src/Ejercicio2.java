import java.util.Scanner;

/**
 * Ejercicio 2 - Suma de pares e impares
 *
 * @author Silvia
 * @version 1
 */

public class Ejercicio2 {
    public static void main(String[] args) {

        //Variables
        int inicio = 1, num, par = 0, impar = 0;

        //Flujo de entrada
        Scanner sc = new Scanner(System.in);

        //Solicitud de número
        System.out.println("Introduce un número: ");
        num = sc.nextInt();

        //Sumas de pares e impares
        do {
            if (inicio % 2 == 0) {
                par += inicio;
            } else if (inicio % 2 == 1) {
                impar += inicio;
            }
            inicio++;
        } while (inicio <= num);

        System.out.println("La suma de los pares desde el 1 hasta el " + num + " es " + par);
        System.out.println("La suma de los impares desde el 1 hasta el " + num + " es " + impar);
    }
}
