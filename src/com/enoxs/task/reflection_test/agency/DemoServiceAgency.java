package com.enoxs.task.reflection_test.agency;

import com.enoxs.task.reflection_test.example.DemoService;
import com.enoxs.task.reflection_test.example.DemoServiceImpl;
import com.enoxs.util.ReflectionUtils;
import org.junit.Test;

import java.util.List;

public class DemoServiceAgency extends Agency implements DemoService {
    DemoService demoService;

    public DemoServiceAgency() {
        this.demoService = new DemoServiceImpl();
    }

    @Override
    public Integer calSum(Integer num1, Integer num2) {
        return demoService.calSum(num1, num2);
    }

    @Override
    public Boolean isEmpty(List<Object> lstObj) {
        return demoService.isEmpty(lstObj);
    }

    @Override
    public Boolean isPublicMethodTrue() {
        return demoService.isPublicMethodTrue();
    }

    public Boolean isProtectedMethodTrue(){
        return (Boolean) ReflectionUtils.invokeMethod(demoService, "isProtectedMethodTrue", null, null);
    }

    public Boolean isPrivateMethodTrue() {
        return (Boolean) ReflectionUtils.invokeMethod(demoService, "isPrivateMethodTrue", null, null);
    }

    public Boolean isPrivateMethodWithParameter(String msg, Integer num, Boolean isStatus) throws ClassNotFoundException {
        initParameters(3);
        setParameterType(0, Class.forName("java.lang.String"));
        setParameterType(1, Class.forName("java.lang.Integer"));
        setParameterType(2, Class.forName("java.lang.Boolean"));//int.class

        setParameter(0, msg);
        setParameter(1, num);
        setParameter(2, isStatus);
        return (Boolean) ReflectionUtils.invokeMethod(demoService,
                "isPrivateMethodWithParameter", parameterTypes, parameters);
    }

}
