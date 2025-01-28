import java.util.Scanner;

public class ejercicio5 {


        public static void main(String[] args){
            Scanner scanner = new Scanner (System.in);

            System.out.print("Introduce el número de payasos vendidos: ");

            int payasos = scanner.nextInt();
            System.out.print("Introduce el número de muñecas vendidas: ");
            int munecas = scanner.nextInt();

            int pesopayasos = payasos * 112;
            int pesomunecas = munecas * 75;

            int pesototal = pesopayasos + pesomunecas;

            System.out.println("El peso total del paquete es: "+ pesototal + " gramos");
        }
    }

