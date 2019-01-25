package Message.toSMEV.EBS.Essens;

import Message.abstractions.FileInBinary;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PhotoBundle extends FileInBinary {
    public static void suspendToDisk(PhotoBundle pb) throws IOException {
        FileOutputStream fos = new FileOutputStream(pb.filename);
        fos.write(pb.fileContent);
        fos.close();
    }

    public static void clean(PhotoBundle pb) throws IOException {
       File f =  new File(pb.filename);
       if (f.exists())
            f.delete();
    }
}
