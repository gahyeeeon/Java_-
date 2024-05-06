# 함수 디스크립터

- 람다 표현식의 사용 용도는 두가지로 정의한다
  1. 람다 함수로서의 용어
  2. 함수형 인터페이스의 추상 메서드의 역할을 설명해놓은 시그니처
- 함수 디스크립터는 단어 그대로 함수가 어떤 입력값을 받고 어떤 반환값을 주는지에 대한 설명을 람다 표현식 문법으로 표현한 것을 의미한다고 보면 된다
<table>
    <tr>
        <td>
            함수형 인터페이스
        </td>
        <td>
            함수형 디스크립터 (추상 메서드가 어떤 역할을 하는지 간략하게 설명)
        </td>
    </tr>
    <tr>
        <td>
            Predicate
        </td>
        <td>
            T -> boolean
        </td>
    </tr>
    <tr>
        <td>Consumer</td>
        <td>
            T -> void
        </td>
    </tr>
   <tr>
        <td>
            Funtion<'T','R'>
        </td>
        <td>
            T -> void
        </td>
    </tr>
    <tr>
        <td>
            Supplier
        </td>
        <td>
            () -> T
        </td>
    </tr>
    <tr>
        <td>
            BiPredicate<'L','R'>
        </td>
        <td>
            (L, R) -> boolean
        </td>
    </tr>
    <tr>
        <td>
            BiConsumer<'L','R'>
        </td>
        <td>
            (T, U) -> void
        </td>
    </tr>
    <tr>
        <td>
            BiFunction<'T','L','R'>
        </td>
        <td>
            (T, U) -> R
        </td>
    </tr>
    <tr>
        <td>
            Runnable
        </td>
        <td>
            () -> void
        </td>
    </tr>
</table>