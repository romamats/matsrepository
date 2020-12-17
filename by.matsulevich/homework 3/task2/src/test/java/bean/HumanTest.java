package bean;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {
Human human;
@Before
public void setUp(){
    Human human = new Human (15, "Roma");
}
    @Test
    public void testToString() {
    String expected = "Human{age=15, name='Roma'}";
    String actual = human.toString();
    assertEquals(expected, actual);
    }

    @Test
    public void testEquals() {
        Human human1 = new Human(15, "Roma");
        human1 = human;
        Human expected = human1;
        assertEquals(expected, human);
    }

    @Test
    public void testHashCode() {
        Human expected = new Human(15, "Roma");
        Human actual = new Human(15, "Roma");
        Assert.assertTrue(expected.equals(actual) && actual.equals(expected));
    }
}