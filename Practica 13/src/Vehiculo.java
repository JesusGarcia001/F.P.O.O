import javax.swing.JOptionPane;

public class Vehiculo {
    private String placa;
    private String modelo;
    private double capacidadCarga;
    private Conductor conductor;

    //Constructor
    public Vehiculo(){
        this.placa = JOptionPane.showInputDialog("Ingrese la placa del vehiculo: ");
        this.modelo = JOptionPane.showInputDialog("Ingrese el modelo de su vehiculo: ");
        this.capacidadCarga = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga: "));
        this.conductor = null;
    }

    //Getters
    public String getPlaca(){
        return placa;
    }
    public String getModelo(){
        return modelo;
    }
    public double getCapacidadCarga(){
        return capacidadCarga;
    }

    //setters
    public void setPlaca(String placa){
        this.placa = placa;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setCapacidadCarga(double capacidadCarga){
        this.capacidadCarga = capacidadCarga;
    }

    public void asignarConductor(Conductor conductor){
        if (this.conductor ==null){
            this.conductor = conductor;
        } else {
                JOptionPane.showMessageDialog(null, "El conductor ya ha sido asignado y no se puede cambiar.");
        }
    }

}
