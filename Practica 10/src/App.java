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

    public App(){
        this.longitud = 8;
        this.mayusculas = false;
        this.caracteresEspeciales = false;
        this.contraseña = "";
    }
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean isMayusculas() {
        return mayusculas;
    }

    public void setMayusculas(boolean mayusculas) {
        this.mayusculas = mayusculas;
    }

    public boolean isCaracteresEspeciales() {
        return caracteresEspeciales;
    }

    public void setCaracteresEspeciales(boolean caracteresEspeciales) {
        this.caracteresEspeciales = caracteresEspeciales;
    }

    public String getContraseña() {
        return contraseña;
    }

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
        this.mayusculas = "si".equalsIgnoreCase(respuestaMayusculas);
        if (this.mayusculas) {
            caracteresDisponibles.append(MAYUSCULAS);
        }
        String respuestaEspeciales = JOptionPane.showInputDialog("¿Desea incluir caracteres especiales? (si/no):");
        this.caracteresEspeciales = "si".equalsIgnoreCase(respuestaEspeciales);
        if (this.caracteresEspeciales) {
            caracteresDisponibles.append(ESPECIALES);
        }
        SecureRandom random = new SecureRandom();
        StringBuilder passwordGenerada = new StringBuilder(this.longitud);
        for (int i = 0; i < this.longitud; i++) {
            int index = random.nextInt(caracteresDisponibles.length());
            passwordGenerada.append(caracteresDisponibles.charAt(index));
        }
        this.contraseña = passwordGenerada.toString();
        JOptionPane.showMessageDialog(null, "Tu contraseña generada es: " + contraseña);
    }

    public void comprobarFortaleza() {
        int fortaleza = 0;
        if (this.longitud >= 12) fortaleza++;
        if (this.mayusculas) fortaleza++;
        if (this.caracteresEspeciales) fortaleza++;
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