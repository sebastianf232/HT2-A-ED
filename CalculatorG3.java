import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;
import org.junit.*;
/**
 * Algoritmos y Estructuras de Datos
 * Universidad del Valle de Guatemala
 * Hoja de Trabajo No.2
 * Es la implementación de la interfaz Calculator.
 * @file CalculatorG3.java
 * @author Sebastián Franco 21484
 * @author Juan Miguel Gonzalez-Campo 21077
 * @author Dimitri Badani 20092
 */
public class CalculatorG3 implements Calculator{

    Stack<Double> stack = new StackG3<Double>();

    @Override
    public double calculate(String operation) {
        /**
         * Son los atributos que entran al Stack.
         * Dentro del stack se ve que tipo de simbolo es y se hace la operación a base de el.
         */
        double oper1;
        double oper2;
        double res;
        double resFinal;
        String[] op = operation.split(" ");
        for (String a: op){
            /**
             * Permite ver si el simbolo de entrada es una suma.
             */
            if (a.equals("+")){
                oper1 = stack.peek();
                stack.remove();
                oper2 = stack.peek();
                stack.remove();
                res = oper2 + oper1;
                stack.add(res);
            /**
             * Permite ver si el simbolo de entrada es una resta.
             */
            } if (a.equals("-")) {
                oper1 = stack.peek();
                stack.remove();
                oper2 = stack.peek();
                stack.remove();
                res = oper2 - oper1;
                stack.add(res);
            /**
             * Permite ver si el simbolo de entrada es una multiplicacion.
             */
            } if (a.equals("*")) {
                oper1 = stack.peek();
                stack.remove();
                oper2 = stack.peek();
                stack.remove();
                res = oper2 * oper1;
                stack.add(res);
                
            /**
             * Permite ver si el simbolo de entrada es una division.
             */
            } if (a.equals("/")) {
                oper1 = stack.peek();
                stack.remove();
                oper2 = stack.peek();
                stack.remove();
                res = oper2 / oper1;
                stack.add(res);
                
               
            } else {
                 /**
                 * Si no se encuentra ninguno de los simbolos el programa indica la excepcion.
                 */
                try{
                    stack.add(Double.valueOf(a));
                } catch (Exception e){
                    
                }
                
            }            
        }
        /** 
         * Se resuelve la operacion.
         */
        resFinal = stack.peek();
        return resFinal;
        
    }
    
}
