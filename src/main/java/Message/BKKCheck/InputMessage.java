package Message.BKKCheck;

import Message.abstractions.BinaryMessage;

import java.io.*;

public class InputMessage implements BinaryMessage {
    public InputMessage(String FileName, byte[] fileContent, String Address, String ID) {
        this.Address=Address;
        this.FileName=FileName;
        this.fileContent=fileContent;
        this.ID=ID;
    }
    public String FileName;
    public byte[] fileContent;
    public String Address;
    public String ID;

}


