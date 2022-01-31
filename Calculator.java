/**
 * Algoritmos y Estructuras de Datos
 * Universidad del Valle de Guatemala
 * Hoja de Trabajo No.2
 * Defines all the methods that a Calculator should have
 * @file Calculator.java
 * @author Sebastián Franco 21484
 * @author Juan Miguel Gonzalez-Campo 21077
 * @author Dimitri Badani 20092
 */
public interface Calculator {
    /**
     * Calculates an entire operation.
     * @param operation String containing the operation to be calculated.
     * @return double with the result of the operation
     */
    public double calculate(String operation);
}
