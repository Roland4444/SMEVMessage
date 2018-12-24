package Message.abstractions;

import java.io.Serializable;

public enum Gender implements Serializable {
    M, F;

    public static String ToString(Gender input){
        if (input.equals(Gender.F))
                return "F";
        return "M";

    }
}
