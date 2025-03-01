import javax.swing.*;

public class Conductor {
    private String nombre;
    private String identificación;
    private String licencia;

    //Constructor
    public Conductor(){
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del Conductor: ");
        this.identificación = JOptionPane.showInputDialog("Ingrese la identificación del conductor: ");
        this.licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor: ");
    }

    //Getters
    public String getNombre(){
        return nombre;
    }

    public String getIdentificación(){
        return identificación;
    }

    public String getLicencia(){
        return licencia;
    }
}
