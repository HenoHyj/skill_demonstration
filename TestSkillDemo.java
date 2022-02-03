import static org.junit.Assert.*;
import org.junit.*;

public class TestSkillDemo{
    @Test
    public void testMinus() {
        assertEquals(2, skillDemo.minus(5,3));
    }
}


/**
 * Linux:
 * javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar TestSkillDemo.java
 * java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore TestSkillDemo
 */