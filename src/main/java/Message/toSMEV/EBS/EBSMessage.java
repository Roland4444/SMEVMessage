package Message.toSMEV.EBS;

import Message.abstractions.BinaryMessage;
import Message.toSMEV.EBS.Essens.OtherInfo;
import Message.toSMEV.EBS.Essens.PhotoBundle;
import Message.toSMEV.EBS.Essens.SoundBundle;

import java.util.ArrayList;

public class EBSMessage implements BinaryMessage {
    OtherInfo otherinfo;
    PhotoBundle PhotoBLOB;
    SoundBundle SoundBLOB;
    public EBSMessage(){

    };

    public EBSMessage(OtherInfo oi, SoundBundle sb, PhotoBundle pb){
        this.otherinfo=oi;
        this.PhotoBLOB=pb;
        this.SoundBLOB=sb;
    }
}
