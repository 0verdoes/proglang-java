import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilsTest {
    
    public double EPSILION = 0.0001;
    
    @Test
    public void twoTwoSecondTest(){
        assertEquals(4, MathUtils.power(2, 2), EPSILION);
    }

    @Test
    public void twoNegativeTwoSecondTest(){
        assertEquals(0.25, MathUtils.power(2, -2), EPSILION);
    }

    @Test 
    public void somethingToZeroth(){
        //you can also put more asserts for more "dense"/complicated cases
        assertEquals(1, MathUtils.power(2, 0), EPSILION);
        assertEquals(1, MathUtils.power(3, 0), EPSILION);
        assertEquals(1, MathUtils.power(-10, 0), EPSILION);
    }

}