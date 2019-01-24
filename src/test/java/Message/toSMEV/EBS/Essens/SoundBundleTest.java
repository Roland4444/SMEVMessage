package Message.toSMEV.EBS.Essens;

import junit.framework.TestCase;

public class SoundBundleTest extends TestCase {

    public void testSaveToByte() {
        SoundBundle initial = new SoundBundle();
        initial.begin09=1;
        initial.begin90=2;
        initial.begin090=3;
        initial.end09=4;
        initial.end90=5;
        initial.end090=6;
        initial.fileContent =new byte[]{0x00, 0x01, 0x03, (byte) 0xff};
        initial.filename="photo.jpg";

        SoundBundle restored = SoundBundle.restorefromBytes(SoundBundle.saveToByte(initial));
        assertEquals(initial.begin09, restored.begin09);
        assertEquals(initial.begin90, restored.begin90);
        assertEquals(initial.begin090, restored.begin090);
        assertEquals(initial.end09, restored.end09);
        assertEquals(initial.end90, restored.end90);
        assertEquals(initial.end090, restored.end090);
        assertEquals(new String(initial.fileContent), new String(restored.fileContent));
        assertEquals(initial.begin09, restored.begin09);
        assertEquals(initial.filename, restored.filename);

    }
}