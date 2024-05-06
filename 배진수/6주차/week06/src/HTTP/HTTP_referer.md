# HTTP referer란?
- referer 은 http 헤더중 하나이다
- 어떤 웹사이트나 웹 서버에서 방문자가 왔는지를 파악할 수 있는 기능을 referer 를 통해 할 수 있다.
- 헤더에 담겨 있는 현재 페이지에 요청한 이전 페이지의 url 정보 정도로 보면 된다
- HTTP 헤더에는 User-Agent, Host, Origin 등 여러 정보들이 들어있는데, 서버에서 ‘프로토콜://호스트:포트/경로?쿼리스트링’ 으로 되어있는 전체경로
- 즉, url 정보를 알고 싶다면 헤더의 Referer 를 참조하면 된다고 보면 된다.
- referer 정보는 유저의 프라이버시에 관계되는 경우가 있기 때문에, referer 정보를 송신하지 않는 설정을 할 수 있는 브라우저도 있기도 하다
- 그러나 올바른 referer 정보를 보내지 않으면 문제가 발생할 수도 있는데, 웹서버는 자신의 페이지중 일부 페이지에 올바른 referer 정보를 송신하지 않는 브라우저에 대해 엑세스를 블록해 버리기도 한다

### Referer 사용처

- 정리하자면 referer 의 값은 이 페이지를 요청한 이전 페이지가 무엇인지를 알려주는 정보이다
- 이 referer 는 보통 로그 분석이나 접근 제어를 할 때 이용한다
- 로그 분석을 할 때, 우리 사이틀의 유입이 어떤 검색서비스를 이용한 것인지 알고자 할 때 이 referer 를 분석한다고 보면 된다

### 코드에서 Referer 데이터 얻기

- 클라이언트

```dart
if (document.referrer) {
    var myReferer = document.referrer;
    document.write(myReferer);
}
```

- Node.js

```dart
/* Node.js */
const { headers: { referer } } = req
console.log(referer);
```

- PHP

```dart
if (isset ($_SERVER ['HTTP_REFERER'])) {
	echo $_SERVER ['HTTP_REFERER'];
}
```