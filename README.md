# Practice_BE
---

## Folder structure.
```markdown
├─ Practice_BE
│  ├─ Java
│     ├─ blog_ex      // blog 만들기(Ruby, html)
│     ├─ java_ex      // java 문법, Algorithm 위주 실습
│  ├─ Spring
│     ├─ 1. SpringBoot
│         ├─ aop_ex       // Spring AOP 실습
│         ├─ article_ex   // 게시판, 댓글 구현, Spring 페이징
│         ├─ http_ex      // Spring Http 기초
│         ├─ MVC_ex       // MVC Pattern 실습
│         ├─ OOPJDBC_ex   // OOP, JDBC 실습
│         ├─ structure_ex // Spring 기본 구조 연습
│         ├─ valid_ex     // Spring Vaildation 사용
│         ├─ websocket_ex // websocket 실습(실시간 채팅 만들기)
│     ├─ 2. Security
│         ├─ auth_ex      // Spring Security 실습
│         ├─ oauth2_ex    // OAuth 2.0, 소셜 로그인 실습
│     ├─ 3. etc
│         ├─ docker_ex        // docker, MySql 사용(AWS EC2, Linux)
│         ├─ javascript_ex    // javascript 간단하게 사용해보기
│         ├─ mybatis_ex       // mybatis 사용해보기
│     ├─ gateway_ex         // SpringCloud의 route를 이용해 인증 서버 따로 돌려보기
│     ├─ naver-challenge_ex // NaverCloud의 Direction 5(길찾기), Reverse GeoCoding(좌표 주소정보), Web Dynamic Map(지도 조작)
│     ├─ relations_ex       // Entity 관계 매핑, 설정 연습
│     ├─ tdd_ex             // Test Driven Development, Test 작성 후 코드, 리팩토링으로 이어지는 방법론 연습

```
<br>

## Subtree Code.
```
git subtree add --prefix=old_repo https:// ~.git main
```
`old_repo` -> 합쳤을 때 폴더 구조<br>
`https:// ~.git` -> 합치고 싶은 repository의 git 주소
