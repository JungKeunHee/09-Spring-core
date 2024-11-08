package com.ohgiraffers.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drink extends Product{

    private int capacity;   // 음료수 용량(ml)

    public Drink() {
        super(); // 부모의 기본생성자 호출
    }

    public Drink (String name, int price, int capacity){
        super (name, price);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        // 부모의 toString 메소드 가져오면서 내 필드를 출력 할 수 있는 구문 추가
        return super.toString() + "" + this.capacity;
    }
}
