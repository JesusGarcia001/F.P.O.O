import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.print("Cuenta atrás desde " + num + " hasta 0: ");
        for (int i = num; i >= 0; i--) {
            System.out.print(i + ", ");
        }
    }
}