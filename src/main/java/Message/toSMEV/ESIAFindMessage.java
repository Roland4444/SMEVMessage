package Message.toSMEV;

import Message.abstractions.BinaryMessage;

import java.io.*;

public class ESIAFindMessage implements BinaryMessage {

    public ESIAFindMessage(String ID, String RA, String SNILSOper, String Surname, String FirstName, String MiddleName,
                           String PassSeria, String PassNumber,  String Mobile, String SNiLS){
        this.ID=ID;
        this.Ra=RA;
        this.OperatorSnils=ESIAFindMessage.getSNILSfromplain(SNILSOper);
        this.Surname=Surname;
        this.Name=FirstName;
        this.MiddleName=MiddleName;
        this.Passnumber=PassNumber;
        this.Passseria=PassSeria;
        this.MobileNumber=ESIAFindMessage.getMobilefromplain(Mobile);
        this.SNILS=SNiLS;

    }
    public String Name;
    public String Surname;
    public String MiddleName;
    public String OperatorSnils;
    public String Ra;
    public String Passseria;
    public String Passnumber;
    public String ID;
    public String MobileNumber;
    public String SNILS;

    public static boolean checkSNILS(String input){
        return false;
    };

    public static boolean checkmobile(String input){
        return false;
    }

    public static String getMobilefromplain(String input){
        if (input.length()!=10)
            return null;
        String oper=input.substring(0,3);
        String number = input.substring(3, 10);
        String prefix="+7";
        return prefix+"("+oper+")"+number;
    };

    public static String getSNILSfromplain(String input){
        if (input.length()!=11)
            return null;
        String[] arr = new String[3];
        arr[0]=input.substring(0,3)+"-";
        arr[1]=input.substring(3,6)+"-";
        arr[2]=input.substring(6,9)+" ";
        String appendix = input.substring(9,11);
        return arr[0]+arr[1]+arr[2]+appendix;
    }
}
