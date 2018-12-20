package Message.toSMEV;

import Message.toSMEV.ESIAFind.ESIAFindMessageInitial;
import junit.framework.TestCase;

public class ESIAFindMessageTest extends TestCase {

    public void testGetMobilefromplain() {
        String plain = "9608607763";
        assertEquals(ESIAFindMessageInitial.getMobilefromplain(plain), "+7(960)8607763");

    }


    public void testGetSNILSfromplain(){
        String etalon ="229-785-346 20";
        String initial = "22978534620";
        assertEquals(etalon, ESIAFindMessageInitial.getSNILSfromplain(initial));


    }
}