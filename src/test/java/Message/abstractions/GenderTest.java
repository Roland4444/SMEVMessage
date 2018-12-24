package Message.abstractions;

import junit.framework.TestCase;

public class GenderTest extends TestCase {

    public void testToString() {
        Gender G = Gender.F;
        Gender R = Gender.M;
        assertEquals(G.toString(),"F");
        assertEquals(R.toString(), "M");
    }
}