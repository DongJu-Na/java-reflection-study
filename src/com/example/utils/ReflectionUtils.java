package com.example.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 자바 리플렉션을 사용하는 유틸리티 클래스입니다.
 * 클래스 정보 조회, 메서드 호출, 필드 접근 등을 제공합니다.
 */
public class ReflectionUtils {

    /**
     * 클래스의 정보를 출력하는 메서드입니다.
     *
     * @param clazz 클래스 객체
     */
    public static void printClassInfo(Class<?> clazz) {
        System.out.println("클래스 이름: " + clazz.getName());

        System.out.println("메서드 목록:");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println("- " + method.getName());
        }

        System.out.println("필드 목록:");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println("- " + field.getName());
        }
    }

    /**
     * 인스턴스와 메서드 이름을 사용하여 메서드를 호출하는 메서드입니다.
     *
     * @param instance 호출할 메서드를 가진 인스턴스
     * @param methodName 호출할 메서드 이름
     * @param args 메서드에 전달할 인자
     */
    public static void invokeMethod(Object instance, String methodName, Object... args) {
        try {
            Method method = instance.getClass().getMethod(methodName, String.class);
            method.invoke(instance, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 인스턴스의 필드 값을 설정하는 메서드입니다.
     *
     * @param instance 필드를 가진 인스턴스
     * @param fieldName 설정할 필드 이름
     * @param value 필드에 설정할 값
     */
    public static void setFieldValue(Object instance, String fieldName, Object value) {
        try {
            Field field = instance.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(instance, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
