package com.enoxs.task.reflection_test.agency;

import com.enoxs.task.reflection_test.example.DemoServiceImpl;
import com.enoxs.util.ReflectionUtils;

public class DemoServiceAgency extends Agency{
    private static DemoServiceImpl demoServiceImpl;

    public DemoServiceAgency() {
        demoServiceImpl = new DemoServiceImpl();
    }

    public static DemoServiceImpl getDemoServiceImpl() {
        return demoServiceImpl;
    }

    public Boolean isPrivateMethodTrue(){
        return (Boolean) ReflectionUtils.invokeMethod(demoServiceImpl, "isPrivateMethodTrue", null, null);
    }

    public Boolean isPrivateMethodWithParameter(String msg , Integer num , Boolean isStatus) throws ClassNotFoundException {
        initParameters(3);
        setParameterType(0, Class.forName("java.lang.String"));
        setParameterType(1, Class.forName("java.lang.Integer"));
        setParameterType(2, Class.forName("java.lang.Boolean"));//int.class

        setParameter(0, msg);
        setParameter(1, num);
        setParameter(2, isStatus);
        return (Boolean) ReflectionUtils.invokeMethod(demoServiceImpl,
                "isPrivateMethodWithParameter", parameterTypes, parameters);

    }

}
