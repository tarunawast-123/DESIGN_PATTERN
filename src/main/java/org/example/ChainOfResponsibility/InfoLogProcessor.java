package org.example.ChainOfResponsibility;

import com.sun.tools.javac.util.Log;

public class InfoLogProcessor extends LogProcessor {

    InfoLogProcessor(LogProcessor nexLogProcessor){
        super(nexLogProcessor);
    }

    public void log(int logLevel,String message){

        if(logLevel == INFO) {
            System.out.println("INFO: " + message);
        } else{

            super.log(logLevel, message);
        }

    }

}
