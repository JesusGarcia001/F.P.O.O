import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PanelInventario extends JPanel{
    private DefaultTableModel modelo;

    public PanelInventario() {
        setLayout(new BorderLayout());

        JPanel panelHerramientas = new JPanel();
        JTextField campoBusqueda = new JTextField(20);
        campoBusqueda.setToolTipText("Buscar producto...");
        JButton botonAgregarProducto = new JButton("+ Agregar producto");
        panelHerramientas.add(campoBusqueda);
        panelHerramientas.add(botonAgregarProducto);

        add(panelHerramientas, BorderLayout.NORTH);

        String[] nombresColumnas = {"ID", "Nombre", "Categoría", "Cantidad", "Precio", "Acciones"};
        Object[][] datos = {
                {"1", "Producto 1", "Categoría 1", "10", "$100", "Editar / Eliminar"},

        };
        modelo = new DefaultTableModel(datos, nombresColumnas);
        JTable tablaInventario = new JTable(modelo);
        add(new JScrollPane(tablaInventario), BorderLayout.CENTER);

        botonAgregarProducto.addActionListener(e -> {
            JTextField campoID = new JTextField();
            JTextField campoNombre = new JTextField();
            JTextField campoCategoria = new JTextField();
            JTextField campoCantidad = new JTextField();
            JTextField campoPrecio = new JTextField();

            Object[] message = {
                    "ID:", campoID,
                    "Nombre:", campoNombre,
                    "Categoría:", campoCategoria,
                    "Cantidad:", campoCantidad,
                    "Precio:", campoPrecio
            };

            int option = JOptionPane.showConfirmDialog(null, message, "Agregar nuevo producto", JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {

                String id = campoID.getText();
                String nombre = campoNombre.getText();
                String categoria = campoCategoria.getText();
                String cantidad = campoCantidad.getText();
                String precio = campoPrecio.getText();


                modelo.addRow(new Object[]{id, nombre, categoria, cantidad, precio, "Editar / Eliminar"});
            }
        });
    }

}
