public class SpartanIV extends Spartan {
    public SpartanIV(String nombre, int salud, String arma, int escudo){
        super(nombre,salud,arma,100);
    }

    public void usarPropulsores(){
        System.out.println(nombre+" Está usando propulsores");
    }//llave usarPropulsores

}//llave final
