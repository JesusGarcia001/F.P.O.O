import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000;

        while (true) {
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDeposito = scanner.nextDouble();
                    saldo += montoDeposito;
                    System.out.println("Depósito realizado. Saldo actual: " + saldo);
                    break;
                case 2:
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetiro = scanner.nextDouble();
                    if (montoRetiro > saldo) {
                        System.out.println("Fondos insuficientes.");
                    } else {
                        saldo -= montoRetiro;
                        System.out.println("Retiro realizado. Saldo actual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo final: " + saldo);
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}