package Message.BKKCheck;

import Message.abstractions.BinaryMessage;

import java.io.*;

public class InputMessage implements BinaryMessage {
    public InputMessage(String FileName, byte[] fileContent, String DescriptionService, String Address, String ID) {
        this.Address=Address;
        this.FileName=FileName;
        this.fileContent=fileContent;
        this.DescriptionService=DescriptionService;
        this.ID=ID;
    }
    public String FileName;
    public byte[] fileContent;
    public String DescriptionService;
    public String Address;
    public String ID;

}


