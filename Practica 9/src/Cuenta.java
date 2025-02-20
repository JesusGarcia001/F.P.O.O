import javax.swing.JOptionPane;


public class Cuenta {
    private String numerocuenta;
    private String titular;
    private int edad;
    private float saldo;

    public void mostrarinfo(){
        System.out.println("----Información de la Cuenta------------");
        System.out.println("Titular: "+titular);
        System.out.println("Edad: "+ edad);
        System.out.println("No. Cuenta: "+ numerocuenta);
        System.out.println("Saldo : $"+saldo);
        System.out.println("-----------------------------");
    }

    public void ConsultarSaldo(){
        JOptionPane.showMessageDialog(null,"Saldo actual: $"+saldo);
    }//llave JOptionPane

    public void ingresarefectivo(double cantidad){
        saldo += cantidad;
        JOptionPane.showMessageDialog(null,"Has ingresado $"+cantidad+ " Nuevo saldo: $"+saldo);
    }

    public void retirarEfectivo(double cantidad){
        if(cantidad <= saldo){
            saldo-=cantidad;
            JOptionPane.showMessageDialog(null,"Has retirado $"+ cantidad+ " Nuevo saldo: $"+saldo);
        } else{
            JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
        }
    }

    public void depositarAcuenta(Cuenta otracuenta, double cantidad){
        if (cantidad <= saldo){
            saldo -= cantidad;
            otracuenta.saldo += cantidad;
            JOptionPane.showMessageDialog(null, "Has depositado $"+cantidad+" a la cuenta "+otracuenta.numerocuenta);
        }else{
            JOptionPane.showMessageDialog(null,"Saldo Insuficiente.");
        }
    }

    public static void main (String[] args) {
        Cuenta cuenta1 = new Cuenta();
        cuenta1.numerocuenta = JOptionPane.showInputDialog("Ingrese el numero de cuenta:");
        cuenta1.titular = JOptionPane.showInputDialog("Ingrese el titular de la cuenta");
        cuenta1.edad = (int) Double.parseDouble(JOptionPane.showInputDialog("Ingerse la edad del titular"));
        cuenta1.saldo = (float) Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo inicial"));
        cuenta1.mostrarinfo();
        cuenta1.ConsultarSaldo();


        boolean salir = false;
        while (!salir) {
            String[] opciones = {"Consultar Saldo", "Ingresar Efectivo", "Retirar Efectivo", "Depositar a otra cuenta", "Salir"};
            int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Administración de la cuenta", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0:
                    cuenta1.ConsultarSaldo();
                    break;

                case 1:
                    double cantidadingreso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a ingresar: "));
                    if(cantidadingreso > 0 ) {
                        cuenta1.ingresarefectivo(cantidadingreso);
                    }else {
                        JOptionPane.showMessageDialog(null, "La cantidad de ser positiva");
                    }

                    break;

                case 2:
                    double cantidadretiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a retirar: "));
                   if(cantidadretiro > 0) {
                       cuenta1.retirarEfectivo(cantidadretiro);
                   }else {
                       JOptionPane.showMessageDialog(null,"La cantidad debe de ser positiva");
                   }
                       break;

                case 3:
                    Cuenta cuenta2 = new Cuenta();
                    cuenta2.numerocuenta = JOptionPane.showInputDialog("Ingrese la cuenta a depositar");
                    cuenta2.titular = JOptionPane.showInputDialog("Ingrese el titular de la cuenta");
                    cuenta2.edad = Integer.parseInt((JOptionPane.showInputDialog("Ingrese la edad del titular de la cuenta: ")));
                    cuenta2.saldo = (float) Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo inicial de la otra cuenta: "));
                    double cantidaddeposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a depositar: "));

                    cuenta1.depositarAcuenta(cuenta2, cantidaddeposito);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no válida.");

                case 4 :
                    salir = true;
                        JOptionPane.showMessageDialog(null, "Gracias por usar este menu estuvo padrisimo");
            }

        }
    }
}
