package basic.operator;

public class ConOperatorQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
        - 42 ~ 396사이의 난수를 발생시킨 후
        발생한 난수가 홀수인지 짝수인지의 여부를
        3항 연산식으로 출력해 보세요.
        
        ex)
        발생한 난수: XX
        3항 연산의 결과: 홀수입니다. or 짝수입니다.
       */
		
		int aa = (int) ((Math.random()*355)+42);
		String bb = (aa % 2 == 1 ? "홀수입니다":"짝수입니다");
		System.out.println("난수:"+aa);
		System.out.println("결과:"+bb);
		
				
	}

}
