package com.enoxs.task.reflection_test.example;

import java.util.List;

public class DemoServiceImpl implements DemoService {

    public Boolean isPublicMethodTrue(){
        return true;
    }

    @Override
    public Integer calSum(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Boolean isEmpty(List<Object> lstObj) {
        return lstObj.size() == 0 ? true : false;
    }

    protected Boolean isProtectedMethodTrue(){
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
