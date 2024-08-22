package com.example.examples;

import com.example.interfaces.ReflectionExample;
import com.example.utils.ReflectionUtils;
import com.example.Person;

/**
 * 필드 접근 예제를 담당하는 클래스입니다.
 */
public class FieldAccessExample implements ReflectionExample {

    private final Object instance;
    private final String fieldName;
    private final Object newValue;

    public FieldAccessExample(Object instance, String fieldName, Object newValue) {
        this.instance = instance;
        this.fieldName = fieldName;
        this.newValue = newValue;
    }

    @Override
    public void runExample() {
        System.out.println("=== 필드 접근 및 수정 예제 ===");
        ReflectionUtils.setFieldValue(instance, fieldName, newValue);
        if (instance instanceof Person) {
            ((Person) instance).printInfo();
        }
        System.out.println();
    }
}
