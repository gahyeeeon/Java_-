package com.springboot.api.controller;

import com.springboot.api.dto.MemberDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1/put-api")
public class PutController {

    // @RequestBody를 활용한 PUT 메서드 구현
    // 서버에 어떤 값이 들어올지 모르는 경우 Map 객체를 활용
    // http://localhost:8080/api/v1/put-api/member
    @PutMapping(value = "/member")
    public String putMember(@RequestBody Map<String, Object> putData) {
        StringBuilder sb = new StringBuilder();

        putData.entrySet().forEach(entry -> {
            sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
        });

        return sb.toString();
    }

    // 서버에 어떤 값이 들어올지 정해져 있는 경우 DTO를 활용 가능
    // 메서드의 반환값에 따라 데이터헤더의 Content-type이 결정된다.
    @PutMapping(value = "/member1")
    public String putMemberDto1(@RequestBody MemberDto memberDto) {
        return memberDto.toString();
    }
    @PutMapping(value = "/member2")
    public MemberDto putMemberDto2(@RequestBody MemberDto memberDto) {
        return memberDto;
    }

    // ResponseEntity를 활용한 PUT 메서드 구현
    // 메서드의 리턴 타입을 ResponseEntity로 설정
    // 이 메서드를 대상으로 요청을 수행하면 응답 코드가 202로 변경됨
    // body의 내용은 memberDto가 들어감
    @PutMapping(value = "/member3")
    public ResponseEntity<MemberDto> putMemberDto3(@RequestBody MemberDto memberDto) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(memberDto);
    }
}
