package com.enoxs.task.reflection_test.agency;

public class Agency {
    protected static Class<?>[] parameterTypes;
    protected static Object[] parameters;

    protected void initParameters(int size) {
        parameterTypes = new Class<?>[size];
        parameters = new Object[size];
    }

    protected void setParameterType(Class<?> parameterType) {
        parameterTypes[0] = parameterType;
    }

    protected void setParameter(Object parameter) {
        parameters[0] = parameter;
    }

    protected void setParameterType(int position, Class<?> parameterType) {
        parameterTypes[position] = parameterType;
    }

    protected void setParameter(int position, Object parameter) {
        parameters[position] = parameter;
    }
}
