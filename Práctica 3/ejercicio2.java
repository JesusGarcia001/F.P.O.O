import java.util.Scanner;

public class ejercicio2 {

    class FormaterarNombre{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce tu nombre completo: ");
            String NombreCompleto = scanner.nextLine();

            System.out.println("Minusculas: " + NombreCompleto.toLowerCase());
            System.out.println("Mayúsculas: " + NombreCompleto.toUpperCase());
            System.out.println("Capitalizado: "+ capitalizar(NombreCompleto));
        }
        private static String capitalizar (String texto){
            String[] palabras = texto.split(" ");
            StringBuilder resultado = new StringBuilder();

            for (String palabra : palabras){
                resultado.append(palabra.substring(0,1).toUpperCase()).append(palabra.substring(1).toLowerCase()).append(" ");
            }
            return resultado.toString().trim();
        }
    }



}
