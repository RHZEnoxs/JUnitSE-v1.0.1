package com.enoxs.task.reflection_test.example;

public class DemoServiceImpl {

    public Boolean isPublicMethodTrue(){
        return true;
    }

    private Boolean isPrivateMethodTrue(){
        return true;
    }

    private Boolean isPrivateMethodWithParameter(String msg , Integer num , Boolean isStatus){
        System.out.println("MSG : " + msg);
        System.out.println("NUM : " + num);
        System.out.println("IS_ : " + isStatus);
        return true;
    }
}
