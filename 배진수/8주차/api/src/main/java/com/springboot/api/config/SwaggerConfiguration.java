//package com.springboot.api.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//@EnableWebMvc
//@Configuration
//public class SwaggerConfiguration extends WebMvcConfigurationSupport {
//
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.OAS_30) // 3.0 문서버전으로 세팅
//                .useDefaultResponseMessages(true)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.springboot.api"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("Spring Boot Open API Test with Swagger")
//                .description("설명 부분")
//                .version("1.0.0")
//                .build();
//    }
//}