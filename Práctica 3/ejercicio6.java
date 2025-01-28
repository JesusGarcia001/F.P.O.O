import java.util.Scanner;

public class ejercicio6 {


    class InvertirFrase{
        public static void main (String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce una frase: ");
            String frase = scanner.nextLine();

            String fraseinvertida = new StringBuilder(frase).reverse().toString();

            System.out.println("La frase invertida es: "+ fraseinvertida);

        }
    }
}
