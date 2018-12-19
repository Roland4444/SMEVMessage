package Message.toSMEV;

import Message.abstractions.BinaryMessage;

import java.io.*;

public class MessageSMEV implements BinaryMessage {
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


}
