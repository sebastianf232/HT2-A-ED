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
        double oper1;
        double oper2;
        double res;
        double resFinal;
        String[] op = operation.split(" ");
        for (String a: op){
            if (a.equals("+")){
                oper1 = stack.peek();
                stack.remove();
                oper2 = stack.peek();
                stack.remove();
                res = oper1 + oper2;
                stack.add(res);
                
            } if (a.equals("-")) {
                oper1 = stack.peek();
                stack.remove();
                oper2 = stack.peek();
                stack.remove();
                res = oper1 - oper2;
                stack.add(res);
                
            } if (a.equals("*")) {
                oper1 = stack.peek();
                stack.remove();
                oper2 = stack.peek();
                stack.remove();
                res = oper1 * oper2;
                stack.add(res);
                
            } if (a.equals("/")) {
                oper1 = stack.peek();
                stack.remove();
                oper2 = stack.peek();
                stack.remove();
                res = oper1 / oper2;
                stack.add(res);
                
            } else {
                try{
                    stack.add(Double.valueOf(a));
                } catch (Exception e){
                    
                }
                
            }            
        }
        resFinal = stack.peek();
        return resFinal;
        
    }
    
}
