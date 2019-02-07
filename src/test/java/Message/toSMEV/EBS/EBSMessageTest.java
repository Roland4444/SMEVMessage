package Message.toSMEV.EBS;

import Message.abstractions.BinaryMessage;
import Message.toSMEV.EBS.Essens.OtherInfo;
import Message.toSMEV.EBS.Essens.PhotoBundle;
import Message.toSMEV.EBS.Essens.SoundBundle;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.*;

class EBSMessageTest {
    OtherInfo oi = new OtherInfo();
    PhotoBundle pb = new PhotoBundle();
    SoundBundle sb = new SoundBundle();
    String filename = "EBSMessageFUll.bin";

    @Test
    public void testrestore(){
        oi.Mnemonic="TESIA";
        oi.OperSNILS="5555";
        EBSMessage ebsm = new EBSMessage(oi, sb, pb);
        EBSMessage restored = (EBSMessage) BinaryMessage.restored(BinaryMessage.savedToBLOB(ebsm));
        assertEquals(restored.otherinfo.Mnemonic,          oi.Mnemonic);
        assertEquals(restored.otherinfo.OperSNILS, oi.OperSNILS);
    }

    @Test
    public void restoredEBS() throws IOException {
        EBSMessage msg = (EBSMessage) BinaryMessage.restored(Files.readAllBytes(new File(filename).toPath()));
        assertNotEquals(null, msg);
        OtherInfo of = msg.otherinfo;
        PhotoBundle pb = msg.PhotoBLOB;
        SoundBundle sb = msg.SoundBLOB;
        assertNotEquals(null, of);
        assertNotEquals(null, pb);
        assertNotEquals(null, sb);

    }

}