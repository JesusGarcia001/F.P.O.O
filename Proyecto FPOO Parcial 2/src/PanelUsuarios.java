import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelUsuarios extends JPanel{
   private DefaultTableModel model;
   private JTable tablaUsuarios;

   public PanelUsuarios(){
   setLayout(new BorderLayout());

   JPanel panelBusqueda = new JPanel();
   JTextField campoBusqueda = new JTextField(20);
   campoBusqueda.setToolTipText("Buscar usuario...");
   JButton botonAgergar = new JButton ("+ Agregar Empleado");
   panelBusqueda.add(campoBusqueda);
   panelBusqueda.add(botonAgergar);

   add(panelBusqueda, BorderLayout.NORTH);

   String[] nombreColumnas = {"ID", "Nombre", "Departamento", "Estado", "Acciones"};
   Object[][] datos = {
           {"1", "Juan Pérez", "Ventas", "Activo", "Editar / Eliminar"},
   };

   model = new DefaultTableModel(datos,nombreColumnas);
   tablaUsuarios = new JTable(model);
   add(new JScrollPane(tablaUsuarios), BorderLayout.CENTER);

   botonAgergar.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
           JTextField idField = new JTextField();
           JTextField nombreField = new JTextField();
           JTextField departamentoField = new JTextField();
           JTextField estadoField = new JTextField();

           Object[] message = {
                   "ID", idField,
                   "Nombre", nombreField,
                   "Departamento",departamentoField,
                   "Estado",estadoField,
           };

           int option = JOptionPane.showConfirmDialog(null, message, "Agregar nuevo empleado", JOptionPane.OK_CANCEL_OPTION);
           if (option == JOptionPane.OK_OPTION){
               String id = idField.getText();
               String nombre = nombreField.getText();
               String departamento = departamentoField.getText();
               String estado = estadoField.getText();

               model.addRow(new Object[]{id, nombre, departamento, estado, "Editar / Eliminar"});
           }
       }
   });
   }
}
