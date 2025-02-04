import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        System.out.print("Serie de Collatz para el número "+ numero + ": ");

        while (numero !=1){
            System.out.print(numero + " ");
            if (numero % 2 == 0){
                numero = numero/2;}
            else {
                numero = 3 * numero + 1;
            }
        }
    System.out.println(1);
    }
}
