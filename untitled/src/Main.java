import javax.swing.*;
import java.awt.*;

public class InventorySystemUI extends JFrame {
    public InventorySystemUI() {
        setTitle("Sistema de Inventario");
        setSize(900, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel superior
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(Color.WHITE);

        JLabel adminLabel = new JLabel("Administrador");
        adminLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JLabel bellIcon = new JLabel("🔔"); // Simulación de icono de campana

        JPanel adminPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        adminPanel.setBackground(Color.WHITE);
        adminPanel.add(bellIcon);
        adminPanel.add(adminLabel);

        topPanel.add(adminPanel, BorderLayout.EAST);

        // Panel lateral (Menú)
        JPanel sidePanel = new JPanel();
        sidePanel.setLayout(new BoxLayout(sidePanel, BoxLayout.Y_AXIS));
        sidePanel.setBackground(Color.LIGHT_GRAY);
        sidePanel.setPreferredSize(new Dimension(200, getHeight()));

        JLabel titleLabel = new JLabel("Sistema de Inventario", SwingConstants.CENTER);
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton panelPrincipalBtn = new JButton("Panel Principal");
        JButton inventarioBtn = new JButton("Inventario");
        JButton usuariosBtn = new JButton("Usuarios");
        JButton reportesBtn = new JButton("Reportes");
        JButton configBtn = new JButton("Configuración");
        JButton cerrarSesionBtn = new JButton("Cerrar Sesión");

        sidePanel.add(titleLabel);
        sidePanel.add(Box.createVerticalStrut(10));
        sidePanel.add(panelPrincipalBtn);
        sidePanel.add(Box.createVerticalStrut(10));
        sidePanel.add(inventarioBtn);
        sidePanel.add(Box.createVerticalStrut(10));
        sidePanel.add(usuariosBtn);
        sidePanel.add(Box.createVerticalStrut(10));
        sidePanel.add(reportesBtn);
        sidePanel.add(Box.createVerticalStrut(10));
        sidePanel.add(configBtn);
        sidePanel.add(Box.createVerticalStrut(10));
        sidePanel.add(cerrarSesionBtn);

        // Panel principal con información de usuarios
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(new Color(240, 240, 230));

        JLabel panelTitle = new JLabel("Usuarios");
        panelTitle.setFont(new Font("Arial", Font.BOLD, 16));
        panelTitle.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel searchPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JTextField searchField = new JTextField(20);
        searchField.setText("Buscar usuario...");
        JButton addEmployeeBtn = new JButton("+ Agregar empleado");

        searchPanel.add(searchField);
        searchPanel.add(addEmployeeBtn);

        String[] columnNames = {"ID", "Nombre", "Departamento", "Estado", "Acciones"};
        Object[][] data = {
                {"0", "", "", "", "Editar   Eliminar Contraseña"},
                {"0", "", "", "", "Editar   Eliminar Contraseña"}
        };
        JTable userTable = new JTable(data, columnNames);
        JScrollPane tableScrollPane = new JScrollPane(userTable);

        mainPanel.add(panelTitle);
        mainPanel.add(searchPanel);
        mainPanel.add(tableScrollPane);

        // Agregar paneles al contenedor principal
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(topPanel, BorderLayout.NORTH);
        getContentPane().add(sidePanel, BorderLayout.WEST);
        getContentPane().add(mainPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new InventorySystemUI().setVisible(true);
        });
    }
}