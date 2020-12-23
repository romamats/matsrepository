package bean;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.NumberType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SignComparatorTest {
    SignComparator signComparator;

    @Before
    public void setUp(){
        signComparator = new SignComparator();
    }

    @Test
    public void numbtype() {
        String expected = "Number is positive";
        String actual = signComparator.compare(2);
        assertEquals(expected,actual);
    }
    @Test
    public void numbtype2() {
        String expected = "Number is negative";
        String actual = signComparator.compare(-20);
        assertEquals(expected,actual);

}
}
