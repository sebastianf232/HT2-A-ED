import java.util.Vector;

/**
 * Algoritmos y Estructuras de Datos
 * Universidad del Valle de Guatemala
 * Hoja de Trabajo No.2
 * Es la implementación de la interfaz Stack
 * @file StackG3.java
 * @author Sebastián Franco 21484
 * @author Juan Miguel Gonzalez-Campo 21077
 * @author Dimitri Badani 20092
 */

public class StackG3<E> implements Stack<E>{

    Vector<E> v = new Vector<E>();

    @Override
    public void add(E item) {
        v.addElement(item);
    }

    @Override
    public E remove() {
        if (v.size()>0){
            return v.remove(v.size()-1);
        }
        return null;
    }

    @Override
    public E peek() {
        if (v.size()>0){
            return v.get(v.size()-1);
        }
        return null;
    }

    @Override
    public boolean empty() {
        if(v.size()>0){
            return false;
        }
        return true;
    }

    @Override
    public int size() {
        return v.size();
    }
    
}
