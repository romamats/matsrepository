package bean;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DogTest {

    Dog dog;

    @Before
    public void setUp() {
        dog = new Dog(40, "Finik", "Grey");
    }

    @Test
    public void testToString() {

        dog.setAge(40);
        dog.setName("Finik");
        dog.setColor("Grey");

        String expected = "Dog{age=40, name='Finik', color='Grey'}";
        String actual = dog.toString();
        assertEquals(expected, actual);
    }
    @Test
    public void testHashCode() {
        Dog expected = new Dog(40,"Finik", "Grey");
        Dog actual = new Dog(40,"Finik", "Grey");
        assertEquals(expected.hashCode(), actual.hashCode());
}

    }

