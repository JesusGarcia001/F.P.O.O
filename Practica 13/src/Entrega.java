import javax.swing.*;

public class Entrega {
    private String numeroGuia;
    private String estado;

    //constructor
    public Entrega (String numeroGuia){
        this.numeroGuia = numeroGuia;
        this.estado = "Pediente";
    }
     //actualizar estado
    public void actualizarEstado(){
        String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado (En tránsito / Entregado");
        if (nuevoEstado.equals("En tránsito")||nuevoEstado.equals("Entregado")){
            this.estado = nuevoEstado;
        }else{
            JOptionPane.showMessageDialog(null, "Estado inválido. Solo se permiten esos estados solamente, revisa la ortografía.");
        }
    }

    //getter
    public String getNumeroGuia(){
        return numeroGuia;
    }

    public String getEstado(){
        return estado;
    }


}


