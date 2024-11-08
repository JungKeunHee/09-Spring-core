package com.ohgiraffers.section02.initdestroy.subsection02.annotation;

import com.ohgiraffers.common.Cart;
import com.ohgiraffers.common.Drink;
import com.ohgiraffers.common.Food;
import com.ohgiraffers.common.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
@ComponentScan("com.ohgiraffers.section02.initdestroy.subsection02.annotation")
public class ContextConfig {

    @Bean
    public Product kimchi() {
        return new Food("겉절이", 2000, new Date());
    }

    @Bean
    public Product coke() {
        return new Drink("콜라", 1500, 500);
    }

    @Bean
    public Product soda() {
        return new Drink("밀키스", 1000, 250);
    }

    @Bean
    @Scope("prototype")
    // 상품을 담기 위한 카트 객체 생성
    public Cart cart() {
        return new Cart();
    }
}
