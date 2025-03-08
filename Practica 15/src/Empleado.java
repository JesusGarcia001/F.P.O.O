import javax.swing.JOptionPane;
import java.util.EmptyStackException;

public class Empleado {
    protected String nombre;
    protected int id;
    protected double salario;

    public Empleado(String nombre,int id, double salario){
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    public void mostrarInfo(){
        JOptionPane.showMessageDialog(null, "Nombre : "+ nombre+"\nID"+id+"\nSalario: "+ salario);
    }
}
