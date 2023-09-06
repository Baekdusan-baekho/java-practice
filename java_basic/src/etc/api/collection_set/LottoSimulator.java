package etc.api.collection_set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.sql.ConnectionPoolDataSource;
import javax.swing.text.html.HTMLDocument.Iterator;

import oop.inter.basic.Inter;

public class LottoSimulator {

	private static final int Integer = 0;

	private static final int List = 0;

	static Random r = new Random();

	static int prize1 = 0; //1등 당첨 횟수를 세 줄 변수
	static int prize2 = 0; //2등 당첨 횟수를 세 줄 변수
	static int prize3 = 0; //3등 당첨 횟수를 세 줄 변수
	static int prize4 = 0; //4등 당첨 횟수를 세 줄 변수
	static int prize5 = 0; //5등 당첨 횟수를 세 줄 변수
	static int failCnt = 0; // 당첨 횟수를 세 줄 변수


	    public static List<Integer> createLotto() {
	        /*
	         - 1~45 범위의 난수 6개를 생성하셔서
	          컬렉션 자료형에 모아서 리턴해 주세요.
	          무엇을 쓰든 상관하지 않겠습니다.
	          중복이 발생하면 안됩니다.
	         */
	    	Set<Integer> set=new HashSet<>();
			Random r = new Random();
			
	    	while(true){
	    		if(set.size()!=6) {
	    			set.add(r.nextInt(46) + 1);
	    		}else break;

			}
	    	List<Integer> convertedlist = new ArrayList<>(set);
	    	Collections.sort(convertedlist);
	    	
	    
	    	return convertedlist;
		

	    
	    }
	    //보너스 번호를 생성하는 메서드
	    public static int createBonusNum(List<Integer> win) {
	        
	        /*
	         - 매개값으로 전달되는 당첨 번호 집합을 전달 받으신 후
	          당첨번호들을 피해서 보너스번호 하나만 뽑아 주세요.
	          범위는 마찬가지로 1 ~ 45 사이의 난수입니다.
	         */
	    	
	    	
	    	
	    	int set1;
	    	Random r = new Random();
	    	
	    	while(true) {
	    		set1 = r.nextInt(46) + 1;
	    		
	    		if(!win.contains(set1)) {
	    			set1 = r.nextInt(46) + 1;
	    			
	    		}else {
	    			break;
	    		}
	    		
	    	}
	    	return set1;

	    
	    	
	    }
	    
	    //당첨 등수를 알려주는 메서드
	    public static int checkLottoNumber(List<Integer> a, List<Integer> bb, int bonusNum) {
	        /*
	         매개값으로 당첨번호집합, 구매한 로또 번호집합, 보너스번호를 받습니다.
	         내 로또 번호와 당첨번호를 비교하여
	         일치하는 횟수를 세 주신 후 등수를 판단하세요.
	         판단된 등수에 해당하는 static 변수의 값을 올려 주시면 됩니다.
	         6개 일치 -> 1등
	         5개 일치 + 보너스번호 일치 -> 2등
	         5개 일치 -> 3등
	         4개 일치 -> 4등
	         3개 일치 -> 5등
	         나머지 -> 꽝
	         */
	    	
	   
	    	
	    	while(true) {
	    		if(a.contains(bb.get(0))){
	    			if(a.contains(bb.get(1))){
	    				if(a.contains(bb.get(2))){
	    					if(a.contains(bb.get(3))){
	    						if(a.contains(bb.get(4))){
	    							if(a.contains(bb.get(4))){
	    								System.out.println("1등 당첨");
	    								prize1++;
	    								break;
	    							}else if(a.contains(bonusNum)){	    								
	    								prize2++;
	    							}else {prize3++;}								    									    							
	    						}else { prize4++;}	    						
	    					}else { prize5++;}
	    					
	    				}
	    				
	    			}
	    				
	    			
	    			
	    		}

	    	}
	    	failCnt = prize1+prize2+prize3+prize4+prize5;
		
			return failCnt;
	    }
			
			
			
	    	

	    	
	    
	    


	public static void main(String[] args) {
		
		Set<Integer> random=new HashSet<>();
		Random r = new Random();

    	for(int i=0; i<6; i++) {
    		
    		if(random.size()!=6) {
    			random.add(r.nextInt(46) + 1);
    		}else break;

		}
    	List<Integer> random1 = new ArrayList<>(random);
    	Collections.sort(random1);
		
		List<Integer> win = createLotto();
		int bonusNum = createBonusNum(win);
		
		int lll = checkLottoNumber(win, random1, bonusNum);
		
		
		
		
    	

		//로또 번호 생성 메서드를 호출해서 당첨 번호를 하나 고정시키세요.

		//보너스번호도 하나 고정시키세요.
		System.out.println("당첨: "+random1);
		System.out.println("보너스: " + bonusNum());
	

		while(true) {
	
//			System.out.println("자동: "+createLotto());

			
			/*
             - 1등이 당첨 될 때까지 반복문을 돌립니다.
             - 1등이 당첨 된다면, 1등이 되기까지 누적 당첨 횟수를 출력하고
              반복문을 종료합니다.
             - 로또를 구매하기 위한 금액도 출력하세요. (long)
			 */
		}
		
		

	}
	private static String bonusNum() {
		// TODO Auto-generated method stub
		return null;
	}

}
