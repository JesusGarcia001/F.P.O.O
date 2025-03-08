import javax.swing.*;
import java.awt.*;
//Este es el ejecutable final
public class SistemaInventario {
    public static void main (String [] args){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        JFrame ventana = new JFrame("Sistema de Inventario");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 600);

        JPanel panelCentral = new JPanel(new CardLayout());

        PanelUsuarios panelUsuarios = new PanelUsuarios();
        PanelInventario panelInventario = new PanelInventario();
        JPanel panelReportes = new JPanel();
        panelReportes.add(new JLabel("Sección de Reportes"));
        JPanel panelConfiguracion = new JPanel();
        panelConfiguracion.add(new JLabel("Sección de Configuración"));
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.add(new JLabel("Panel Principal"));

        panelCentral.add(panelPrincipal, "Panel Principal");
        panelCentral.add(panelUsuarios, "Usuarios");
        panelCentral.add(panelInventario, "Inventario");
        panelCentral.add(panelReportes, "Reportes");
        panelCentral.add(panelConfiguracion, "Configuración");

        PanelNavegacion panelNavegacion = new PanelNavegacion(panelCentral);

        ventana.getContentPane().add(panelNavegacion, BorderLayout.WEST);
        ventana.getContentPane().add(panelCentral, BorderLayout.CENTER);

        ventana.setVisible(true);
    }
}