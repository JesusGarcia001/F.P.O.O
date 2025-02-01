import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la altura del triángulo: ");
        int n = scanner.nextInt();
        scanner.close();

        int num = 1;
        for (int i = 1; i <= n; i++) {
                for(int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
            System.out.println();
            }

        }
    }

