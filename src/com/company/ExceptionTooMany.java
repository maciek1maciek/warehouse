package com.company;

import java.io.IOException;

public class ExceptionTooMany extends Exception {

    public ExceptionTooMany(){
        System.err.println("TooManyThingsException!!! ");
    }

}
