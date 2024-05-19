package com.springboot.api.controller;

import com.springboot.api.dto.MemberDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

     // @RequestMapping으로 구현하기
     // http://localhost:8080/api/v1/get-api/hello
//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    public String getHello(){
//        return "Hello World";


    // 매개변수가 없는 GET메서드 구현
    // http://localhost:8080/api/v1/get-api/name
//    @GetMapping(value = "/name")
//    public String getName(){
//        return "Flature";
//    }


    // @PathVariable을 활요한 GET메서드 구현
    // http://localhost:8080/api/v1/get-api/variable1/{String 값}
//    @GetMapping(value = "variable1/{variable}")
//    public String getVariable1(@PathVariable String variable){
//        return  variable;
//    }

    // http://localhost:8080/api/v1/get-api/variable2/{String 값}
//    @GetMapping(value = "variable2/{variable}")
//    public String getVariable2(@PathVariable("variable") String var){
//        return var;
//    }


    //@RequestParm을 활용한 GET 메서드 구현
    // http://localhost:8080/api/v1/get-api/variable2/request1?name=value1&email=value2&organization=value3
//    @GetMapping(value = "variable2/request1")
//    public String getRequestParam1(
//        @RequestParam String name,
//        @RequestParam String email,
//        @RequestParam String organization) {
//        return name + " " + email + " " + organization;
//    }

    // Map 객체 활용
    // http://localhost:8080/api/v1/get-api/request2?ket1=value1&key2=value2
//    @GetMapping(value = "/request2")
//    public String getRequestParam2(@RequestParam Map<String, String> param) {
//        StringBuilder sb = new StringBuilder();
//
//        param.entrySet().forEach(map -> {
//            sb.append(map.getKey() + " : " + map.getValue() + "\n");
//        });
//        return sb.toString();
//    }

    // DTO
//    // http://localhost:8080/api/v1/get-api/request3?name=value1&email=value2&organization=value3
//    @GetMapping(value = "/request3")
//    public String getRequestParam3(MemberDto memberDto){
//        //return memberDto.getName() + " " + memberDto.getEmail() + " " + memberDto.getOrganization();
//        return memberDto.toString();
//    }

    // Logger 활용
    private final Logger LOGGER = LoggerFactory.getLogger(GetController.class);

//    //http://localhost:8080/api/v1/get-api/hello
//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    public String getHello(){
//        LOGGER.info("getHello 메서드가 호출되었습니다.");
//        return "Hello World";
//    }
//    //http://localhost:8080/api/v1/get-api/name
//    @GetMapping(value = "/name")
//    public String getName(){
//        LOGGER.info("getName 메서드가 호출되었습니다.");
//        return "Flature";
//    }

    //http://localhost:8080/api/v1/get-api/variable1/{String 값}
    @GetMapping(value = "variable1/{variable}")
    public String getVariable1(@PathVariable String variable){
        LOGGER.info("@PathVariable을 통해 들어온 값 : {}", variable);
        return variable;
    }
}