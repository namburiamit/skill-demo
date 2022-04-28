import static org.junit.Assert.*;
import org.junit.*;

public class skillDemoTest {
    @Test
    public void testMultiply(){
        assertEquals(6, skillDemo.multiply(2, 3));// this was expec ted to fail.
    }
}
