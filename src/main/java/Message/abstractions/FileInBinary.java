package Message.abstractions;

import Message.toSMEV.EBS.Essens.PhotoBundle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInBinary implements BinaryMessage {
    public String filename;
    public byte[] fileContent;
    public static void suspendToDisk(FileInBinary pb) throws IOException {
        FileOutputStream fos = new FileOutputStream(pb.filename);
        fos.write(pb.fileContent);
        fos.close();
    }

    public static void clean(FileInBinary pb) throws IOException {
        File f =  new File(pb.filename);
        if (f.exists())
            f.delete();
    }
}
