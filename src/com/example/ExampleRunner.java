package com.example;

import com.example.examples.ClassInfoExample;
import com.example.examples.FieldAccessExample;
import com.example.examples.MethodInvocationExample;
import com.example.interfaces.ReflectionExample;

import java.util.ArrayList;
import java.util.List;

/**
 * 다양한 리플렉션 예제를 실행하는 클래스입니다.
 */
public class ExampleRunner {

    private final List<ReflectionExample> examples = new ArrayList<>();

    public ExampleRunner() {
        // 예제를 리스트에 추가
        examples.add(new ClassInfoExample(MyClass.class));
        examples.add(new MethodInvocationExample(new MyClass(), "sayHello", "Reflection"));
        examples.add(new FieldAccessExample(new Person("Alice", 30), "name", "Bob"));
    }

    /**
     * 모든 리플렉션 예제를 실행합니다.
     */
    public void runExamples() {
        for (ReflectionExample example : examples) {
            example.runExample();
        }
    }
}
