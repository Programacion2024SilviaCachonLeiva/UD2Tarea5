import java.util.Scanner;

/**
 * Ejercicio 3 - Números mayores y menores
 *
 * @author Silvia
 * @version 1
 */

public class Ejercicio3 {
    public static void main(String[] args) {

        //Variables
        int mayor, menor, num;

        //Flujo de entrada
        Scanner sc = new Scanner(System.in);

        //Introducir primer número
        System.out.println("Introduce un número: ");
        num = sc.nextInt();

        //El primer número será tanto el mayor como el menor si no se introduce otro.
        mayor = menor = num;

        //Si es 0 terminará
        while (num != 0) {

            //Comprobar si es mayor a partir del segundo num
            if (num > mayor) {
                mayor = num;
            }
            //Comprobar si es menor a partir del segundo num
            if (num < menor) {
                menor = num;
            }

            //Introducir nuevo número
            System.out.println("Introduce un número: ");
            num = sc.nextInt();

        }

            System.out.println("El número mayor es: " + mayor);
            System.out.println("El número menor es: " + menor);

    }
}
