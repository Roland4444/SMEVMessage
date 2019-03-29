package Message.BKKCheck;

import Message.abstractions.BinaryMessage;

import java.io.*;

public class ResponceMessage implements BinaryMessage {
    public ResponceMessage(int checkResult, String ID){
        this.checkResult=checkResult;
        this.ID=ID;
    }
    public int checkResult;
    public String ID;



}
