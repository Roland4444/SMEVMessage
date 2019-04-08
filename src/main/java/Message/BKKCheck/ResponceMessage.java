package Message.BKKCheck;

import Message.abstractions.BinaryMessage;

import java.io.*;

public class ResponceMessage implements BinaryMessage {
    public int checkResult;
    public String ID;
    public String ProblemName;
    public Double problemValue;
    public ResponceMessage(int checkResult, String ID){
        this.checkResult=checkResult;
        this.ID=ID;
    }




}
