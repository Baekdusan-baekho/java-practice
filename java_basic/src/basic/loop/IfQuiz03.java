package basic.loop;

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {
		
		
		/*
        - 정수 3개를 입력 받습니다.
        - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
        
        # max, mid, min이라는 변수를 미리 선언하셔서
         판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
         마지막에 한번에 출력하시면 되겠습니다.
        */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요: ");
		int add1 = sc.nextInt();
		System.out.print("두번째 정수를 입력해 주세요: ");
		int add2 = sc.nextInt();
		System.out.print("세번째 정수를 입력해 주세요: ");
		int add3 = sc.nextInt();
		
		int max = 0;
		int mid = 0;
		int min = 0;
		
		// int max, mid, min = 0;
		
		if(add1>add2 && add1>add3) {
			if(add2>add3 || add3>add2) {
			max = add1;
			 if(add2>add3) {
				 mid = add2;
				 min = add3;
			 }else {
				 min = add2;
				 mid = add3;
				
			 }
			}
			System.out.println(1);
		
		}
		if(add2>add1 && add2>add3) {
			if(add1>add3 || add3>add1) {
			max = add2;
			 if(add1>add3) {
				 mid = add1;
				 min = add3;
			 }else {
				 min = add1;
				 mid = add3;
				
			 }
			 }		
			System.out.println(2);
		}
		if(add3>add1 && add3>add2) {
			if(add1>add2 || add2>add1) {
				max = add3;
				if(add1>add2) {
					mid = add1;
					min = add2;
				}else {
					min = add1;
					mid = add2;
				}
			}
			System.out.println(3);
		}
		
		
		System.out.printf("큰값 %d 가장작은값 %d 중간값 %d",max,min,mid);

	}
}


