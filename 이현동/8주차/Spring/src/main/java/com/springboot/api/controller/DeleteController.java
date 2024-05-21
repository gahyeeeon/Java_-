package com.springboot.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/delete-api")
public class DeleteController {
    // http://localhost:8080/api/v1/delete-api/{String 값}
    // @PathVariable을 활용한 DELETE 메서드 구현
    // @DeleteMapping 어노테이션에 정의한 value의 이름과 메서드의 매개변수 이름을
    // 동일하게 설정해야 삭제할 값이 주입된다.
    @DeleteMapping(value = "/{variable}")
    public String DeleteVariable(@PathVariable String variable) {
        return variable;
    }

    // http://localhost:8080/api/v1/delete-api/request1?email=value
    // @RequestParam을 활용한 DELETE 메서드 구현
    // 쿼리스트링 값도 받을 수 있다.
    @DeleteMapping("/request1")
    public String getRequestParam1(@RequestParam String variable) {
        return "e-mail: " + variable;
    }
}