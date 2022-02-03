import static org.junit.Assert.*;
import org.junit.*;

public class TestSkillDemo{
    @Test
    public void testMinus() {
        assertEquals(2, skillDemo.minus(5,1));
    }
}