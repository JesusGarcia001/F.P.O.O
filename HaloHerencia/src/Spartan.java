public class Spartan extends Soldado {

    private int escudo;

    public Spartan(String nombre, int salud, String arma, int escudo) {
        super(nombre, salud, arma);
        this.escudo = escudo;
    }

    @Override
    public void recibirDano(int dano) {
        if (escudo > 0) {
            escudo -= dano;
        if(escudo < 0 ){
            salud += escudo;
            escudo = 0;
            }//llave 2ndo if
            System.out.println(nombre+ "Recibió daño : "+ escudo+"\n Salud : "+salud);

        }//llave 1er if
        else{
           super.recibirDano(dano);
        }//lave else
    }//llave RecibirDano

    public void recargarEscudo(){
        this.escudo = 100;
        System.out.println(nombre + "Ha recargado su escudo al máximo");
    }//llave recargarEscudo

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Escudo: "+ this.escudo);
    }//llave mostarInfo


}//llave final