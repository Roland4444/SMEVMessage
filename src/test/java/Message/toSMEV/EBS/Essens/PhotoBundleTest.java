package Message.toSMEV.EBS.Essens;

import Message.abstractions.BinaryMessage;
import Message.abstractions.FileInBinary;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.*;

class PhotoBundleTest {

    @Test
    void suspendToDisk() throws IOException, InterruptedException {
        PhotoBundle pb = new PhotoBundle();
        pb.filename = "fxx.jpg";
        pb.fileContent = BinaryMessage.readBytes("res/fxx.jpg");
        BinaryMessage.write(BinaryMessage.savedToBLOB(pb), "photoblob.bin");
        assertNotEquals(null, pb);
        FileInBinary.clean(pb);
        FileInBinary.suspendToDisk(pb);
        Thread.sleep(500);
        assertEquals(true, new File(pb.filename).exists());

        Thread.sleep(1500);
        PhotoBundle.clean(pb);
    }
}