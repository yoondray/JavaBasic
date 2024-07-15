# TDD(Test Drive Development)
김영한의 자바 입문 외 테스트 주도 개발을 위한 read.me

스프링 부트 개발에서 단위테스트 

단위테스트(Unit Test)

Fast : 테스트는 빠르게 동작하여 자주 돌릴 수 있어야한다.

Independent : 각각의 테스트는 독립적이며 서로 의존해서는 안된다.

Repeatable : 어느 환경에서도 반복가능해야한다.

Self-Validating : 테스트는 성공 또는 실패로 bool값으로 결과를 내어 자체적으로 검증되어야 한다.

Timely : 테스트는 적시에 즉, 테스트를 하려는 실제 코드를 구현하기 직전에 구현해야한다.


테스트 주도 개발(Test Drive Development) 방법

실패하는 작은 단위 테스트를 작성한다. 처음에는 컴파일조차 되지 않을 수 있다.

빨리 테스트를 통과하기 위해 프로덕션 코드를 작성한다. 정답이 아닌 가짜 구현 등을 작성할 수도있다.

그 다음의 테스트 코드를 작성한다. 실패 테스트가 없을 경우에만 성공 테스트를 작성한다.

새로운 테스트를 통과하기 위해 프로덕션 코드를 추가 또는 수정한다.

1~4단계를 반복하여 실패/성공의 모든 테스트 케이스를 작성한다.

개발된 코드들에 대해 모든 중복을 제거하며 리팩토링한다.

→ Spring과 같은 프레임워크에 적용하는 것은 다른 영역이고, ATDD(Application TDD)라고 불린다.
    (접근방법) 가짜로 구현하기. 삼각측량법(여러 테스트를 작성하고, 일반화함). 명백하게 구현하기



Given - When - Then [준비 - 실행 - 검증] Pattern
ex) 우유가 들어있지 않은 커피의 할인 가격을 검증함

@Mock
CoffeeRepository coffeeRepository;

//Mocking작업
public class MockCoffeeRepository extends CoffeeRepository{...}

@InjectMocks
CoffeeService coffeeService;

@Test
public void When_Get_Discount_Expect_Minus_100() {

  CoffeeService coffeeService = new CoffeeService(new MockCoffeeRepository());

  //given
  String name = "americano";
  int defaultPrice = 1000;
  int expectedPrice = 900;
  when(coffeeRepository.findOne(name)
          .thenReturn(Coffee.builder().name(name).isMilk(false).price(defaultPrice)))
  
  //when
  int actualPrice = coffeeService.getDiscountedPrice(name);
  
  //then
  assertEquals(expectedPrice, actualPrice);
}

result) 1000원짜리 아메리카노는 -100원 할인해서 900원을 리턴하는지 검증한다.


@Mock @InjectMocks @MockBean

Q) Mock 객체는 왜 필요한가?

Service Layer에 Repository가 주입된다.  
만약, CoffeeService의 getDiscountedPrice(커피의 할인가격을 조회하는 기능)을 단위테스트 하는 경우에, @Repository에 대한 의존성은 어떻게 처리하면 좋을까?
-> 이런 경우, Mock 객체를 생성해서 Repository를 임의로 조작하는 방법을 주로 사용한다. (Mocking)

ex) 조작이 필요한 메서드를 @override, 임의의 테스트 데이터를 정의한다.

public class MockCoffeeRepository extends CoffeeRepository {

  @Override
  public Coffee findOne(String name) {
  
    if(name.equals("lattee")) {
      return Coffee.builder().name("lattee").price(4000).isMilk(true).build();
    } else if(name.equals("americano")) {
      return Coffee.builder().name("americano").price(3500).isMilk(false).build();
    }

    return null;
  }
}




