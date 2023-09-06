package etc.exception.basic;

import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/*
        1. 스캐너를 통해서 정수 2개를 입력받습니다.
        2. 입력받은 값이 정수라면, 단순히 입력받은 정수의 합을 출력하고
         반복문을 종료시키세요.
        3. 입력받은 값이 에러를 발생시키는 값이라면 "정수로만 입력하세요"
         를 출력한 후에 다시 입력받을 수 있도록 작성해 주세요.
        4. 반복문을 탈출하면 프로그램 정상 종료 문장을 띄워 주세요.
		*/
		
		//만약 nextInt()가 정수를 가지고 오지 못하는 경우 (문자열 등등)
		//버퍼에 해당 쓰레기 문자가 그대로 남아 있습니다. 그걸 걷어가 주셔야 합니다.
		//nextLine()을 통해 쓰레기 문자를 정리해야 합니다.
	
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("정수1: ");
				int i = sc.nextInt(); //값이 버퍼로 들어감
				System.out.print("정수2: ");
				int aa = sc.nextInt(); //값이 버퍼로 들어감
				System.out.printf("%d + %d = %d",i, aa, i+aa);
				break;
			}catch(Exception e){ 
				//Exception 타입(많이 함유함)이고 e는 변수 이름이다 e의 객체선언같이 
				System.out.println("정수로만 입력하세요!");
				sc.nextLine(); //버퍼에서 쓸모 없는 값을 빼내서 버린다
			}

		}
		sc.close();
		
		
	}

}