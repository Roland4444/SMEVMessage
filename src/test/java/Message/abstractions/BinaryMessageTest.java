package Message.abstractions;

import Message.toSMEV.EBS.EBSMessage;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class BinaryMessageTest {

    @Test
    void readBytes() throws IOException {
        assertNotEquals(null, BinaryMessage.readBytes("dump__.bin"));
    }
}