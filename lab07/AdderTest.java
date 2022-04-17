import org.junit.Test;
import static org.junit.Assert.*;

/**
 * With the test only we discovered more bugs in the code.
 * TODOs are a great way to sign the issues to colleagues in future.
 * Great example of how usefull UNIT tests can be.
 */
public class AdderTest {
 
    private static final double EPSILON = 0.01;

    @Test
    public void testIntegerSum(){
        assertEquals("3", Adder.add("1", "2"));
        assertEquals("-1", Adder.add("1", "-2"));
        assertEquals("6", Adder.add(Adder.add("1", "2"), "3"));
        assertEquals("6", Adder.add("1", Adder.add("2", "3")));
    }

    @Test
    public void testDoubleSum(){
        String strSum = null;
        assertEquals("3.0", strSum = Adder.add("1.0", "2.0"));
        assertEquals(3.0, Double.parseDouble(strSum), EPSILON);
        assertEquals("-1.0", Adder.add("1.0", "-2.0"));
    }
    
    @Test(expected = IllegalArgumentException.class)//doesnt work TODO: fix
    public void testBinaryInput(){
        assertEquals(1, 0B01);
        assertEquals(3, 0B11);//binary literals work like this in java
        assertEquals("3", Adder.add("0b10", "0b01"));
    }
    @Test(expected = NullPointerException.class)//throwing IllegalArgumentException would be better implementation TODO: fix
    public void testNullParameter(){
        assertEquals("3", Adder.add("1", null));
    }
    @Test
    public void testSpaceAtStartOfLiteral()// work only with double result TODO: fix
        assertEquals("3.0", Adder.add(" 1", " 2"));

    }
}
