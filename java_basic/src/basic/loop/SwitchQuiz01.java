package basic.loop;

import java.util.Scanner;

public class SwitchQuiz01 {

	public static void main(String[] args) {
		
		/*
        - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
         다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
         연산 결과를 출력해 주시면 됩니다. (switch문 사용)
         연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
         결과를 말씀해 주세요.
        */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력해주세요: ");
		int ii = sc.nextInt();
		System.out.print("연산자를 하나 입력해주세요: ");
		String rr = sc.next();
		System.out.print("두번째 정수를 입력해주세요: ");
		int vv = sc.nextInt();
		// 깃발 전략!!!!!!!!!!!!!!
		//불린형 True False로 만들고 해당 상황 if가 트루일 때 True출력하고
		//다음 조건에서 int flag 가 트루인 상황에서 이벤트 발생
		boolean flag = true;
		
		switch(rr) {
		
		case "+":
			System.out.println(ii+vv);
			break;
			
		case "-":
			System.out.println(ii-vv);
			break;
			
		case "*":
			System.out.println(ii*vv);
			break;
			
		case "/":
			if(vv==0) {
				System.out.println("두번째 정수에 0을 입력하지 마시오");
				flag = false;
				break;
				
			}else {
			 System.out.println((double) ii/vv);
			break;}
			
		default:
			System.out.println("잘못된 입력입니다.");
		}
		if(!flag) { //not true
			System.out.println("0을 입력했다");
		}
		
		sc.close();
	}

}
