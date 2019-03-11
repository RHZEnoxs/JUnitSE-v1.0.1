package com.enoxs.task.ch08_executing_tests;


/**
 * Task#8
 * JUnit - Executing Tests
 * Test Utils
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
