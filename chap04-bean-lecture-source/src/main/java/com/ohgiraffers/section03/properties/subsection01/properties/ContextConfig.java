package com.ohgiraffers.section03.properties.subsection01.properties;

import com.ohgiraffers.common.Cart;
import com.ohgiraffers.common.Drink;
import com.ohgiraffers.common.Food;
import com.ohgiraffers.common.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
/* 우리가 resource 폴더에 작성해둔 파일을 읽어드리는 annotation */
@PropertySource("section03/properties/product-info.properties")
public class ContextConfig {

    /* comment.
    *   @PropertySource 로 읽을 파일에 경로를 지정하면
    *   우리가 작성한 데이터를 읽어드릴 준비가 된 것이다.
    *   값을 읽어드릴 때는 key 로 value 에 접근을 하며
    *   @Value 어노테이션을 사용해 간단히 불러올 수 있다.
    *  */

    @Value("${food.kimchi.name}")
    private String foodName;

    @Value("${food.kimchi.price}")
    private int foodPrice;

    @Value("${drink.coke.name}")
    private String drinkCoke;

    @Value("${drink.coke.price}")
    private int drinkCokePrice;

    @Value("${drink.coke.capacity}")
    private int drinkCokeCapacity;

    @Value("${drink.soda.name}")
    private String drinkSoda;

    @Value("${drink.soda.price}")
    private int drinkSodaPrice;

    @Value("${drink.soda.capacity}")
    private int drinkSodaCapacity;

    @Bean
    public Product coke() {
        return new Drink(drinkCoke, drinkCokePrice, drinkCokeCapacity);
    }

    @Bean
    public Product soda(){
        return new Drink(drinkSoda, drinkSodaPrice, drinkSodaCapacity);
    }

    @Bean
    public Product kimchi() {
        return new Food(foodName, foodPrice, new Date());
    }

    @Bean
    @Scope("prototype")
    public Cart cart() {
        return new Cart();
    }
}
