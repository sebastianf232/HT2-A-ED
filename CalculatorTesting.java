import static org.junit.Assert.*;
import org.junit.Test;


public class CalculatorTesting {
    CalculatorG3 calc = new CalculatorG3();
    StackG3<Double> st = new StackG3<Double>();
    Double ej = 15.0;
    Double ej1 = 25.0;

    @Test
    public void testCalculate(){
        String str = "1 2 + 4 * 3 +";
        String str2 = "4 5 + 6 / 9 * 5 -";
        assertEquals(15, this.calc.calculate(str),  1);
        assertEquals(8.5, this.calc.calculate(str2), 0.1);

    }
    @Test
    public void testAdd(){
        st.add(ej);
        assertEquals(15.0, st.peek(), 0.01);
        st.add(ej1);
        assertEquals(25.0, st.peek(), 0.01);

    }
    @Test
    public void testRemove(){
        st.add(ej);
        st.add(ej1);
        assertEquals(25.0, st.peek(), 0.01);
        st.remove();
        assertEquals(15.0, st.remove(), 0.01);
    }
    @Test
    public void testPeek(){
        st.add(ej);
        assertEquals(15.0, st.peek(), 0.01);
    }
    @Test
    public void testEmpty(){
        st.add(ej);
        assertEquals(false, st.empty());
        st.remove();
        assertEquals(true, st.empty());
    }
    @Test
    public void testSize(){
        st.add(ej);
        assertEquals(1, st.size());
        st.add(ej1);
        assertEquals(2, st.size());
        st.remove();
        assertEquals(1, st.size());
    }
}
