package com.example.demo.temp;

import org.springframework.stereotype.Component;

// 가장 기본적인 Bean 객체로 만들어 2ㅜ는
// 어노태이션
@Component
public class TempComponent {
    public TempComponent() {
        System.out.println("TempComponent Created");
    }

    public void sayHello(){
        System.out.println("Hello Spring Boot!");
    }
}
