package com.enoxs.task.time_test;

/**
 * Task#11
 * JUnit - Time Test
 */

public class MessageUtil  {

    private String message;

    //Constructor
    //@param message to be printed
    public MessageUtil(String message){
        this.message = message;
    }

    // prints the message
    public void printMessage(){
        System.out.println(message);
        int count = 0;
        while(count < 15){ // 20 -> false
            count++;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // add "Hi!" to the message
    public String salutationMessage(){
        message = "Hi!" + message;
        System.out.println(message);
        return message;
    }
}
