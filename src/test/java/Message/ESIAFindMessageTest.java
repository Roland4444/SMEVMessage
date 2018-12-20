package Message;


import Message.abstractions.BinaryMessage;
import Message.toSMEV.ESIAFind.ESIAFindMessageInitial;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class ESIAFindMessageTest extends TestCase {

    @Test
    public void testSaveESIAFindMessage() {
        String name = "Ivan";
        String surname="Ivanov";
        String middle= "Ivanovich";
        String snils = "000";

        ESIAFindMessageInitial efm = new ESIAFindMessageInitial();
        efm.MiddleName=middle;
        efm.Name=name;
        efm.Surname=surname;
        efm.OperatorSnils=snils;

        ESIAFindMessageInitial restored = (ESIAFindMessageInitial) BinaryMessage.restored(BinaryMessage.savedToBLOB(efm));
        assertEquals(name, restored.Name);
        assertEquals(surname, restored.Surname);
        assertEquals(middle, restored.MiddleName);
        assertEquals(snils, restored.OperatorSnils);
    }
}