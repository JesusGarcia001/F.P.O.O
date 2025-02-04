//programa que pida al usuario dos palabras, y que indique cual de ellas es la más larga y por cuántas letras lo es.

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la primer palabra: ");
        String palabra1 = scanner.nextLine();

        System.out.print("Introduce la segunda palabra: ");
        String palabra2 = scanner.nextLine();

        if (palabra1.length() > palabra2.length()) {
            System.out.println("La palabra " + palabra1 + "es más larga que la palabra: " + palabra2 + " por " + (palabra1.length()-palabra2.length() + " letras."));

        }
          else if (palabra2.length() > palabra1.length()){
              System.out.println("La palabra "+ palabra2 + " es más larga que la palabra: "+ palabra1 + " por " + (palabra2.length()-palabra1.length()+ " letras"));

          }
        }
    }

