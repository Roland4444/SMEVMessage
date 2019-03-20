package Message.toSMEV.EBS.Essens;

import Message.abstractions.FileInBinary;

public class PhotoBundle extends FileInBinary {


    @Override
    public void printSelf() {
        System.out.println("FILENAME>>  "+filename);
        System.out.println("SIZE=  "+fileContent.length);
    }
}
