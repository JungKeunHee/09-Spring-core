package com.ohgiraffers.section02.initdestroy.subsection02.annotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Owner {

    @PostConstruct// init-method 빈 생성 전 동작하는 메소드
    public  void openShop() {
        System.out.println("사장님이 가게 문 열었습니다. 쇼핑이 가능합니다");
    }

    @PreDestroy // destroy-meethod 빈 생성 후 동작하는 메소드
    public  void closeShop() {
        System.out.println("사장님이 가게 문을 닫았습니다. 빠윙~");
    }
}
