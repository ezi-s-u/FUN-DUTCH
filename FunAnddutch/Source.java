package FunAnddutch;

import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import java.util.*;

public class Source {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amo, per, uni, diuni, rem, sum = 0;  //amount(총금액), personnel(인원), unit(원단위), divide + unit, remainder(나머지)
		double divide;
		
		amo =sc.nextInt();
		per = sc.nextInt();
		uni = sc.nextInt();
		
		int[] res = new int[per];
		
		divide = (double)(amo / per); // 총금액/인원 == 
	    diuni = ((int)divide / uni) * uni;
	    
	    if (diuni*per==amo) {  // diuni값이 다 똑같을 때
	    	for (int i = 0; i < per; i++) {
	    		res[i] = diuni;
	    	}
	    	
	    } else if (diuni*per<amo) {  //diuni값이 모자랄 때
	    	rem = amo-(diuni*per); 
	    	res[0] = diuni + rem;   
	    	
	    	for (int i = 1; i < per; i++) {  // 뒤에 값들 diuni로 지정하는 for문
	    		res[i] = diuni;
	    	}
	    	
	    } else { // diuni값이 
	    	rem = diuni*per - amo;
	    	res[0] = diuni - rem;  
	    	
	    	for (int i = 1; i < per; i++) {  // 뒤에 값들 diuni로 지정하는 for문
	    		res[i] = diuni;
	    	}
	    }
	    
	    for (int i = 0; i < per; i++) {  // 뒤에 값들 diuni로 지정하는 for문
    		System.out.println(res[i]);
    	}
	    
	}
}
		
		/*Random random = new Random(); // 랜덤 객체 생성
		random.setSeed(System.currentTimeMillis());
		
		int per = sc.nextInt();
		
		String [] arr = {"│", "├", "──", "┤"};
		int b = 0;
		
		for(int i = 0; i < per; i++) {
			System.out.print("│");
			for(int j = 0; j < 5; j++) {
				System.out.print(" ");
			}
		}
		
		System.out.println();
		
		for(int k = 0; k < 10; k++) {  //길이
			for(int i = 0; i < per; i++) {   //개수
				
				if(b == 1 && i != 0) {
					b = 3;
				}
				else if(i == per - 1) {
					if(b == 1) {
						b = 3;
					}
					else {
						b = 0;
					}
				}
				else {
					b = random.nextInt(2);
				}
				
				
				System.out.print(arr[b]);
				
				if(b == 1 && i != per - 1) {
					for(int j = 0; j < 5; j++) {
						System.out.print("─");
					}
				}
				else {
					for(int j = 0; j < 5; j++) {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
} */





//public void ladder() {
//	Random random = new Random(); // 랜덤 객체 생성
//	random.setSeed(System.currentTimeMillis());
//	
//	String [] arr = {"│", "├", "──", "┤"};
//	int b = 0;
//	
//	for(int i = 0; i < per; i++) {
//		System.out.print("│");
//		for(int j = 0; j < 5; j++) {
//			System.out.print(" ");
//		}
//	}
//	
//	System.out.println();
//	
//	for(int k = 0; k < 10; k++) {  //길이
//		for(int i = 0; i < per; i++) {   //개수
//			
//			if(b == 1 && i != 0) {
//				b = 3;
//			}
//			else if(i == per - 1) {
//				if(b == 1) {
//					b = 3;
//				}
//				else {
//					b = 0;
//				}
//			}
//			else {
//				b = random.nextInt(2);
//			}
//			
//			
//			System.out.print(arr[b]);
//			
//			if(b == 1 && i != per - 1) {
//				for(int j = 0; j < 5; j++) {
//					System.out.print("─");
//				}
//			}
//			else {
//				for(int j = 0; j < 5; j++) {
//					System.out.print(" ");
//				}
//			}
//		}
//		System.out.println();
//	}
//}





















				
		
//		
//		
//		System.out.println("                      EEEEEEEEEE        AA            sssssss    YY        YY       ");
//		System.out.println("                      EE              AA  AA        ss      ss    YY      YY        ");
//		System.out.println("                      EE             AA    AA      ss              YY    YY         ");
//		System.out.println("                      EE            AA      AA      ss              YYYYYY          ");
//		System.out.println("                      EEEEEEEEEE   AA        AA      sssssssss        YY            ");
//		System.out.println("                      EE           AAAAAAAAAAAA              ss       YY            ");
//		System.out.println("                      EE           AA        AA               ss      YY            ");
//		System.out.println("                      EE           AA        AA     ss       ss       YY            ");
//		System.out.println("                      EEEEEEEEEE   AA        AA      sssssssss        YY            ");
//		
//		System.out.println(" ");
//		System.out.println(" ");
//		
//		System.out.println("              DDDDDDDD       UU        UU    TTTTTTTTTTTT     CCCCCCCCC     HH       HH");
//		System.out.println("              DD     DD      UU        UU         TT         CC       CC    HH       HH");
//		System.out.println("              DD       DD    UU        UU         TT        CC              HH       HH");
//		System.out.println("              DD       DD    UU        UU         TT        CC              HH       HH");
//		System.out.println("              DD       DD    UU        UU         TT        CC              HHHHHHHHHHH");
//		System.out.println("              DD       DD    UU        UU         TT        CC              HH       HH");
//	    System.out.println("              DD       DD    UU        UU         TT        CC              HH       HH");
//	    System.out.println("              DD      DD      UU      UU          TT         CC       CC    HH       HH");
//	    System.out.println("              DDDDDDDD          UUUUUU            TT          CCCCCCCCC     HH       HH");
//	      
//	    System.out.println(" ");
//	    System.out.println(" ");
//	    
//int amo, per, uni, diuni, rem, sum = 0;  //amount(총금액), personnel(인원), unit(원단위), divide + unit, remainder(나머지)
//double divide;

//	    //입력
//	    System.out.print("총 얼마를 나누실 건가요? >>  ");
//	    amo = sc.nextInt(); 
//	    
//	    System.out.println(" ");
//	    System.out.println(" ");
//	      
//	    System.out.print("총 몇 명이 나누실 건가요? >>  ");
//	    per = sc.nextInt();
//	      
//	    System.out.println(" ");
//	    System.out.println(" ");
//	    
//	    System.out.print("몇 원단위로 나누실 건가요? >>  ");
//	    uni = sc.nextInt();
//	    
//	    System.out.println(amo%uni);
//	    
//	    System.out.println(" ");
//	    System.out.println(" ");
//	    System.out.println(" ");
//	    System.out.println(" ");
//	    System.out.println(" ");
//	    System.out.println(" ");
//	    
//	    //처리
//	    int[] res = new int[per]; //더치페이 한 금액이 각각 들어갈 배열생성
//	    double notuni = amo/uni;  //notuni - 총 금액수를 입력한 단위로 나눈 값 (20550원인데 100원단위 선택했을 때를 해결하기 위해)
//	    if (notuni != (int)notuni) {
//	    	while (true) {
//	    		System.out.println(amo+"원은 "+uni+"원 단위로 나눌 수 없습니다.");
//		    	System.out.println("다시 입력해주세요.");
//		    	System.out.print("몇 원 단위로 나누실 건가요? >>   ");
//			    uni = sc.nextInt();
//			    if (notuni != (int)notuni) break;
//	    	}
//	    }
//	    
//	    //if else if문으로 1의자리, 10의자리, 100의자리, 1000의자리가 0인지 알아내고  1의자리 0이면 10의자리 넘어가서 0인지 확인 0이 아니면 if문 나옴 )
//	    
//	    //이름 입력 for문
//	    String[] name = new String[per];
//	    for (int i = 0; i<name.length; i++ ){
//	    	System.out.print((i+1)+"번째 이름을 입력하세요 : "); 
//	    	name[i] = sc.next();
//	    	System.out.println("");
//	    }
//	    	
//	    	
//	    //처리
//	    divide = (double)(amo / per); // 총금액/인원
//	    diuni = ((int)divide / uni) * uni; 
//	    
//	    if (diuni*per==amo) {  // diuni값이 다 똑같을 때
//	    	for (int i = 0; i < res.length; i++) {
//	    		res[i] = diuni;
//	    	}
//	    	
//	    } else if (diuni*per<amo) {  //diuni값이 모자랄 때
//	    	rem = amo-(diuni*per); 
//	    	res[0] = diuni + rem;   
//	    	
//	    	for (int i = 1; i < res.length; i++) {  // 뒤에 값들 diuni로 지정하는 for문
//	    		res[i] = diuni;
//	    	}
//	    	
//	    } else { // diuni값이 
//	    	rem = diuni*per - amo;
//	    	res[0] = diuni - rem;  
//	    	
//	    	for (int i = 1; i < res.length; i++) {  // 뒤에 값들 diuni로 지정하는 for문
//	    		res[i] = diuni;
//	    	}
//	    }
//	    
//	    System.out.println("");
//    	System.out.println("");
//	    
//	    //출력
//	    for (int i = 0; i < res.length; i++) {
//	    	System.out.println(name[i] + " : " + res[i]);
//	    	System.out.println("");
//    	}

