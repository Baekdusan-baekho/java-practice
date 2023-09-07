package etc.api.collection_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz {

	public static void main(String[] args) {
		
		/*
        1. engKor이라는 이름으로 Map을 생성해 주세요.
         이 Map은 key로 영단어, value로 한글 뜻을 삽입할 겁니다.
         
        2. 사용자에게 영단어를 입력받아서, 이미 Map에 존재하는 단어라면
         다시 입력받으세요. (이미 존재한다는 메세지 출력)
         영단어 입력창에 '그만' 이라고 입력하면 입력을 종료해 주세요.
         
        3. 영단어 입력 후에는 한글 뜻을 입력받아서 Map에 삽입해 주세요.
        
        4. 입력이 종료되면, 반복문을 이용해서 
        영단어 : 뜻
        영단어 : 뜻
        영단어 : 뜻.... 형태로 입력받은 영단어와 뜻을 모두 출력해 주세요.
        */
		
		Map<String, String> engkor = new HashMap<>();
		engkor.put("respect", "존경");
		engkor.put("math", "수학");
		engkor.put("ocean", "대양");
		engkor.put("earth", "지구");
		engkor.put("machine", "기계");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 영어 단어장 만들기 ***");
		
		
		
		while(true) {
			System.out.println("그만하고 싶다면 '그만' 을 입력하세요");
			System.out.print("영단어: ");
			String eng = sc.next();
			if(engkor.containsKey(eng)) {
				System.out.println("이미 존재하는 단어입니다.");
				continue;
			}else if(eng.equals("그만")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
//			else {
//				System.out.print("한글: ");
//				String ii = sc.next();
//				engkor.put(i, ii);
//				Set<String> keys = engkor.keySet();
//				for(String k : keys) {
//					System.out.println(k+ " : " + engkor.get(k));
//				}
//				System.out.println("-------------------------");
//				System.out.println();
//				
//			}
			System.out.print("한글 뜻: ");
			String kor = sc.next();
			engkor.put(eng, kor);
			System.out.println("영단어 등록 완료!\n");			
		}
		
		System.out.println("\n*** 오늘 등록한 단어 ***");

		Set<String> keys = engkor.keySet();
		for(String k : keys) {
			System.out.println(k+ " : " + engkor.get(k));
		}
		
		sc.close();
		
	
	
		
		
		
		
		

	}

}
