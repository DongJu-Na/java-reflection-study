package com.example;

/**
 * 리플렉션을 통해 필드에 접근하는 예제를 위한 클래스입니다.
 */
public class Person {

    private String name;
    private int age;

    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
