import java.util.Scanner;

public class ejercicio1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce el número de horas trabajadas: ");
            double horasTrabajadas = scanner.nextDouble();

            System.out.print("Introduce el coste por hora: ");
            double costePorHora = scanner.nextDouble();

            double paga = horasTrabajadas * costePorHora;

            System.out.println("La paga que le corresponde es: " + paga + " MILLONES DE PESOS ");
        }
    }


