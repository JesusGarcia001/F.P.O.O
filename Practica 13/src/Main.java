import javax.swing.*;

public class Main {
    public static void main(String [] args){
        Vehiculo vehiculo = new Vehiculo();
        Conductor conductor = new Conductor();
        vehiculo.asignarConductor(conductor);

        Envio envio = Envio.crearEnvio();
        Entrega entrega = new Entrega(envio.getCodigoEnvio());

        String menu = "1. Crear nuevo vehículo \n " +
                "2. Crear nuevo conductor \n" +
                "3. Crear nuevo envío \n" +
                "4. Actualizar estado de entrega \n" +
                "5. Ver Información del vehiculo \n"+
                "6. Salir";

        int opcion;

        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion){
                case 1:
                    vehiculo = new Vehiculo();
                    break;
                case 2:
                    conductor = new Conductor ();
                    vehiculo.asignarConductor(conductor);
                    break;
                case 3:
                    envio = Envio.crearEnvio();
                    entrega = new Entrega(envio.getCodigoEnvio());
                    break;
                case 4:
                    entrega.actualizarEstado();
                    break;
                case 5:
                    vehiculo.mostrarInfo();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo del Programa. ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción Invalida");

            }
        }
while(opcion != 5);
    }
}