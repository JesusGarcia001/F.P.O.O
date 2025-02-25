
public class Spartan {

    private String nombre;
    private int salud,escudo;
    private String ArmaPrincipal;

    public Spartan(String nombre, int salud, int escudo, String armaPrincipal) {
        this.nombre = nombre;
        this.salud = salud;
        this.escudo = escudo;
        ArmaPrincipal = armaPrincipal;
    }

    public void mostrarInfo(){
        System.out.println("--------Información del Spartan-----------");
        System.out.println("Spartan: "+nombre);
        System.out.println("% de Salud: "+salud);
        System.out.println("% de Escudo: "+escudo);
        System.out.println("Arma Disponible: "+ArmaPrincipal);
        System.out.println("-------------------------------");

    }//llave mostrar info

    public void atacar(String enemigo){
        System.out.println(nombre+ " ataca a "+ enemigo+ " con "+ArmaPrincipal);
    }//llave atacar

    public void RecargarArma(int municiones){
        int restante = 10;
        int total =  restante+municiones;
        System.out.println(ArmaPrincipal+ " cuenta con : "+ total + " balas");

    }//llave Recargar arma

    public void Correr(boolean estatus){
        if (estatus){
            System.out.println(nombre+" está corriendo");
        }else {
            System.out.println(nombre+ " está detenido");
        }

        private void consultarCortana(){
            System.out.println("Conversación Privada");
        }//llave Consultar cortana

    }//llave Correr

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public String getArmaPrincipal() {
        return ArmaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        ArmaPrincipal = armaPrincipal;
    }

}//llave de la clase
