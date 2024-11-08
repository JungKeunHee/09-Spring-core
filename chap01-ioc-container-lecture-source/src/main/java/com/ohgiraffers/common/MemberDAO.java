package com.ohgiraffers.common;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
/* comment.
*   @Component 어노테이션은 IOC 컨테이너에게 Bean 으로
*   등록할 클래스임을 명시하는 어노테이션이다.
*   클래스 레벨에 빈을 등록할 때 이름을 지정하지 않으면
*   앞글자가 소문자로 바뀐 것이 이름으로 지정 된다.
*  */
@Component
public class MemberDAO {

    private final Map<Integer, MemberDTO> memberMap;

    public MemberDAO() {
        memberMap = new HashMap<>();

        memberMap.put(1, new MemberDTO(1, "user01", "pass01", "조평훈"));
        memberMap.put(2, new MemberDTO(2, "user02", "pass02", "조평순"));
    }

    public MemberDTO selectMember(int no) {
        return memberMap.get(no);
    }

    public boolean insertMember(MemberDTO newMember) {
        // 멤버 insert 에 성공하면 true, 반대면 false
        int before = memberMap.size();

        memberMap.put(newMember.getNo(), newMember);

        int after = memberMap.size();

        return after > before ? true : false;
    }

}
