package basic.datatype;

public class TextualExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c1 = 'A'; //단일 문자 1글자 밖에 안된다 ""쌍 따옴표도 안된다.
		System.out.println(c1);
		
		char c2 = 65;
		System.out.println(c2); 
		//에러 안남 에러 아님 유니코드 65번이 대문자 A이다 유니코드 번호 지정도 가능
		
		
		/*
        # 문자열을 저장할 수 있는 데이터 타입 String
        - 저장하고 싶은 문자열을 겹따옴표("")에 담아 대입합니다.
        - String은 기본 데이터 타입은 아니지만 자주 쓰이기 때문에
        기본 데이터 타입처럼 사용합니다. (사실은 객체 타입)
        */
		
		String s1 = "my dream ";
		String s2 = "is a programmer";
		System.out.println(s1);
		System.out.println(s2);
		
		
		//자바에서는 문자열의 덧셈 연산을 지원합니다.
		//연산 결과로는 문자열을 연결해서 결합한 결과가 도출됩니다
		// 덧셈 연산만 지원 곱하기 나누기 빼기 안됨
		System.out.println(s1+s2);
		
		//문자열은 다른 데이터 타입 간의 연산
		//결과는 무조건 문자열의 덧셈 연산과 같습니다.
		System.out.println("================================");
		
		System.out.println(100 + 100);
		System.out.println("100"+"100");
		System.out.println(100 + "100");
		System.out.println(3.14 + "hi");
		
		int month = 10;
		int day = 13;
		
		//내 생일은 10월 13일 입니다.
		System.out.println("내 생일은 "+month+"월 "+day+"일 입니다");
		

	}

}
