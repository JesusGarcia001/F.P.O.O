import javax.swing.JOptionPane;

public class Main {
    public static void main(String [] args){
        String numCuenta = JOptionPane.showInputDialog("Ingrese el numero de la cuenta: ");
        String nombreTitular = JOptionPane.showInputDialog("Ingrese el titular de la cuenta: ");
        int edadTitular = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del titular: "));
        float saldoInicial = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el saldo inicial: "));

        Cuenta cuenta1 = new Cuenta(numCuenta, nombreTitular, edadTitular, saldoInicial);
        cuenta1.mostrarinfo();
        cuenta1.consultarSaldo();

        boolean salir = false;
        while (!salir){
            String[] opciones = {"Consultar Saldo", "Ingresar Efectivo", "Retirar EFectivo", "Depositar a otra cuenta", "Salir"};
            int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Administración de la cuenta", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion){
                case 0: cuenta1.consultarSaldo();
                break;

                case 1:
                    double cantidadIngreso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a ingresar: "));
                    if (cantidadIngreso > 0){
                        cuenta1.ingresarEfectivo(cantidadIngreso);
                    }else{
                        JOptionPane.showMessageDialog(null,"La cantidad debe ser positiva");
                    }
                    break;

                case 2:
                    double cantidadRetiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad que desea retirar: "));
                    if (cantidadRetiro > 0){
                        cuenta1.retirarEfectivo(cantidadRetiro);
                    }else {
                        JOptionPane.showMessageDialog(null,"La cantidad debe ser positiva.");
                    }
                    break;

                case 3:
                    numCuenta = JOptionPane.showInputDialog("Ingrese la cuenta a depositar: ");
                    nombreTitular = JOptionPane.showInputDialog("Ingrese el titular de la otra cuenta: ");
                    edadTitular = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del titular de la otra cuenta :"));
                    saldoInicial = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el saldo inicial de la otra cuenta: "));
                    Cuenta cuenta2 = new Cuenta ( numCuenta, nombreTitular, edadTitular, saldoInicial);
                    double cantidadDeposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a depositar: "));

                    cuenta1.depositarAcuenta(cuenta2, cantidadDeposito);
                    break;

                case 4:
                    salir = true;
                    JOptionPane.showMessageDialog(null, "Gracias por usar este menú, estivo padrísimo");
                    break;

                default: JOptionPane.showMessageDialog(null, "Opción no válida");
            }



        }
    }


}
