package com.ohgiraffers.section01.common;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BookDTO {

    private int no;         // 번호
    private int isbn;       // 책 일련번호
    private String title;   // 책 제목
    private String author;  // 저자
    private String publisher;       // 출판사
    private Date createdDate;       // 출판일

}
