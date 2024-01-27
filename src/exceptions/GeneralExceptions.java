package exceptions;

import enums.Exceptions;

public class GeneralExceptions extends RuntimeException{

    public GeneralExceptions(Exceptions exceptions){
        super(exceptions.toString());
    }

}