package com.springboot.api.controller;

import com.springboot.api.dto.MemberDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GetController.class);

    // @RequestMapping 으로 구현하기
    // http://localhost:8080/api/v1/get-api/hello
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        LOGGER.info("call getHello");
        return "Hello World";
    }

    // 매개변수가 없는 GET 메서드 구현
    // http://localhost:8080/api/v1/get-api/name
    @GetMapping(value = "/name")
    public String getName() {
        LOGGER.info("call getName");
        return "lhdmir";
    }

    // @PathVariable을 활용한 GET 메서드 구현
    // http://localhost:8080/api/v1/get-api/variable1/{String 값}
    @GetMapping(value = "/variable1/{variable}")
    public String getVariable1(@PathVariable String variable) {
        LOGGER.info("call getVariable1 with variable {}", variable);
        return variable;
    }

    // @PathVariable에 변수명을 매핑하는 방법
    // http://localhost:8080/api/v1/get-api/variable2/{String 값}
    @GetMapping(value = "/variable2/{variable}")
    public String getVariable2(@PathVariable(value = "variable") String var) {
        return var;
    }

    // @RequestParam 을 활용한 GET 메서드 구현
    // http://localhost:8080/api/v1/get-api/reques1t?name=value1&email=value2&organization=value3
    @Operation(summary = "GET 메서드 예제", description = "@RequestParam을 활용한 GET Method")
    @GetMapping(value = "/request1")
    public String getRequestParam1(
          @Parameter(description = "이름", required = true, example = "홍길동") @RequestParam(value = "name") String n,
          @Parameter(description = "이메일", required = true)  @RequestParam String email,
          @Parameter(description = "회사", required = true)  @RequestParam String organization) {
        return n + ", " + email + ", " + organization;
    }

    // @RequestParam과 Map을 조합한 GET 메서드 구현
    // 쿼리스트링에 어떤 값이 들어올지 모른다면 아래와 같이 적용가능
    //http://localhost:8080/api/v1/get-api/request2?key1=value1&key2=value2
    @GetMapping(value = "/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param){
        StringBuilder sb = new StringBuilder();
        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }

    // DTO(Data Transfer Object) 객체를 활용한 GET 메서드 구현
    //http://localhost:8080/api/v1/get-api/request3?name=value1&email=value2&organization=value3
    @GetMapping(value = "/request3")
    public String getRequestParam3(MemberDto memberDto){
//        return  memberDto.getName() + " " + memberDto.getEmail() + " " + memberDto.getOrganization();
        return memberDto.toString();
    }
}
