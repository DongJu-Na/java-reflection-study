package com.example.examples;

import com.example.interfaces.ReflectionExample;
import com.example.utils.ReflectionUtils;

/**
 * 메서드 호출 예제를 담당하는 클래스입니다.
 */
public class MethodInvocationExample implements ReflectionExample {

    private final Object instance;
    private final String methodName;
    private final Object[] args;

    public MethodInvocationExample(Object instance, String methodName, Object... args) {
        this.instance = instance;
        this.methodName = methodName;
        this.args = args;
    }

    @Override
    public void runExample() {
        System.out.println("=== 메서드 호출 예제 ===");
        ReflectionUtils.invokeMethod(instance, methodName, args);
        System.out.println();
    }
}
