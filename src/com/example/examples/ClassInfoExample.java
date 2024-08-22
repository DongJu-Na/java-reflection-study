package com.example.examples;

import com.example.interfaces.ReflectionExample;
import com.example.utils.ReflectionUtils;

/**
 * 클래스 정보 출력 예제를 담당하는 클래스입니다.
 */
public class ClassInfoExample implements ReflectionExample {

    private final Class<?> clazz;

    public ClassInfoExample(Class<?> clazz) {
        this.clazz = clazz;
    }

    @Override
    public void runExample() {
        System.out.println("=== 클래스 정보 출력 예제 ===");
        ReflectionUtils.printClassInfo(clazz);
        System.out.println();
    }
}
