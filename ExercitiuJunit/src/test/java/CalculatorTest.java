import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void adunareTest(){
        System.out.println("Testam adunarea");
        int a = 3;
        int b = 5;
        int result = calculator.adunare(a,b);

        assertEquals(result,8);

    }
    @Test
    public void scadereTest(){
        System.out.println("Testam scaderea");
        int a = 3;
        int b = 5;
        int result = calculator.scadere(a,b);

        assertEquals(result,-2);
    }
    @Test
    public void inmultireTest(){
        System.out.println("Testam inmultirea");
        int a = 3;
        int b = 5;
        int result = calculator.inmultire(a,b);

        assertEquals(result,15);
    }
    @Test
    public void impartireTest(){
        System.out.println("Testam impartirea");
        int a = 20;
        int b = 5;
        int result = calculator.impartire(a,b);

        assertEquals(result,4);
    }
}
