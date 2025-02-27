import javax.swing.*;
import java.security.SecureRandom;

public class App {
    private static final String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITOS = "0123456789";
    private static final String ESPECIALES = "!@#$%^&*()-_+";

    private int longitud = 8;
    private boolean mayusculas;
    private boolean caracteresEspeciales;
    private String contraseña;


    public void IngresarLongitud(){
        String input = JOptionPane.showInputDialog("Ingresa la longutud: ");
        if (input == null || input.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "No se ingreso ningún valor, se usará una longitud por defecto de 8");
            longitud = 8;
        }else {
            longitud = Integer.parseInt(input);
        }
    }

    public void crearContraseña() {
        StringBuilder caracteresDisponibles = new StringBuilder(MINUSCULAS + DIGITOS);
        String respuestaMayusculas = JOptionPane.showInputDialog("¿Desea incluir mayúsculas? (si/no):");
        mayusculas = "si".equalsIgnoreCase(respuestaMayusculas);
        if (mayusculas) {
            caracteresDisponibles.append(MAYUSCULAS);
        }
        String respuestaEspeciales = JOptionPane.showInputDialog("¿Desea incluir caracteres especiales? (si/no):");
        caracteresEspeciales = "si".equalsIgnoreCase(respuestaEspeciales);
        if (caracteresEspeciales) {
            caracteresDisponibles.append(ESPECIALES);
        }
        SecureRandom random = new SecureRandom();
        StringBuilder passwordGenerada = new StringBuilder(longitud);
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteresDisponibles.length());
            passwordGenerada.append(caracteresDisponibles.charAt(index));
        }
        contraseña = passwordGenerada.toString();
        JOptionPane.showMessageDialog(null, "Tu contraseña generada es: " + contraseña);
    }

    public void comprobarFortaleza() {
        int fortaleza = 0;
        if (longitud >= 12) fortaleza++;
        if (mayusculas) fortaleza++;
        if (caracteresEspeciales) fortaleza++;
        if (fortaleza == 3) {
            JOptionPane.showMessageDialog(null, "El password es MUY FUERTE.");
        } else if (fortaleza == 2) {
            JOptionPane.showMessageDialog(null, "El password es FUERTE.");
        } else if (fortaleza == 1) {
            JOptionPane.showMessageDialog(null, "El password es DÉBIL.");
        } else {
            JOptionPane.showMessageDialog(null, "El password es MUY DÉBIL.");
        }
    }
}