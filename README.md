# TDD(Test Drive Development)
김영한의 자바 입문 외 테스트 주도 개발을 위한 read.me

<br/>

**스프링 부트 개발에서 단위테스트** 

1.단위테스트(Unit Test)
+ Fast : 테스트는 빠르게 동작하여 자주 돌릴 수 있어야한다.
 
+ Independent : 각각의 테스트는 독립적이며 서로 의존해서는 안된다.

+ Repeatable : 어느 환경에서도 반복가능해야한다.

+ Self-Validating : 테스트는 성공 또는 실패로 bool값으로 결과를 내어 자체적으로 검증되어야 한다.

+ Timely : 테스트는 적시에 즉, 테스트를 하려는 실제 코드를 구현하기 직전에 구현해야한다.
  
<br/>


2.테스트 주도 개발(Test Drive Development) 방법

+ 실패하는 작은 단위 테스트를 작성한다. 처음에는 컴파일조차 되지 않을 수 있다.

+ 빨리 테스트를 통과하기 위해 프로덕션 코드를 작성한다. 정답이 아닌 가짜 구현 등을 작성할 수도있다.

+ 그 다음의 테스트 코드를 작성한다. 실패 테스트가 없을 경우에만 성공 테스트를 작성한다.

+ 새로운 테스트를 통과하기 위해 프로덕션 코드를 추가 또는 수정한다.

+ 1~4단계를 반복하여 실패/성공의 모든 테스트 케이스를 작성한다.

+ 개발된 코드들에 대해 모든 중복을 제거하며 리팩토링한다.

→ Spring과 같은 프레임워크에 적용하는 것은 다른 영역이고, ATDD(Application TDD)라고 불린다.
<br/>
<br/>
    (접근방법) 가짜로 구현하기. 삼각측량법(여러 테스트를 작성하고, 일반화함). 명백하게 구현하기


