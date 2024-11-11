package com.ohgiraffers.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        // IOC 컨테이너 생성
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class);

        // MemberService Bean 가져오기
        MemberService memberService = context.getBean("memberService", MemberService.class);

        System.out.println("=========selectMembers=========");
        System.out.println(memberService.selectAllMembers());
        System.out.println("=========selectedByNo===========");
        System.out.println(memberService.selectedByNo(1L));

    }
}
