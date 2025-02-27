import javax.swing.*;

public class Main {
 public static void main (String [] args){
     App app = new App();
     int opcion;

     do{
         opcion = Integer.parseInt(JOptionPane.showInputDialog(
                 "Seleccion una opción : \n"+
                  "1. Ingresa longitud de la constraseña\n"+
                  "2. Generar Contraseña \n"+
                  "3. Comprobar fortaleza de Contraseña \n" +
                  "4. Salir"
         ));
         switch(opcion){
             case 1:
                 app.IngresarLongitud();
                 break;
             case 2:
                 app.crearContraseña();
                 break;
             case 3:
                 app.comprobarFortaleza();
                 break;
             case 4:
                 JOptionPane.showMessageDialog(null, "Adios!");
                 break;
             case 5:
                JOptionPane.showMessageDialog(null, "Opción Invalida");
         }

     } while (opcion != 4);
 }
}