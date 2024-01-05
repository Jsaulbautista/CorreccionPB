import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("\tCorrección de la prueba");
        System.out.println("Tipos de videojuegos");
        Videojuego mivideojuego;
        nombrejuego1 nombre1 = new nombrejuego1("COD", "Shouter", "10", "no");
        nombrejuego2 nombre2 = new nombrejuego2("Counter strike", "Shouter", "10", "no");
        nombrejuego3 nombre3 = new nombrejuego3("Mario Bross", "Aventura", "10", "si");

        nombre1.datos1();
        System.out.println("Nombre primer juego: " + nombre1.getNombre());
        System.out.println("tipo: "+ nombre1.getTipo());
        System.out.println("Clasificación: " + nombre1.getClasificacion());
        System.out.println("Es apto para todo público: "+nombre1.getApto_todo_publico());
        System.out.println();
        nombre2.datos2();
        System.out.println("Nombre segundo juego: " + nombre2.getNombre());
        System.out.println("tipo: "+ nombre2.getTipo());
        System.out.println("Clasificación: " + nombre2.getClasificacion());
        System.out.println("Es apto para todo público: "+nombre2.getApto_todo_publico());
        System.out.println();
        nombre3.datos3();
        System.out.println("Nombre segundo juego: " + nombre3.getNombre());
        System.out.println("tipo: "+ nombre3.getTipo());
        System.out.println("Clasificación: " + nombre3.getClasificacion());
        System.out.println("Es apto para todo público: "+nombre3.getApto_todo_publico());


        ArrayList<String> listajuegos = new ArrayList<String>();

        listajuegos.add(nombre1.nombre);
        listajuegos.add(nombre2.nombre);
        listajuegos.add(nombre3.nombre);

        for (int i=0; i<3; i++){
            System.out.println(listajuegos.get(i));
        }

        System.out.println();
        try {
            for (int i=0; i<4; i++){
                System.out.println(listajuegos.get(i));
            }
        }
        catch(Exception e){
            System.out.println();
            System.out.println("El bucle tiene más iteraciones que el arreglo...");
        }
    }



}