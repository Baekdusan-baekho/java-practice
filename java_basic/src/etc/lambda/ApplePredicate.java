package etc.lambda;

@FunctionalInterface // 해당 인터페이스가 람다 표현식으로 객체 생성이 가능한 인터페이스 인지를 검사
public interface ApplePredicate {

    // 사과를 전달받으면 조건에 맞는 검사를 수행하는 메서드
    boolean test(Apple apple);

    // 람다식 인터페이스의 추상메서드는 1개만 존재해야 한다.


}
