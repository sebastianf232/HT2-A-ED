import java.io.BufferedReader;
import java.io.FileReader;
/**
 * Algoritmos y Estructuras de Datos
 * Universidad del Valle de Guatemala
 * Hoja de Trabajo No.2
 * Es la clase que corre el programa.
 * @file Main.java
 * @author Sebastián Franco 21484
 * @author Juan Miguel Gonzalez-Campo 21077
 * @author Dimitri Badani 20092
 */
import java.util.ArrayList;

public class Main {
/**
 * Se importa el txt. y se crea un ArrayList para guardar sus elementos.
 */
static String path = "datos.txt";
static String line = null;
static ArrayList<String> a = new ArrayList<String>();

public static void leerArchivo(){
    try {
        /**
         * Mientras haya un archivo, se lee.
         */
        BufferedReader reader = new BufferedReader(new FileReader(path));
        while((line = reader.readLine()) != null){
            a.add(line);
        }
    } catch(Exception e){
        System.out.println("Error al leer archivo");
    }
}
public static void cambiarLista(){
    /**
     * Se lee la nueva linea del archivo de texto.
     */
    for (int i = 0; i < a.size(); i++) {
        a.get(i).split(" ");
    }
}


	public static void main(String args[]) {
        CalculatorG3 calc = new CalculatorG3();
        double respuesta;
        leerArchivo();
        for (int i = 0; i < a.size(); i++) {
            respuesta = calc.calculate(a.get(i));
            System.out.println("Respuesta operacion "+(i+1)+": "+Double.toString(respuesta));
        }

    }
}
