import java.util.Scanner;

public class ejercicio3 {

    class SumaHastaX{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce un número entero X: ");
            int x = scanner.nextInt();

            int suma = 0;
            for (int i = 1; i <= x; i++) {
                suma += i;
                System.out.println("Suma parcial hasta "+ i + ": "+ suma);
            }
            System.out.println("La suma de los enteros desde 1 hasta " + x + " es: " + suma);
        }
    }

}
