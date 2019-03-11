package com.enoxs.task.ch02_test_framework;

public class MessageUtil {
    private String message;

    public MessageUtil(String message){
        this.message = message;
    }

    public String salutationMessage(){
        return "Hi!" + message;
    }

    public String printMessage(){
        System.out.println(message);
        return message;
    }
}
