package Message.toSMEV;

import java.io.*;

public class MessageSMEV implements Serializable {
    public MessageSMEV(){

    }

    public MessageSMEV(String ID, String operator, byte[] DataToWork, String addressToReply){
        this.ID=ID;
        this.pseudo=operator;
        this.DataToWork=DataToWork;
        this.addressToReply=addressToReply;

    };


    public MessageSMEV(String Id, String operator, byte[] DataToWork){
        this.ID=Id;
        this.DataToWork=DataToWork;
        this.pseudo=operator;
    }

    public String pseudo;
    public byte[] DataToWork;
    public String addressToReply;
    public String ID;

    public static byte[] saveMessageSMEV(MessageSMEV event){
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

    public static MessageSMEV restoreMessageSMEV(byte[] input){
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
        return (MessageSMEV) o;
    }
}
