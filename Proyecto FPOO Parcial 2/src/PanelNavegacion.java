import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class PanelNavegacion extends JPanel{
    public PanelNavegacion(JPanel panelCentral){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JButton  botonPanelPrincipal = new JButton("Panel Principal");
        JButton botonInventario = new JButton("Inventario");
        JButton botonUsuarios = new JButton("Usuarios");
        JButton botonReportes = new JButton("Reportes");
        JButton botonConfiguracion = new JButton("Configuración");
        JButton botonCerrarSesion = new JButton("Cerrar Sesión");

        botonPanelPrincipal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (panelCentral.getLayout());
                cl.show(panelCentral, "Panel Principal");
            }
        });
        botonInventario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (panelCentral.getLayout());
                cl.show(panelCentral, "Inventario");
            }
        });

        botonUsuarios.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (panelCentral.getLayout());
                cl.show(panelCentral, "Usuarios");
            }
        });

        botonReportes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (panelCentral.getLayout());
                cl.show(panelCentral, "Reportes");
            }
        });

        botonConfiguracion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (panelCentral.getLayout());
                cl.show(panelCentral, "Configuración");
            }
        });

        botonCerrarSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Cerrar la aplicación
            }
        });


        add(botonPanelPrincipal);
        add(botonInventario);
        add(botonUsuarios);
        add(botonReportes);
        add(botonConfiguracion);
        add(botonCerrarSesion);
    }
    }


