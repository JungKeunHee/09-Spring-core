package com.ohgiraffers.common;

import lombok.*;
import lombok.experimental.Tolerate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
// @Data -> 위에 5가지 수행할 수 있지만
// Lombok 자체의 버그가 많아 권장하지 않음
public class MemberDTO {

    private int no;
    private String id;
    private String pwd;
    private String name;

}
