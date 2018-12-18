package Message.toSMEV;

import junit.framework.TestCase;

public class ESIAFindMessageTest extends TestCase {

    public void testGetMobilefromplain() {
        String plain = "9608607763";
        assertEquals(ESIAFindMessage.getMobilefromplain(plain), "+7(960)8607763");

    }


    public void testGetSNILSfromplain(){
        String etalon ="229-785-346 20";
        String initial = "22978534620";
        assertEquals(etalon, ESIAFindMessage.getSNILSfromplain(initial));


    }
}