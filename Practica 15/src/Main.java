import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args){
        Empleado[] empleados = new Empleado[10];
        int contadorEmpleados = 0;

        while (true){
            String[] opciones = {"Agregar Empleado","Listar Empleados","Salir"};
            int eleccion = JOptionPane.showOptionDialog(null, "Elija una opción", "Sistema de Gestión de Empleados", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            if (eleccion == 0){
                String[] tiposEmpleado = {"Conductor", "Administrativo"};
                int tipoEmpleadoEleccion = JOptionPane.showOptionDialog(null, "Tipo de empleado", "Sistema de Gestión de Empleadoa",JOptionPane.DEFAULT_OPTION, JOptionPane. INFORMATION_MESSAGE, null, tiposEmpleado, tiposEmpleado[0]);

                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado :");
                int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado: "));
                double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado: "));

                if (tipoEmpleadoEleccion == 0){
                    String licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor: ");
                    empleados [contadorEmpleados++] = new Conductor(nombre, id, salario, licencia);
                }else if ( tipoEmpleadoEleccion == 1){
                    String departamento = JOptionPane.showInputDialog("Ingrese el departamento del administrativo: ");
                    empleados [contadorEmpleados++] = new Administrativo(nombre,id,salario,departamento);
                }
            }else if(eleccion == 1){
                for(int i = 0; i< contadorEmpleados ; i++){
                    empleados [i].mostrarInfo();
                }
            }else if (eleccion == 2){
                break;
            }
        }
    }
}