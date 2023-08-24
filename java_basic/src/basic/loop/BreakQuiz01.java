package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {
		
		/*
        1. 2가지의 정수를 1~100사이의 난수를 발생시켜서 
         지속적으로 문제를 출제한 후 정답을 입력받으세요.
         사용자가 0을 입력하면 반복문을 탈출시키세요.
         
        2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
        
       */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("*** 연산 퀴즈 ***");
		System.out.println("# 종료하시려면 0을 입력해주세요.");
		
		int count = 0;
		int countt = 0;
		while(true) {
			
			int aa = (int) ((Math.random()*100)+1);
			int bb = (int) ((Math.random()*100)+1);
			int rana = (int) (Math.random()*2);
			
			int correct; //정답
			if(rana == 0) {
				System.out.printf("%d + %d = ??\n", aa, bb);
				correct = aa + bb;
			}else {
				System.out.printf("%d - %d = ??\n", aa, bb);
				correct = aa - bb;
			}
			
			
			System.out.print("> ");
			int num = sc.nextInt();
			
			if(num==correct) {
				count++;
				System.out.println("잘했어요 정답입니다!");
				System.out.println("----------------");

			}else if(num==0) {
				System.out.println("종료합니다.");
				System.out.println("정답횟수: "+count);
				System.out.println("오답횟수: "+countt);
				break;
			}else {
				countt++;
				System.out.println("틀렸습니다\n");
				System.out.println("----------------");
			}

			
	
		}
		sc.close();
	}

}
