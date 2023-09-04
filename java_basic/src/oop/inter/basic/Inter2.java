package oop.inter.basic;

//클래스가 상속 가능한 것처럼 인터페이스도 extends를 사용해서
//인터페이스간의 상속을 구현할 수 있습니다.
//인터페이스들 끼리는 다중 상속도 가능합니다.
//클래스들 끼리는 다중 상속이 안됩니다.

public interface Inter2 extends ParentInter {
	
	int I = 5; // static final
	
	void method2(); //abstract

	void parentMethod();

}
