public class Main {
    public static void main(String[] args) {
        //creamos el primer objeto
        Spartan MasterChief = new Spartan("Jefe Maestro",100,200,"Rifle de Asalto");

        //invocamos los metodos
        MasterChief.mostrarInfo();
        MasterChief.atacar("Grunt");
        MasterChief.RecargarArma(30);
        MasterChief.Correr(true);

        //intento de consulta cortana
        //MasterChief.consultaCortana();

        //usamos get y set para cambiar atributo nombre
        MasterChief.setNombre("Jesus Garcia");
        MasterChief.mostrarInfo();
        System.out.println(MasterChief.getNombre());

        //creamos otro objeto
        Spartan Noble6 = new Spartan("Noble 6", 95, 100, "Escopeta Gnasher");

        //invocamos los metodos
        Noble6.mostrarInfo();
        Noble6.atacar("Covenant");
        Noble6.RecargarArma(6);
        Noble6.Correr(false);

    }
}
