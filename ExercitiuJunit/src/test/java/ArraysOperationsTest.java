import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArraysOperationsTest {
    ArraysOperations arraysOperations= new ArraysOperations();
    @Test
    public void lungimeArrayTest(){
        System.out.println("Test lungime array");
        int[] numereIntregi = {2,4,6,12,15};
        int resut = arraysOperations.lungimeArray(numereIntregi);

        assertEquals(resut,5);
    }
    @Test
    public void numereMaiMariTest(){
        System.out.println("Test numere mai mari ca 5");
        int[] numere = {1,3,4,7,10,14};
        int result = arraysOperations.numereMaiMari(numere);

        assertEquals(result,3);
    }
}
