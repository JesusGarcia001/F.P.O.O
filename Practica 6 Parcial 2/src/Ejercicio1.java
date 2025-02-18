import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();

        for (int i=1; i<=numero; i++){
            if (i%2 != 0){
                System.out.print(i);
                if (i<numero - 1){
                    System.out.print(", ");
                }
            }
        }
    }
}