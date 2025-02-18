import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();

        for (int i = numero; i>=0; i--){
            System.out.print(i);
            if (i > 0){
                System.out.print(", ");
            }
        }
    }
}
