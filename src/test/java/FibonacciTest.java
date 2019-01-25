import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class FibonacciTest {

    private Fibonacci fibonacci;

    //1 1 2 3 5 8 13 21 34 55
    //0 1 2 3 4 5 6  7  8  9 - zero based index
    @Before
    public void initFibonacci(){
        fibonacci = new Fibonacci();
    }

    @Test(expected = RuntimeException.class)
    public void testWhenFibonacciIsNegativeComputeRecursiveMethodReturnsRuntimeException(){
        fibonacci.computeRecursive(-1);
    }
    @Test
    public void testWhenFibonacciIndexIsZeroComputeRecursiveMethodReturnsOne(){
        assertEquals(1, fibonacci.computeRecursive(0));
    }
    @Test
    public void testWhenFibonacciIndexIsOneComputeRecursiveMethodReturnsOne(){
        assertEquals(1, fibonacci.computeRecursive(1));
    }


    @Test
    public void testWhenFibonacciIndexIsTwoComputeRecursiveMethodReturnsTwo(){
        assertEquals(2, fibonacci.computeRecursive(2));
    }
    @Test
    public void testWhenFibonacciIndexIsFourComputeRecursiveMethodReturnsFive(){
        assertEquals(5, fibonacci.computeRecursive(4));
    }
    @Test
    public void testWhenFibonacciIndexIsSevenComputeRecursiveMethodReturns21(){
        assertEquals(21, fibonacci.computeRecursive(7));
    }

    @Test(expected = RuntimeException.class)
    public void testWhenFibonacciIsNegativeIndexComputeNonRecursiveMethodReturnsRuntimeException(){
        fibonacci.computeNonRecursive(-1);
    }

    @Test
    public void testWhenFibonacciIndexIsZeroComputeNonRecursiveMethodReturnsOne(){
        assertEquals(1, fibonacci.computeNonRecursive(0));
    }


    @Test
    public void testWhenFibonacciIndexIsOneComputeNonRecursiveMethodReturnsOne(){
        assertEquals(1, fibonacci.computeNonRecursive(1));
    }

    @Test
    public void testWhenFibonacciIndexIsTwoComputeNonRecursiveMethodReturnsTwo(){
        assertEquals(2, fibonacci.computeNonRecursive(2));
    }

    @Test
    public void testWhenFibonacciIndexIsFiveComputeNonRecursiveMethodReturnsFive(){
        //assertEquals(5, fibonacci.computeNonRecursive(4));
        assertThat(fibonacci.computeNonRecursive(4), is(5));
    }

    @Test
    public void testWhenFibonacciIndexIsSevenComputeNonRecursiveMethodReturns21(){
        assertEquals(21, fibonacci.computeNonRecursive(7));
    }

}
