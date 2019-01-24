package Message.toSMEV.EBS;

import Message.abstractions.BinaryMessage;
import Message.toSMEV.EBS.Essens.OtherInfo;
import Message.toSMEV.EBS.Essens.PhotoBundle;
import Message.toSMEV.EBS.Essens.SoundBundle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EBSMessageTest {
    OtherInfo oi = new OtherInfo();
    PhotoBundle pb = new PhotoBundle();
    SoundBundle sb = new SoundBundle();

    @Test
    public void testrestore(){
        oi.Mnemonic="TESIA";
        oi.OperSNILS="5555";
        EBSMessage ebsm = new EBSMessage(oi, sb, pb);
        EBSMessage restored = (EBSMessage) BinaryMessage.restored(BinaryMessage.savedToBLOB(ebsm));
        assertEquals(restored.otherinfo.Mnemonic,          oi.Mnemonic);
        assertEquals(restored.otherinfo.OperSNILS, oi.OperSNILS);


    }

}