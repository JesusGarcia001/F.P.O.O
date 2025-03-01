import javax.swing.*;
import java.awt.*;
import java.nio.charset.CodingErrorAction;
import java.util.jar.JarEntry;

public class Envio {
    private String codigoEnvio;
    private String destino;
    private double peso;

    //Constructor sobrecargado
    public Envio(String codigoEnvio, String destino){
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = 0;
    }

    public Envio(String codigoEnvio, String destino, double peso){
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }

    //Getters
    public String getCodigoEnvio(){
        return codigoEnvio;
    }

    public String getDestino(){
        return destino;
    }

    public double getPeso(){
        return peso;
    }

    //Setters
    public void setPeso(double peso){
        this.peso = peso;
    }

    //crear envio
    public static Envio crearEnvio(){
        String codigoEnvio = JOptionPane.showInputDialog("Ingrese el código de envio: ");
        String destino = JOptionPane.showInputDialog("Ingrese el destino del envío: ");
        String pesoStr= JOptionPane.showInputDialog("Ingrese el peso del envio(opcional");

        if (pesoStr.isEmpty()){
            return new Envio(codigoEnvio, destino);
        } else{
            double peso = Double.parseDouble(pesoStr);
            return new Envio(codigoEnvio, destino, peso);
        }
    }
}
