import static org.junit.Assert.*;
import org.junit.*;

public class skillDemoTest {
    @Test
    public void testMultiply(){
        assertEquals(4, skillDemo.multiply(2, 3));
    }
}
