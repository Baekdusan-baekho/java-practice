package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {
		
		//48 ~ 150사이의 정수 중 8의 배수만 가로로 출력해 보세요.
		//(48부터 숫자를 하나씩 올려가면서 8의 배수 판별을 반복하면 되겠죠?)
		
		
		int num = 47;
		
		
		while(num < 151) {
			
			
			num++;
			if(num % 8 ==0) {
				System.out.print(" "+num);				
			}		
		}
		System.out.println();//단순 줄 개행
		
		//1부터 100까지의 정수 중 4의 배수이면서
		//8의 배수는 아닌 수를 가로로 출력해 보세요
		int a = 2;
		while(a<101) {
			a += 2;
//			if(a%4==0 && a%8!=0) {//&&그리고
//				System.out.print(a+" ");
//			}
			if(a%4==0) {
				if(a%8!=0) {
					System.out.print(a+" ");
				}
			}
		}
		
		
		System.out.println();
		
		//1~30000까지의 정수 중 258의 배수의 개수를 출력.
		
		int b = 0;
		int bb = 0;
		
		while(b<30001) {
			b += 258;
			if(b%258==0) {
				bb++;
				
			}
			
		}
		System.out.println("1~30000중 258의 배수의 개수:" + bb + "개");
		
		System.out.println();
		
		//1000의 약수의 개수를 구하세요.
		int sam = 0;
		int bam = 0;
		while(sam<1001) {
			sam+=1;
			if(1000%sam == 0) {
				bam++;
			}
			
		}
		System.out.printf("1000의 약수의 개수 %d",bam);
		System.out.println();
	}

}
