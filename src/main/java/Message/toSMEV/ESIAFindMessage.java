package Message.toSMEV;

import Message.abstractions.BinaryMessage;

import java.io.*;

public class ESIAFindMessage implements BinaryMessage {
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

    //  	<tns:SnilsOperator>135-419-238 52</tns:SnilsOperator>
  //  <tns:ra>1000321282</tns:ra>
  //  <tns:lastName>Тестов</tns:lastName>
  //  <tns:firstName>Тест</tns:firstName>
  //  <tns:middleName>Тестович</tns:middleName>
  //  <tns:doc>
   //     <ns2:type>RF_PASSPORT</ns2:type>
 //       <ns2:series>1111</ns2:series>
 //       <ns2:number>111111</ns2:number>
 //   </tns:doc>
 //   <tns:mobile>+7(920)4021351</tns:mobile>
 //   <tns:snils>229-785-346 20</tns:snils>

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
