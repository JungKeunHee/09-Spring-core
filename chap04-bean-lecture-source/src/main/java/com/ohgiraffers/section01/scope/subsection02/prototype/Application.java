package com.ohgiraffers.section01.scope.subsection02.prototype;

import com.ohgiraffers.common.Cart;
import com.ohgiraffers.common.Drink;
import com.ohgiraffers.common.Food;
import com.ohgiraffers.common.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class);

        String[] beanName = context.getBeanDefinitionNames();
            for(String bean : beanName){
                System.out.println("bean = " + bean);
            }

        Product kimchi = context.getBean("kimchi", Food.class);
        Product coke = context.getBean("coke", Drink.class);
        Product soda = context.getBean("soda", Drink.class);

        // 첫 번째 손님을 위한 쇼핑카트 객체 생성
        Cart cart1 = context.getBean("cart", Cart.class);
        cart1.addItem(kimchi);
        cart1.addItem(soda);

        System.out.println("첫 번째 손님 카트 목록 : " + cart1.showCart());

        // 두 번째 손님을 위한 쇼핑카트 객체 생성
        Cart cart2 = context.getBean("cart", Cart.class);
        cart2.addItem(coke);

        System.out.println("두 번째 손님 카트 목록 : " + cart2.showCart());

        System.out.println(cart1.hashCode());
        System.out.println(cart2.hashCode());

        /* comment.
        *   Spring 프레임워크에서 Bean(객체) 의 기본 scope 는
        *   Singleton 이다
        *   우리가 Bean 으로 등록을 하게 되면 하나의 인스턴스만 생성을 하며
        *   공유를 해서 사용을 하게 된다
        *  */
    }

}
