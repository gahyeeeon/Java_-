# 1. 스프링부트란?

## 1.1 스프링 프레임워크

- 자바에서 가장 많이 사용하는 프레임워크
- 우리나라 ‘전자정부 표준 프레임워크’의 기반 기술로 채택되어 공공기관 웹 서비스 개발시에 사용
- 자바로 앱 개발하는 데 필요한 기능을 제공하고 쉽게 사용하도록 돕는 도구
- 핵심 가치

  “애플리케이션 개발에 필요한 기반을 제공해서 개발자가 비즈니스 로직 구현에만 집중할 수 있게끔 하는것”


### 1.1.1 제어 역전(IoC : Inversion of Control)

- 일반적인 자바 개발의 경우 객체를 생성하고 사용하는 일련의 작업을 개발자가 직접 제어하는 구조
- 하지만 제어 역전을 특징으로 하는 스프링은 사용할 객체를 직접 생성하지 않고 객체의 생명주기 관리를 외부에 위임한다
- 여기서 ‘외부’는 스프링 컨테이너(Spring Container) 또는 IoC컨테이너를 의미한다
- 객체의 관리를 컨테이너에 맡겨 제어권이 넘어간 것을 제어 역전이라고 부르며, 제어 역전을 통해 의존성 주입, 관점 지향 프로그래밍 등이 가능해 진다

### 1.1.2 의존성 주입 (DI : Dependency Injection)

- 의존성 주입이란 제어 역전의 방법 중 하나로, 사용할 객체를 직접 생성하지 않고 외부 컨테이너가 생성한 객체를 주입받아 사용하는 방식
- 스프링에서 의존성을 주입받는 세 가지 방법
    - **생성자**를 통한 의존성 주입
    - **필드 객체 선언**을 통한 의존성 주입
    - **`setter` 메서드**를 통한 의존성 주입
- 스프링에서는 `@Autowired`라는 이노테이션을 통해 의존성 주입을 할 수 있다
- 스프링에서 의존성을 주입 받는 각 방법들
    1. 생성자를 통한 의존성 주입

    ```java
    @RestController
    public class DIController {
    
        **MyService myService;**
    
        **@Autowired
        public DIController(MyService myService) {
            this.myService = myService;
        }**
    
        @GetMapping("/di/hello")
        public String getHello() {
            return myService.getHello();
        }
    
    }
    
    ```

    1. 필드 객체 선언을 통한 의존성 주입

    ```java
    @RestController
    public class FieldInjectionController {
    
        **@Autowired
        private MyService myService;**
    
    }
    ```

    1. `setter` 메서드를 통한 의존성 주입

    ```java
    @RestController
        public class SetterInjectionController {
    
            **MyService myService;
    
            @Autowired
            public void setMyService(MyService myService) {
                this.myService = myService;
            }
    
        }**
    
    ```

- 스프링 공식 문서에서 권장하는 의존성 주입 방법은 생성자를 통해 의존성을 주입받는 방식이다
- 다른 방식과는 다르게 생성자를 통해 의존성을 주입하는 방식은 레퍼런스 객체 없이는 객체를 초기화 할 수 없게 설계할 수 있기 때문

### 1.1.3 관점 지향 프로그래밍 (AOP)

- 관점 지향 프로그래밍 (AOP : Aspect-Orented Programming)은 스프링의 아주 중요한 특징이다
- AOP는 관점을 기준으로 묶어 개발하는 방식을 의미한다
- 여기서 관점이란 어떤 기능을 구현할 때 그 기능을 ‘핵심 기능’과 ‘부가 기능’으로 구분해 각각을 하나의 관점으로 보는 것을 의미한다
- AOP를 구현하는 세 가지 방법
    1. 컴파일 과정에 삽입하는 방식
    2. 바이트코드를 메모리에 로드하는 과정에서 삽입하는 방식
    3. 프락시 패턴을 이용한 방식
- 이중에 스프링은 디자인 패턴 중 하나인 프락시 패턴을 통해 AOP 기능을 제공하고 있다
- AOP의 목적은 OOP와 마찬가지로 모듈화해서 재사용 가능한 구성을 만드는 것이고, 모듈화된 객체를 편하게 적용할 수 있게 함으로써 개발자가 비즈니스 로직을 구현하는 데만 집중할 수 있게 도와 주는 것이다

### 1.1.4 스프링 프레임워크의 다양한 모듈

![스크린샷 2024-05-10 오후 3.31.25.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/f4b917bb-af79-49e7-a149-2d362964fbfb/e4ce4ce3-10c4-4ff7-ae37-8c7a9ede55b2/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2024-05-10_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_3.31.25.png)

## 1.2 스프링 프레임워크 vs 스프링 부트

- 스프링 프레임워크는 기존 개발 방식의 문제와 한계를 극복하기 위해 다양한 기능을 제공한다
- 하지만 기능이 많은 만큼 설정이 복잡한 편이다
- 필요한 모듈들을 추가하다 보면 복잡해지는 설정 문제를 해결하기 위해 등장한 것이 스프링 부트

### 1.2.1 의존성 관리

- 스프링에서는 개발에 필요한 각 모듈의 의존성을 직접 설정해야 하고 호환되는 버전을 명시해야 정상 동작한다
- 하지만 스프링 부트에서는 이같은 불편함을 해소하기 위해 ‘spring-boor-starter’라는 의존성을 제공한다
- spring-boor-starter의 의존성은 여러 종류가 있고, 각 라이브러리의 기능과 관련해서 자주 사용되고 서로 호환되는 버전의 모듈 조합을 제공한다.
- 자주 사용되는 spring-boor-starter 라이브러리
    - spring-boor-starter-web :
        - 스프링 MVC를 사용하는 RESTful 애플리케이션을 만들기 위한 의존성. 기본적으로 내방 톰캣(Tomcat)이 포함돼 있어 jar 형식으로 실행 가능
    - spring-boor-starter-test :
        - JUint Jupiter, Mockito 등의 테스트용 라이브러리를 포함한다
    - spring-boor-starter-jdbc :
        - HikariCP 커넥션 풀을 활용한 JDBC 기능을 제공한다
    - spring-boor-starter-security :
        - 스프링 시큐리티(인증, 권한, 인가 등) 기능을 제공한다
    - spring-boor-starter-jpa :
        - 하이버네이트를 활용한 JPA 기능을 제공한다
    - spring-boor-starter-cache :
        - 스프링 프레임워크의 캐시 기능을 지원한다

### 1.2.2 자동 설정

- 스프링 부트는 스프링 프레임워크의 기능을 사용하기 위한 자동 설정(Auto Configuration)을 지원한다
- 애플리케이션에  추가된 라이브러리를 실행하는데 필요한 환경 설정을 알아서 찾아준다
- 즉, 애플리케이션을 개발하는 데 필요한 의존성을 추가하면 프레임워크가 이를 자동으로 관리해준다
- 예를 들어 스프링 부트 프로젝트를 생성하면 다음과 같은 메인 애플리케이션 코드를 볼 수 있다

    ```java
    @SpringBootApplication
    public class SpringBootApplication {
    	public static void main(String[] args) {
    		SpringApplication.run(SpringBootApplication.class, args);
    	}
    }
    ```

- `@SpringBootApplication`
    - 여러 어노테이션을 합쳐 놓은 인터페이스지만 기능 위주로 보면 크게 다음 세 개의 어노테이션을 합쳐놓은 구성이다
        - `@SpringBootConfiguration`
        - `@EnableAutoConfiguration`
        - `@ComponentScan`

<aside>
💡 TIp
@Component 시리스 어노테이션에서 ‘시리즈’는 @Component 어노테이션이 포괄하는 어노테이션들을 통칭하기 위해 사용한 표현입니다. 이러한 @Component 시리즈 어노테이션의 대표적인 예는 다음과 같습니다.
- `@Controller`
- `@RestController`
- `@Service`
- `@Repository`
- `@Configuration`

</aside>

### 1.2.3 내장 WAS

- 스프링 부트의 각 웹 애플리케이션에는 내장 WAS(Web Application Server)가 존재한다

### 1.2.4 모니터링

- 개발이 끝나고 서비스를 운영하는 시기에는 해당 시스템이 사용하는 스레드, 메모리, 세션 등의 주요 요소들을 모니터링 해야한다
- 스프링 부트에는 스프링 부트 액추에이터라는 자체 모니터링 도구가 있다