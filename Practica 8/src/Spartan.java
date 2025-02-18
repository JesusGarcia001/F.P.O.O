public class Spartan {
    public String nombre;
    int salud,escudo;
    String ArmaPrincipal;

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

    }//llave Correr

}//llave de la clase
