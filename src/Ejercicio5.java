import java.util.Scanner;

/**
 * Ejercicio 5 - Sumas progresivas
 *
 * @author Silvia
 * @version 1
 */

public class Ejercicio5 {
    public static void main(String[] args) {

        //Variables; El contador empiezá en 3 porque los números 1 y 2 se imprimen, y luego se comprueban el resto de números.
        int num1, num2, limite, contador = 3;

        //Flujo de entrada
        Scanner sc = new Scanner(System.in);

        //Solicitar datos
        System.out.println("Introduce dos números iniciales: ");
        System.out.println("Número 1: ");
        num1 = sc.nextInt();

        sc.nextLine(); //Limpiar buffer

        //Segundo número mayor que el primero
        do {
            System.out.println("Número 2: ");
            num2 = sc.nextInt();

            if (num2 < num1) {
                System.out.println("El segundo número debe ser mayor que el primero.");
            }
        } while (num2 < num1);

        //El límite tiene que ser mayor que 2
        do {
            System.out.println("Introduce el límite: ");
            limite = sc.nextInt();

            if (limite <= 2) {
                System.out.println("El límite tiene que ser mayor que 2.");
            }
        } while (limite <= 2);

        System.out.println(num1); // num 1
        System.out.println(num2); // num 2

        //Comprobar si llego al límite
        while (limite >= contador) {

            if (contador % 2 == 1) {
                System.out.println(num1 + num2); // num 3,5,7...(impares)
                num1 += num2; //El nuevo número uno pasará a ser la suma de ambos
            } else {
                System.out.println(num1 + num2); // num 4,6,8...(pares)
                num2 += num1; //El nuevo número dos pasará a ser la suma de ambos
            }
            contador++;
        }


    }
}
