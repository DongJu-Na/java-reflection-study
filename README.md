# 자바 리플렉션 예제

이 프로젝트는 자바의 리플렉션 기능을 활용하여 클래스, 메서드, 필드에 동적으로 접근하는 다양한 방법을 소개합니다. 코드는 객체지향적으로 설계되어 있어 리플렉션의 개념을 쉽게 이해할 수 있도록 구성되어 있습니다.

## 자바 리플렉션이란?

자바 리플렉션은 프로그램이 실행 중일 때 클래스, 메서드, 필드 등을 동적으로 조회하고 조작할 수 있게 해주는 기능입니다. 이를 통해 런타임에 클래스의 구조를 알아내고, 객체의 메서드를 호출하거나 필드의 값을 수정할 수 있습니다.

## 프로젝트 구조

이 프로젝트는 다음과 같은 구조로 되어 있습니다.



```
java-reflection-study/
│
├── src/
│   ├── Main.java
│   ├── com/
│   │   └── example/
│   │       ├── examples/
│   │       │   ├── ClassInfoExample.java
│   │       │   ├── FieldAccessExample.java
│   │       │   ├── MethodInvocationExample.java
│   │       └── interfaces/
│   │       │   └── ReflectionExample.java
│   │       ├── utils/
│   │       │   └── ReflectionUtils.java
│   │       ├── MyClass.java
│   │       ├── Person.java
│   │       └── ExampleRunner.java
│
└── README.md
```



## 주요 클래스 및 인터페이스 설명

- **`interfaces/ReflectionExample.java`**: 리플렉션 예제들을 위한 공통 인터페이스입니다. 모든 리플렉션 예제 클래스는 이 인터페이스를 구현해야 합니다.

- **`examples/ClassInfoExample.java`**: 클래스의 정보를 출력하는 예제입니다. 클래스의 이름, 메서드 목록, 필드 목록 등을 출력합니다.

- **`examples/MethodInvocationExample.java`**: 객체의 메서드를 동적으로 호출하는 예제입니다. 메서드 이름과 인자를 통해 메서드를 호출합니다.

- **`examples/FieldAccessExample.java`**: 객체의 필드 값을 동적으로 접근하고 수정하는 예제입니다. 필드 이름과 값을 통해 필드를 수정합니다.

- **`utils/ReflectionUtils.java`**: 리플렉션 관련 유틸리티 메서드를 제공하는 클래스입니다. 클래스 정보 출력, 메서드 호출, 필드 접근 등의 기능을 구현하고 있습니다.

- **`ExampleRunner.java`**: 다양한 리플렉션 예제들을 실행하는 클래스입니다. 예제들을 리스트에 추가하고, 이를 순차적으로 실행합니다.

- **`Main.java`**: 프로그램의 진입점입니다. `ExampleRunner`를 사용하여 모든 리플렉션 예제를 실행합니다.

## 예제 실행 방법

1. 이 저장소를 클론합니다.
2. 선호하는 IDE(예: IntelliJ IDEA, Eclipse 등)에서 프로젝트를 엽니다.
3. `Main.java` 파일을 실행합니다. 그러면 `ExampleRunner`가 다양한 리플렉션 예제를 차례로 실행하여 결과를 콘솔에 출력합니다.

## 학습 목표

이 프로젝트를 통해 자바 리플렉션의 기본 개념을 익히고, 리플렉션을 사용하는 다양한 방법을 학습할 수 있습니다. 객체지향 설계를 통해 코드의 유지보수성과 확장성을 높이는 방법도 배울 수 있습니다.


