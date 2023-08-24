package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		
//		int i = 1;
//		int total = 0;
//		while(i<=10) {
////			System.out.println(total);
//			total += i;
//			i++;
//			
//		}
		
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		
//		int totala = 0;
//		for(int ii=1; ii<=10;ii++) {
//			totala += ii;
			
			
//		}
//		System.out.println(totala);
		
		
		//1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를
		//가로로 출력해 보세요.(for)
		
		
		for(int i=1; i<=200; i++) {
			if(i%6==0 && i%12 != 0) {
				System.out.print(i+ " ");
				
			}
		}
		
		System.out.println();
		
		//1~60000까지의 정수 중 177의 배수의 개수를 구해보세요(for)
		
		int f = 0;
		for(int i=1; i<=60000; i++) {
			if(i%177==0) {
				f++;
			}
		}
		System.out.println("1~60000 중 177의 배수의 갯수: "+f);
		
		System.out.println();
		
		//정수를 하나 입력 받아서
		//입력 받은 정수까지의 팩토리얼 값을 구하세요
		//팩토리얼) 5! -> 5*4*3*2*1
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int eee = sc.nextInt();
		
		int ae = 1;
//		for(int i=1;i<=eee;i++) {
//			ae*=i;
//		}
		
		for(int i=eee; i>=1; i--) {
			ae*=i;
		}
		System.out.printf("%d! = %d\n", eee, ae);
		sc.close();
		
		
		
	}

}
