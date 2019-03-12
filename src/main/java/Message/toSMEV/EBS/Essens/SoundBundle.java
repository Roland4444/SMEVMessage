package Message.toSMEV.EBS.Essens;

import Message.abstractions.BinaryMessage;
import Message.abstractions.FileInBinary;

import java.io.*;

public class SoundBundle extends FileInBinary {
    public double begin09;
    public double end09;
    public double begin90;
    public double end90;
    public double begin090;
    public double end090;

    public static byte[] saveToByte(SoundBundle input){
        byte[] Result=null ;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutput out = null;
        try {
            out = new ObjectOutputStream(bos);
            out.writeObject(input);
            out.flush();
            Result = bos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bos.close();
            } catch (IOException ex) {

            }
        }
        return Result;

    };

    public static SoundBundle restorefromBytes(byte[] input){
        Object o=null;
        ByteArrayInputStream bis = new ByteArrayInputStream(input);
        ObjectInput in = null;
        try {
            in = new ObjectInputStream(bis);
            o = in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {

            }
        }
        return (SoundBundle) o;

    };

}
