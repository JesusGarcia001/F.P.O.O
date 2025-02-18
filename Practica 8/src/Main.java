public class Main {
    public static void main(String[] args) {
        //creamos el primer objeto
        Spartan MasterChief = new Spartan();

        //usar atributos
        MasterChief.nombre = "Emilie";
        MasterChief.salud = 100;
        MasterChief.escudo = 200;
        MasterChief.ArmaPrincipal = "Rifle de Asalto";

        //invocamos los metodos
        MasterChief.mostrarInfo();
        MasterChief.atacar("Covenant");
        MasterChief.RecargarArma(30);
        MasterChief.Correr(true);

        //creamos otro objeto
        Spartan Noble6 = new Spartan();

        Noble6.nombre = "Noble 6 ";
        Noble6.salud =95;
        Noble6.escudo = 100;
        Noble6.ArmaPrincipal = "escopeta Gnasher";

        //invocamos los metodos
        Noble6.mostrarInfo();
        Noble6.atacar("Covenant");
        Noble6.RecargarArma(6);
        Noble6.Correr(false);


    }
}
