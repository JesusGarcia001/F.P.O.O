import javax.swing.JOptionPane;


public class Cuenta {
    private String numerocuenta;
    private String titular;
    private int edad;
    private float saldo;

    public Cuenta(String numerocuenta, String titular, int edad, float saldo){
        this.numerocuenta = numerocuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = saldo;
    }

    public String getNumerocuenta(){
        return numerocuenta;
    }
    public String getTitular(){
        return titular;
    }
    public int getEdad(){
        return edad;
    }
    public float getSaldo(){
        return saldo;
    }

    public void setNumerocuenta(String numerocuenta){
        this.numerocuenta = numerocuenta;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    //metodods
    public void mostrarinfo(){
        System.out.println("-----Información de la Cuenta---------");
        System.out.println("Titular: "+titular);
        System.out.println("Edad: "+edad);
        System.out.println("No. Cuenta: "+numerocuenta);
        System.out.println("Saldo: $"+saldo);
        System.out.println("-------------------------------------");
    }

    public void consultarSaldo(){
        JOptionPane.showMessageDialog(null, "Saldo actual :$"+saldo);
    }
    public void ingresarEfectivo(double cantidad){
        saldo += cantidad;
        JOptionPane.showMessageDialog(null, "Has ingresado $"+cantidad+" Nuevo saldo: $"+saldo);
    }
    public void retirarEfectivo(double cantidad){
        if (cantidad<= saldo){
            saldo -= cantidad;
            JOptionPane.showInputDialog(null, "Has retirado $"+cantidad+ "Nuevo saldo : $"+saldo);
        }else{
            JOptionPane.showMessageDialog(null, "Saldo insuficiente. ");
        }
    }
    public void depositarAcuenta(Cuenta otracuenta, double cantidad){
        if (cantidad <= saldo){
            saldo -= cantidad;
            otracuenta.ingresarEfectivo(cantidad);
            JOptionPane.showMessageDialog(null, "Has depositado $"+cantidad+" a la cuenta "+otracuenta.getNumerocuenta());
        }else{
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente.");
        }
    }
}
