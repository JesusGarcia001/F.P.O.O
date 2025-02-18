import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la altura del triangulo: ");
        int altura = scanner.nextInt();

        for (int i=1; i<=altura; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
