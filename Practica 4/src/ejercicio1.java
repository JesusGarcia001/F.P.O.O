import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.print("Números impares desde 1 hasta " + num + ": ");
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
    }
}