package Message.BKKCheck;

import Message.abstractions.BinaryMessage;

import java.io.*;

public class ResponceMessage implements BinaryMessage {
    public ResponceMessage(int checkResult, int lastErrorInSession, int ResultLoadingSoSymbols, String ID){
        this.checkResult=checkResult;
        this.ID=ID;
    }
    public int checkResult;
    public String ID;



}
