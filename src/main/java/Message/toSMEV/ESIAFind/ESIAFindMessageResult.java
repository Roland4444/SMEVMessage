package Message.toSMEV.ESIAFind;

import Message.abstractions.BinaryMessage;

public class ESIAFindMessageResult implements BinaryMessage {
    public String ID;
    public String oid;
    public String trusted;
    public String BioStu;
}
