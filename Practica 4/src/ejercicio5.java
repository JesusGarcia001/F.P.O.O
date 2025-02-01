import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        System.out.print("Ingrese una letra: ");
        char letra = scanner.next().charAt(0);
        scanner.close();

        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.toLowerCase().charAt(i) == Character.toLowerCase(letra)) {
                contador++;
            }
        }

        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
    }
}