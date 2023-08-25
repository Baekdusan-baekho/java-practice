package basic.loop;

import java.util.Scanner;

public class BreakQuiz02 {

	public static void main(String[] args) {

		/*
        1. 2가지의 정수를 1~100사이의 난수를 발생시켜서 
         지속적으로 문제를 출제한 후 정답을 입력받으세요.
         사용자가 0을 입력하면 반복문을 탈출시키세요.

        2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.

		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("정답을 입력해 주세요");
		System.out.println("끝내고 싶을 때 0을 입력해주세요");
		int ff = 0;
		int ll = 0;

		while(true) {
			int bb = (int) ((Math.random()*100)+1);
			int cc = (int) ((Math.random()*100)+1);
			int dd = (int) (Math.random()*4);

			int goo = 0;

			


			switch(dd) {
			case 0:
				System.out.printf("%d + %d = ???", bb, cc);
				goo = bb+cc;
				break;
			case 1:
				System.out.printf("%d - %d = ???", bb, cc);
				goo = bb-cc;
				break;
			case 2:
				System.out.printf("%d * %d = ???", bb, cc);
				goo = bb*cc;
				break;
			case 3:
				System.out.printf("%d / %d = ???", bb, cc);
				goo = bb/cc;
				break;
			default: 
				break;
			}
			System.out.print("\n> ");
			int aa = sc.nextInt();



			if(aa==goo) {
				System.out.println("정답입니다");
				System.out.println("-----------");
				System.out.println();
				ff++;
			}else if(aa == 0) {
				System.err.println("종료합니다.");
				break;
			}else {
				System.out.println("\n틀렸습니다.");
				System.out.println("-----------");
				System.out.println();
				ll++;
			}
		}
		System.out.println("정답횟수: "+ff);
		System.out.println("오답횟수: "+ll);


	}

}
