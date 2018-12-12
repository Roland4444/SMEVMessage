package Message;

import junit.framework.TestCase;

public class ESIAFindMessageTest extends TestCase {

    public void testSaveESIAFindMessage() {
        String name = "Ivan";
        String surname="Ivanov";
        String middle= "Ivanovich";
        String snils = "000";

        ESIAFindMessage efm = new ESIAFindMessage();
        efm.MiddleName=middle;
        efm.Name=name;
        efm.Surname=surname;
        efm.OperatorSnils=snils;

        ESIAFindMessage restored = ESIAFindMessage.restoreESIAFindMessage(ESIAFindMessage.saveESIAFindMessage(efm));
        assertEquals(name, restored.Name);
        assertEquals(surname, restored.Surname);
        assertEquals(middle, restored.MiddleName);
        assertEquals(snils, restored.OperatorSnils);



    }
}