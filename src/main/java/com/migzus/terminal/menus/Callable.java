package com.migzus.terminal.menus;

import java.lang.reflect.Method;

public class Callable {
    private Method method;
    private final Object obj;

    public Callable(Object obj, String methodName) {
        try {
            method = obj.getClass().getMethod(methodName);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("There are no methods with the name " + methodName + " in the " + obj.getClass().getName() + " class!");
        }

        this.obj = obj;
    }

    public Object call(Object...args) {
        if (method == null) {
            System.out.println("Invalid call. Method was not found therefore you cannot invoke the method.");
            return null;
        }

        try {
            return method.invoke(obj, args);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Cannot invoke call on callback! method variable is: " + method);
        }

        return null;
    }

    public Object getTargetReference() { return obj; }
}
