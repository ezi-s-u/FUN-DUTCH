package FunAnddutch;

import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import java.util.*;

public class Source {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amo, per, uni, diuni, rem, sum = 0;  //amount(�ѱݾ�), personnel(�ο�), unit(������), divide + unit, remainder(������)
		double divide;
		
		amo =sc.nextInt();
		per = sc.nextInt();
		uni = sc.nextInt();
		
		int[] res = new int[per];
		
		divide = (double)(amo / per); // �ѱݾ�/�ο� == 
	    diuni = ((int)divide / uni) * uni;
	    
	    if (diuni*per==amo) {  // diuni���� �� �Ȱ��� ��
	    	for (int i = 0; i < per; i++) {
	    		res[i] = diuni;
	    	}
	    	
	    } else if (diuni*per<amo) {  //diuni���� ���ڶ� ��
	    	rem = amo-(diuni*per); 
	    	res[0] = diuni + rem;   
	    	
	    	for (int i = 1; i < per; i++) {  // �ڿ� ���� diuni�� �����ϴ� for��
	    		res[i] = diuni;
	    	}
	    	
	    } else { // diuni���� 
	    	rem = diuni*per - amo;
	    	res[0] = diuni - rem;  
	    	
	    	for (int i = 1; i < per; i++) {  // �ڿ� ���� diuni�� �����ϴ� for��
	    		res[i] = diuni;
	    	}
	    }
	    
	    for (int i = 0; i < per; i++) {  // �ڿ� ���� diuni�� �����ϴ� for��
    		System.out.println(res[i]);
    	}
	    
	}
}
		
		/*Random random = new Random(); // ���� ��ü ����
		random.setSeed(System.currentTimeMillis());
		
		int per = sc.nextInt();
		
		String [] arr = {"��", "��", "����", "��"};
		int b = 0;
		
		for(int i = 0; i < per; i++) {
			System.out.print("��");
			for(int j = 0; j < 5; j++) {
				System.out.print(" ");
			}
		}
		
		System.out.println();
		
		for(int k = 0; k < 10; k++) {  //����
			for(int i = 0; i < per; i++) {   //����
				
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
						System.out.print("��");
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
//	Random random = new Random(); // ���� ��ü ����
//	random.setSeed(System.currentTimeMillis());
//	
//	String [] arr = {"��", "��", "����", "��"};
//	int b = 0;
//	
//	for(int i = 0; i < per; i++) {
//		System.out.print("��");
//		for(int j = 0; j < 5; j++) {
//			System.out.print(" ");
//		}
//	}
//	
//	System.out.println();
//	
//	for(int k = 0; k < 10; k++) {  //����
//		for(int i = 0; i < per; i++) {   //����
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
//					System.out.print("��");
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
//int amo, per, uni, diuni, rem, sum = 0;  //amount(�ѱݾ�), personnel(�ο�), unit(������), divide + unit, remainder(������)
//double divide;

//	    //�Է�
//	    System.out.print("�� �󸶸� ������ �ǰ���? >>  ");
//	    amo = sc.nextInt(); 
//	    
//	    System.out.println(" ");
//	    System.out.println(" ");
//	      
//	    System.out.print("�� �� ���� ������ �ǰ���? >>  ");
//	    per = sc.nextInt();
//	      
//	    System.out.println(" ");
//	    System.out.println(" ");
//	    
//	    System.out.print("�� �������� ������ �ǰ���? >>  ");
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
//	    //ó��
//	    int[] res = new int[per]; //��ġ���� �� �ݾ��� ���� �� �迭����
//	    double notuni = amo/uni;  //notuni - �� �ݾ׼��� �Է��� ������ ���� �� (20550���ε� 100������ �������� ���� �ذ��ϱ� ����)
//	    if (notuni != (int)notuni) {
//	    	while (true) {
//	    		System.out.println(amo+"���� "+uni+"�� ������ ���� �� �����ϴ�.");
//		    	System.out.println("�ٽ� �Է����ּ���.");
//		    	System.out.print("�� �� ������ ������ �ǰ���? >>   ");
//			    uni = sc.nextInt();
//			    if (notuni != (int)notuni) break;
//	    	}
//	    }
//	    
//	    //if else if������ 1���ڸ�, 10���ڸ�, 100���ڸ�, 1000���ڸ��� 0���� �˾Ƴ���  1���ڸ� 0�̸� 10���ڸ� �Ѿ�� 0���� Ȯ�� 0�� �ƴϸ� if�� ���� )
//	    
//	    //�̸� �Է� for��
//	    String[] name = new String[per];
//	    for (int i = 0; i<name.length; i++ ){
//	    	System.out.print((i+1)+"��° �̸��� �Է��ϼ��� : "); 
//	    	name[i] = sc.next();
//	    	System.out.println("");
//	    }
//	    	
//	    	
//	    //ó��
//	    divide = (double)(amo / per); // �ѱݾ�/�ο�
//	    diuni = ((int)divide / uni) * uni; 
//	    
//	    if (diuni*per==amo) {  // diuni���� �� �Ȱ��� ��
//	    	for (int i = 0; i < res.length; i++) {
//	    		res[i] = diuni;
//	    	}
//	    	
//	    } else if (diuni*per<amo) {  //diuni���� ���ڶ� ��
//	    	rem = amo-(diuni*per); 
//	    	res[0] = diuni + rem;   
//	    	
//	    	for (int i = 1; i < res.length; i++) {  // �ڿ� ���� diuni�� �����ϴ� for��
//	    		res[i] = diuni;
//	    	}
//	    	
//	    } else { // diuni���� 
//	    	rem = diuni*per - amo;
//	    	res[0] = diuni - rem;  
//	    	
//	    	for (int i = 1; i < res.length; i++) {  // �ڿ� ���� diuni�� �����ϴ� for��
//	    		res[i] = diuni;
//	    	}
//	    }
//	    
//	    System.out.println("");
//    	System.out.println("");
//	    
//	    //���
//	    for (int i = 0; i < res.length; i++) {
//	    	System.out.println(name[i] + " : " + res[i]);
//	    	System.out.println("");
//    	}

