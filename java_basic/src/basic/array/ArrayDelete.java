package basic.array;

import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		 //배열의 요소를 삭제해 보자
		//삭제처럼 보임 배열은 삭제란 개념이 존재하지 않는다.
		//버릴 요소를 뒤에 요소로 덮어 씌운다 그래도 전 배열의 크기는 같다
		//크기가 버릴 요소를 뺀 만큼의 새 배열을 만들고 거기에 집어넣는다.
		
		
		int[] arr = {1,3,5,7,9,11,13};
		System.out.println(Arrays.toString(arr));
		
		
//		arr[3] = arr[4];
//		arr[4] = arr[5];
//		arr[5] = arr[6];
		System.out.println("배열의 길이: "+arr.length);
		
		
		// 배열이 크면 힘듦
		//삭제되는 값을 기준으로 뒤에 있는 값을 한 칸씩 앞으로 땡기는 작업.
		//추후에 생성될 새 배열에 값을 그대로 대입하기 편하게 하기 위해 하는 작업.
		for(int i=3;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		System.out.println(Arrays.toString(arr));
		
		//기존의 배열보다 크기가 하나 작은 새 배열을 생성.
		
		int[] arr11 = new int[arr.length-1];
		
		//원본 배열의 값을 새 배열에 인덱스를 맞춰서 그대로 대입
//		arr11[0] = arr11[0];
//		arr11[1] = arr11[1];
//		arr11[2] = arr11[2];
		
		for(int j=0; j<arr11.length;j++) {
			arr11[j] = arr[j];
		}
		
		System.out.println(Arrays.toString(arr11));
		
		//주소 넘기기
		arr = arr11;//arr11의 주소값을 arr에게 넘긴다.
		arr11 = null;//주소값을 지워서 메모리에서 temp는 자동으로 소멸되게 합니다.
		
		System.out.println(arr);
		System.out.println(arr11);
		System.out.println("--------------------");

		System.out.println(Arrays.toString(arr));
	}

}
