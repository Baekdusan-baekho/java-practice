package basic.casting;

public class CastingExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
        - 크기가 큰 데이터 타입의 값을 작은 데이터 타입으로 변환하려면
         반드시 형 변환 연산자: (type)를 사용하여 명시적으로
         형 변환을 진행해 주셔야 합니다. (DownCasting)
         
        - 명시적으로 형 변환을 해야 하는 이유는, DownCasting의 경우
         저장 공간이 줄어들어 데이터 손실의 가능성이 항상 존재하기 때문입니다.
         (overflow"양수쪽", underflow"음수쪽")
        */
		
		int i = 72;
		char c = (char) i;
		//int가 char보다 크기 때문에 수동 변환해주어야 한다
		//앞에 (char)를 넣어줘야 수동으로 형 변환이 바뀐다.
		System.out.println("72의 문자값: "+c);
		
		double d = 4.999999;
		int j = (int) d; //소수점 다 버림 반올림 안됨
		System.out.println("여러분들의 이번 달 월급: "+j*1000000);
		System.out.println(j);
		
		
		int k = 1000;
		byte b = (byte) k;
		System.out.println(b);
		//value -24
		//

	}

}
