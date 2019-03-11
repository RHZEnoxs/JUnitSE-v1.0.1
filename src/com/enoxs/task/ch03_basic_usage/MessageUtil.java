package com.enoxs.task.ch03_basic_usage;

/**
 * Task#3
 * JUnit - Basic Usage
 */

public class MessageUtil {
    private String message;

    //Constructor
    //@param message to be printed

    public MessageUtil(String message){
        this.message = message;
    }

    // prints the message
    public String printMessage(){
        System.out.println(message);
        return message;
    }
}
