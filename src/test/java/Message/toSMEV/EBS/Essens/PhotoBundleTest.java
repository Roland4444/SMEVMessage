package Message.toSMEV.EBS.Essens;

import Message.abstractions.BinaryMessage;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.*;

class PhotoBundleTest {

    @Test
    void suspendToDisk() throws IOException, InterruptedException {
        PhotoBundle pb = (PhotoBundle) BinaryMessage.restored(Files.readAllBytes(new File("photoblob.bin").toPath()));
        assertNotEquals(null, pb);
        PhotoBundle.clean(pb);
        PhotoBundle.suspendToDisk(pb);
        Thread.sleep(500);
        assertEquals(true, new File(pb.filename).exists());

        Thread.sleep(1500);
        PhotoBundle.clean(pb);
    }
}