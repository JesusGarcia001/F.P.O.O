import java.util.Scanner;

public class ejercicio4 {


        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce tu nombre: ");
            String nombre = scanner.nextLine();

            String nombresinespacios = nombre.replace(" ", "");

            System.out.println(nombre.toUpperCase()+ " tiene "+ nombresinespacios.length()+ " letras ");

        }
    }
