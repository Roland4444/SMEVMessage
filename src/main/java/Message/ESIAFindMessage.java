package Message;

import java.io.*;

public class ESIAFindMessage implements Serializable {
    public String Name;
    public String Surname;
    public String MiddleName;
    public String OperatorSnils;
    public String Ra;
    public String Passseria;
    public String Passnumber;

    public static byte[] saveESIAFindMessage(ESIAFindMessage event){
        byte[] Result=null ;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutput out = null;
        try {
            out = new ObjectOutputStream(bos);
            out.writeObject(event);
            out.flush();
            Result = bos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bos.close();
            } catch (IOException ex) {
                // ignore close exception
            }
        }
        return Result;
    }

    public static ESIAFindMessage restoreESIAFindMessage(byte[] input){
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
        return (ESIAFindMessage) o;
    }
}
