package FunAnddutch;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;

public class FunAndDutch extends JFrame {
	ImageIcon sttBt = new ImageIcon(Main.class.getResource("../Button_Image/btnstt.png")); // sttbtn 외부에서 접근하지												// 못하도록 private로 선언
	ImageIcon sttBt2 = new ImageIcon(Main.class.getResource("../Button_Image/btnstt2.png"));

	ImageIcon imBt = new ImageIcon(Main.class.getResource("../Button_Image/003.png")); // ifmbtn
	ImageIcon imBt2 = new ImageIcon(Main.class.getResource("../Button_Image/004.png"));
	
	ImageIcon pBt = new ImageIcon(Main.class.getResource("../Button_Image/001.png")); // puls
	ImageIcon pBt2 = new ImageIcon(Main.class.getResource("../Button_Image/005.png"));

	ImageIcon mBt = new ImageIcon(Main.class.getResource("../Button_Image/002.png")); // minus
	ImageIcon mBt2 = new ImageIcon(Main.class.getResource("../Button_Image/006.png"));

	ImageIcon imfiniBt = new ImageIcon(Main.class.getResource("../Button_Image/f1.png")); // ifmfinishbtn
	ImageIcon imfiniBt2 = new ImageIcon(Main.class.getResource("../Button_Image/f2.png"));
	
	ImageIcon resBt = new ImageIcon(Main.class.getResource("../Button_Image/resultbtn.png")); // resultbtn
	ImageIcon resBt2 = new ImageIcon(Main.class.getResource("../Button_Image/resultbtn2.png"));
	
	ImageIcon queBt = new ImageIcon(Main.class.getResource("../Button_Image/ques1.png")); // quesbtn
	ImageIcon queBt2 = new ImageIcon(Main.class.getResource("../Button_Image/ques2.png"));
	
	ImageIcon okBt = new ImageIcon(Main.class.getResource("../Button_Image/okbtn.png")); // quesbtn
	ImageIcon okBt2 = new ImageIcon(Main.class.getResource("../Button_Image/okbtn2.png"));

	/* FunAndDutch 생성자 */
	FunAndDutch() {
		
		setTitle("FUN_&_DUTCH"); //프레임 제목
		setSize(720,600); //프레임 크기 설정
		setResizable(false); //프레임 크기조정 못하게
		setLocationRelativeTo(null); //프레임 가운데로
		setVisible(true); //화면에 나타나게
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 닫았을 때 메모리에서 제거되게
		
		setPanel();

		startpage();

		infomationpage();
	}
	
	JFrame rp = new JFrame();
	
	/* 버튼들 선언 */
	JButton sttbtn = new JButton();
	JButton ifmbtn = new JButton();
	JButton plus = new JButton();
	JButton minus = new JButton();
	JButton plus10 = new JButton();
	JButton minus10 = new JButton();
	JButton IfmButtonfinish = new JButton();
	JButton Namefinish = new JButton();
	JButton[] quesbtn = new JButton[10];
	JButton resultbtn = new JButton();
	JButton respageFinish = new JButton();

	/* sttpage 패널 생성 */
	JPanel Sttpage=new JPanel(){ Image background = new ImageIcon(Main.class.getResource("../image/start.png")).getImage();
		public void paintComponent(Graphics g){
			g.drawImage(background,0,0,null); // background를 그려줌
			setOpaque(false); //이걸 해야 배경색이 적용됨
	}};

	/* Ifmpage 패널 생성 */
	JPanel Ifmpage=new JPanel(){ Image background = new ImageIcon(Main.class.getResource("../image/infm.png")).getImage();
		public void paintComponent(Graphics g){																																					// 함수
			g.drawImage(background,0,0,null); // background를 그려줌
			setOpaque(false);
	}};

	/* namepage 패널 생성 */
	JPanel Namepage=new JPanel(){ Image background=new ImageIcon(Main.class.getResource("../image/name.png")).getImage();
		public void paintComponent(Graphics g){																																					// 함수
			g.drawImage(background,0,0,null); // background를 그려줌
			setOpaque(false);
	}};
	
	JPanel Ladderpage=new JPanel(){ Image background=new ImageIcon(Main.class.getResource("../image/ladder.png")).getImage();
		public void paintComponent(Graphics g){
			g.drawImage(background,0,0,null); // background를 그려줌
			setOpaque(false);
	}};
	
	JPanel Respage=new JPanel(){ Image background=new ImageIcon(Main.class.getResource("../image/respage.png")).getImage();
		public void paintComponent(Graphics g){
			g.drawImage(background,0,0,null); // background를 그려줌
			setOpaque(false);
	}};

	JTextField amoTF = new JTextField(); // amount(총금액) 입력받는 텍스트필드
	JTextField perTF = new JTextField(); // personnel(인원) 입력받는 텍스트필드
	JTextField uniTF = new JTextField(); // unit(원단위) 입력받는 텍스트필드

	JTextField[] n = new JTextField[10]; // Ifmpage에서 이름 입력받는 텍스트필드
	JTextField[] resn = new JTextField[10]; // Respage에 이름 출력하는 텍스트필드
	
	JTextField[] a = new JTextField[10]; // Ifmpage에서 더치페이한 금액 출력하는 텍스트필드
	JTextField[] resa = new JTextField[10]; // Respage에서 더치페이한 금액 출력하는 텍스트필드
    
	ImageIcon ld2_1 = new ImageIcon(Main.class.getResource("../image/ld2_1.png"));
	ImageIcon ld2_2 = new ImageIcon(Main.class.getResource("../image/ld2_2.png"));
	ImageIcon ld3_1 = new ImageIcon(Main.class.getResource("../image/ld3_1.png"));
	ImageIcon ld3_2 = new ImageIcon(Main.class.getResource("../image/ld3_2.png"));
	ImageIcon ld4_1 = new ImageIcon(Main.class.getResource("../image/ld4_1.png"));
	ImageIcon ld4_2 = new ImageIcon(Main.class.getResource("../image/ld4_2.png"));
	ImageIcon ld5_1 = new ImageIcon(Main.class.getResource("../image/ld5_1.png"));
	ImageIcon ld5_2 = new ImageIcon(Main.class.getResource("../image/ld5_2.png"));
	ImageIcon ld6_1 = new ImageIcon(Main.class.getResource("../image/ld6_1.png"));
	ImageIcon ld6_2 = new ImageIcon(Main.class.getResource("../image/ld6_2.png"));
	ImageIcon ld7_1 = new ImageIcon(Main.class.getResource("../image/ld7_1.png"));
	ImageIcon ld7_2 = new ImageIcon(Main.class.getResource("../image/ld7_2.png"));
	ImageIcon ld8_1 = new ImageIcon(Main.class.getResource("../image/ld8_1.png"));
	ImageIcon ld8_2 = new ImageIcon(Main.class.getResource("../image/ld8_2.png"));
	ImageIcon ld9_1 = new ImageIcon(Main.class.getResource("../image/ld9_1.png"));
	ImageIcon ld9_2 = new ImageIcon(Main.class.getResource("../image/ld9_2.png"));
	ImageIcon ld10_1 = new ImageIcon(Main.class.getResource("../image/ld10_1.png"));
	ImageIcon ld10_2 = new ImageIcon(Main.class.getResource("../image/ld10_2.png"));
	
	ImageIcon equ = new ImageIcon(Main.class.getResource("../image/equ.png"));
	
	ImageIcon rt = new ImageIcon(Main.class.getResource("../image/resTitle.png"));
	
	JLabel amoOk = new JLabel(); //ifmbtn이 눌렸을 때 나오는 "금액이 입력되었습니다." 라벨
	JLabel amoNot = new JLabel(); //ifmbtn이 눌리지 않았을 때 나오는 "아직 금액이 입력되지않았습니다.(옆 입력버튼 누르기)" 라벨
	
	JLabel LP2_1 = new JLabel(); // 사다리 그림 라벨
	JLabel LP2_2 = new JLabel(); 
	JLabel LP3_1 = new JLabel(); 
	JLabel LP3_2 = new JLabel(); 
	JLabel LP4_1 = new JLabel(); 
	JLabel LP4_2 = new JLabel(); 
	JLabel LP5_1 = new JLabel(); 
	JLabel LP5_2 = new JLabel(); 
	JLabel LP6_1 = new JLabel(); 
	JLabel LP6_2 = new JLabel(); 
	JLabel LP7_1 = new JLabel(); 
	JLabel LP7_2 = new JLabel(); 
	JLabel LP8_1 = new JLabel(); 
	JLabel LP8_2 = new JLabel(); 
	JLabel LP9_1 = new JLabel(); 
	JLabel LP9_2 = new JLabel(); 
	JLabel LP10_1 = new JLabel();
	JLabel LP10_2 = new JLabel();
	
	JLabel resTitle = new JLabel(rt); //respage에서 "사다리 타기 결과" 라벨
	
	JLabel[] eq = new JLabel[10]; //respage에서 화살표 라벨
	
	/* 계산에 필요한 변수 선언 */
	static int amo; // 총 금액
	static int per = 2; // 인원 수
	static int uni = 10; // 단위수

	static int[] resDch; // 최종적으로 더치페이한 금액 들어가는 배열
	static int[] Rand; // 더치페이한 금액을 랜덤으로 만들어줄 랜덤값 들어가는 배열 
	static int[] resA = new int[10]; //랜덤 인덱스를 가진 resDch저장하는 배열

	String[] name = new String[10]; // n텍스트필드에서 받은 이름 값 저장하는 배열 (resn에 넣기위해)
	
	static int LdRand; // 사다리 그림 2가지 중 하나 랜덤으로 나오게할 0~1까지 랜덤 값
	
	/* 시작 페이지 설정 메서드 */
	public void startpage() {
		/* 시작버튼 설정 */
		sttbtn.setVisible(true);
		sttbtn.setLayout(null);// 레이아웃
		sttbtn.setBounds(240, 400, 236, 67);// 위치,크기
		sttbtn.setIcon(sttBt);
		sttbtn.setRolloverIcon(sttBt2); // 마우스가 버튼에 올라갈 때 이미지 변하게
		sttbtn.setBorderPainted(false); // 버튼 테투리 해제

		/* 버튼 누르면 다음 패널으로 이동하게 */
		sttbtn.addActionListener(new ActionListener() { // sttbtn을 눌렀을 때 효과추가
			public void actionPerformed(ActionEvent e) {
				Sttpage.setVisible(false);// 창이 안 보이게
				Ifmpage.setVisible(true);// 창이 보이게
			}
		});
		
		Sttpage.add(sttbtn); // sttpage 패널에 시작 버튼 추가
		add(Sttpage);
	}

	/* 정보 입력 페이지 설정 메서드 */
	public void infomationpage() {
		/* 총금액, 인원 수, 단위수 입력받는 텍스트필드 설정*/
		amoTF.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		amoTF.setBounds(208, 145, 200, 45);
		amoTF.setVisible(true);
		amoTF.setBackground(Color.white);

		perTF.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		perTF.setBounds(208, 245, 200, 45);
		perTF.setVisible(true);
		perTF.setBackground(Color.white);
		perTF.setEditable(false);
		perTF.setText("" + per);

		uniTF.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		uniTF.setBounds(208, 345, 200, 45);
		uniTF.setVisible(true);
		uniTF.setBackground(Color.white);
		uniTF.setEditable(false);
		uniTF.setText("" + uni);

		/* ifmbtn이 눌렸는지 확인하는 라벨 설정 */
		amoNot.setFont(new Font("맑은 고딕", Font.BOLD, 11));
		amoNot.setBounds(208, 187, 600, 28);
		amoNot.setVisible(true);
		amoNot.setText("아직 금액이 입력되지않았습니다.(옆 입력버튼 누르기)");
		
		amoOk.setFont(new Font("맑은 고딕", Font.BOLD, 11));
		amoOk.setBounds(208, 187, 200, 25);
		amoOk.setVisible(false);
		amoOk.setText("금액이 입력되었습니다.");
		
	    ifmbtn.setLayout(null);//레이아웃
		ifmbtn.setBounds(420, 145,144, 45);//위치,크기
		ifmbtn.setIcon(imBt);
		ifmbtn.setRolloverIcon(imBt2); // 마우스가 버튼에 올라갈 때 이미지 변하게
		ifmbtn.setBorderPainted(false); // 버튼 테투리 해제
		ifmbtn.setVisible(true);

		ifmbtn.addActionListener(new ActionListener() {	//btnstt을 눌렀을 때 효과추가
			public void actionPerformed(ActionEvent e) {
				amo = Integer.parseInt(amoTF.getText());
				amoNot.setVisible(false);
				amoOk.setVisible(true);
			}
		});

		PlMiButton();
		PlMi10Button(); // 단위 수는 10씩 올라가도록 함
		
		/* 입력 완료 버튼 설정 */
		IfmButtonfinish.setVisible(true);
		IfmButtonfinish.setLayout(null);// 레이아웃
		IfmButtonfinish.setBounds(240, 440, 210, 67);// 위치,크기
		IfmButtonfinish.setIcon(imfiniBt);
		IfmButtonfinish.setRolloverIcon(imfiniBt2); // 마우스가 버튼에 올라갈 때 이미지 변하게
		IfmButtonfinish.setBorderPainted(false); // 버튼 테투리 해제

		/* 버튼 누르면 다음 패널으로 이동하게 */
		IfmButtonfinish.addActionListener(new ActionListener() { // sttbtn을 눌렀을 때 효과추가
			public void actionPerformed(ActionEvent e) {
				Ifmpage.setVisible(false);// 창이 안 보이게
				Namepage.setVisible(true);
				switch (per) {
				case 2: name_ladder_page2(); break;
				case 3: name_ladder_page3(); break;
				case 4: name_ladder_page4(); break;
				case 5: name_ladder_page5(); break;
				case 6: name_ladder_page6(); break;
				case 7: name_ladder_page7(); break;
				case 8: name_ladder_page8(); break;
				case 9: name_ladder_page9(); break;
				case 10: name_ladder_page10(); break;
				}
			}
		});
		
		/* 텍스트 필드 패널에 넣기 */
		Ifmpage.add(amoTF);
		Ifmpage.add(perTF);
		Ifmpage.add(uniTF);
		
		Ifmpage.add(amoNot);
		Ifmpage.add(amoOk);
		
		Ifmpage.add(ifmbtn);
		/* ifmbtn 버튼 패널에 넣기 */
		Ifmpage.add(IfmButtonfinish);
		
		/* 프레임에 패널 넣기 */
		add(Ifmpage);

	}
	
	/* Rand와 LdRand에 랜덤값을 넣는 메서드*/
	public void getRand(int p) {
		Rand = new int[p];
		
		for(int i = 0; i < p; i++) { // per = 3
			Rand[i]=(int)(Math.random()*p);  // 0 1 2
			for(int j = 0; j < i; j++) { // 중복제거
				if(Rand[i] == Rand[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i < 2; i++) {
			LdRand=(int)(Math.random()*1); // 0~1
		}
	}
	
	/* 이름 입력 텍스트필드, 금액 출력 텍스트필드 설정 */
	public void set_Nametf_Amotf(int p) {
		for(int i = 0; i < p; i++) {
			n[i] = new JTextField(10);
			
			n[i].setFont(new Font("맑은 고딕", Font.BOLD, 13));
			n[i].setVisible(true);
			n[i].setBackground(Color.white);
			
			a[i] = new JTextField(10);
			
			a[i].setFont(new Font("맑은 고딕", Font.BOLD, 13));
			a[i].setVisible(true);
			a[i].setBackground(Color.white);
			a[i].setEditable(false);
		}

	}

	/* 패널 기본 설정 메서드 */
	public void setPanel () {
		Sttpage.setLayout(null);
		Sttpage.setBounds(0, 0, 720, 600);
		Sttpage.setVisible(true);
		
		Ifmpage.setLayout(null);
		Ifmpage.setBounds(0, 0, 720, 600);
		Ifmpage.setVisible(false); // 생성자에서 호출을 했기때문에 처음에는 안 보이도록
		
		Namepage.setLayout(null);
		Namepage.setBounds(0, 0, 720, 600);
		Namepage.setVisible(false);
		
		Ladderpage.setLayout(null);
		Ladderpage.setBounds(0, 0, 720, 600);
		Ladderpage.setVisible(false);
		
		Respage.setLayout(null);
		Respage.setBounds(0, 0, 400, 500);
		Respage.setVisible(true);
	}
	
	/* namepage, ladderpage 공통으로 들어가는 요소들 모은 메서드 */
	public void set_N_L_page() {
		//Namepage
		set_Nametf_Amotf(per);  // 이름 입력 텍스트필드, 금액 출력 텍스트필드 설정
		getRand(per); // 랜덤 숫자 받는
		setRespage(per);
				
		for(int i = 0; i < per; i++) {
			n[i].setHorizontalAlignment(JTextField.CENTER);
			a[i].setHorizontalAlignment(JTextField.CENTER);
			Namepage.add(n[i]);
		}
				
		Namepage.add(Namefinish);
				
		Namefinish.setVisible(true);
		Namefinish.setLayout(null);// 레이아웃
		Namefinish.setBounds(240, 300, 210, 67);// 위치,크기
		Namefinish.setBorderPainted(false); // 버튼 테투리 해제
		Namefinish.setIcon(imfiniBt);
		Namefinish.setRolloverIcon(imfiniBt2); // 마우스가 버튼에 올라갈 때 이미지 변하게

			/* 버튼 누르면 다음 패널으로 이동하게 */
		Namefinish.addActionListener(new ActionListener() { // sttbtn을 눌렀을 때 효과추가
			public void actionPerformed(ActionEvent e) {
				Namepage.setVisible(false);// 창이 안 보이게
				Ladderpage.setVisible(true);
				for(int i = 0; i < per; i++) {
					Ladderpage.add(n[i]);
					name[i] = n[i].getText();
					resn[i].setText(""+name[i]);
					n[i].setEditable(false);
				}
			}
		});
				
		add(Namepage);
		
		//ladderpage
		Cal_result(amo, per, uni);
				
		for(int i = 0; i < per; i++) {
			resA[i] = resDch[Rand[i]];
		}
		
		for(int i = 0; i < per; i++) {
			quesbtn[i] = new JButton();
					
			quesbtn[i].setVisible(true);
			quesbtn[i].setLayout(null);// 레이아웃
			quesbtn[i].setBorderPainted(false); // 버튼 테투리 해제
			quesbtn[i].setIcon(queBt);
			quesbtn[i].setRolloverIcon(queBt2); // 마우스가 버튼에 올라갈 때 이미지 변하게
			Ladderpage.add(quesbtn[i]);
		}

		/* quesbtn버튼 누르면 그 버튼은 없어지면서 더치페이한 금액이 보이도록 */
		for(int i = 0; i < per; i++) {
			final int t = i;
			quesbtn[t].addActionListener(new ActionListener() { // sttbtn을 눌렀을 때 효과추가
				public void actionPerformed(ActionEvent e) {
					quesbtn[t].setVisible(false);
					Ladderpage.add(a[t]);
							
					a[t].setText(""+resA[t]);
				}
			});
		}
				
		resultbtn.setVisible(true);
		resultbtn.setLayout(null);// 레이아웃
		resultbtn.setBounds(270, 50, 170, 50);
		resultbtn.setIcon(resBt);
		resultbtn.setRolloverIcon(resBt2); // 마우스가 버튼에 올라갈 때 이미지 변하게
		resultbtn.setBorderPainted(false); // 버튼 테투리 해제

		/* resultbtn버튼 누르면 사다리 타기 결과 프레임이 나오도록 */
		resultbtn.addActionListener(new ActionListener() { // sttbtn을 눌렀을 때 효과추가
			public void actionPerformed(ActionEvent e) {
				rp.setTitle("Result"); //프레임 제목
				if (per < 4) {
					rp.setSize(400,125+(per*70)); // rp프레임 크기를 유동적으로
				} else if(per < 6) {
					rp.setSize(400,125+(per*60));
				} else if (per < 9) {
					rp.setSize(400,125+(per*50)); 
				} else {
					rp.setSize(400,125+(per*47)); 
				}
				rp.setResizable(false); //프레임 크기조정 못하게
				rp.setLocationRelativeTo(null); //프레임 가운데로
				rp.setVisible(true); //화면에 나타나게
				//rp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				rp.add(Respage);
			}
		});	
		Ladderpage.add(resultbtn);
		add(Ladderpage);
	}
	
	// 2명부터 시작이기 때문에 9개 필요함
	public void name_ladder_page2() {
		
		set_N_L_page(); // 기본 설정
		
		// 이름 입력받는 텍스트 필드 위치, 크기 설정
		n[0].setBounds(208, 150, 100, 30); // 1번이름
		n[1].setBounds(400, 150, 100, 30); // 2번이름
		
		// 더치페이한 금액 출력하는 텍스트 필드 위치, 크기 설정
		a[0].setBounds(208, 500, 100, 30); // 1번이름
		a[1].setBounds(400, 500, 100, 30); // 2번이름
		
		// 물음표 버튼 위치, 크기 설정
		quesbtn[0].setBounds(208, 500, 100, 30);
		quesbtn[1].setBounds(400, 500, 100, 30);
		
		LP2_1.setVisible(true);
		LP2_1.setLayout(null);// 레이아웃
		LP2_1.setBounds(0, 180, 720, 320);// 위치,크기
		LP2_1.setEnabled(false);
		LP2_1.setIcon(ld2_1);
		
		LP2_2.setVisible(true);
		LP2_2.setLayout(null);// 레이아웃
		LP2_2.setBounds(0, 180, 720, 320);// 위치,크기
		LP2_2.setEnabled(false);
		LP2_2.setIcon(ld2_2);

		//랜덤으로 add 설정
		if(LdRand == 1) {
			Ladderpage.add(LP2_1);
			resa[0].setText(""+resA[1]);
			resa[1].setText(""+resA[0]);
		} else {
			Ladderpage.add(LP2_2);
			resa[0].setText(""+resA[0]);
			resa[1].setText(""+resA[1]);
		}
	}

	public void name_ladder_page3() {

		set_N_L_page();

		for(int i = 0; i < per; i++) {
			n[i].setBounds(160+i*140, 150, 100, 30);
			a[i].setBounds(160+i*140, 500, 100, 30);
			quesbtn[i].setBounds(160+i*140, 500, 100, 30);
		}
		LP3_1.setVisible(true);
		LP3_1.setLayout(null);// 레이아웃
		LP3_1.setBounds(0, 180, 720, 320);// 위치,크기
		LP3_1.setEnabled(false);
		LP3_1.setIcon(ld3_1);
		
		LP3_2.setVisible(true);
		LP3_2.setLayout(null);// 레이아웃
		LP3_2.setBounds(0, 180, 720, 320);// 위치,크기
		LP3_2.setEnabled(false);
		LP3_2.setIcon(ld3_2);
		
		if(LdRand == 1) {
			Ladderpage.add(LP3_1);
			resa[0].setText(""+resA[1]);
			resa[1].setText(""+resA[2]);
			resa[2].setText(""+resA[0]);
		} else {
			Ladderpage.add(LP3_2);
			resa[0].setText(""+resA[2]);
			resa[1].setText(""+resA[0]);
			resa[2].setText(""+resA[1]);
		}
	}

	public void name_ladder_page4() {
		
		set_N_L_page();
		
		for(int i = 0; i < per; i++) {
			n[i].setBounds(110+i*130, 150, 100, 30);
			a[i].setBounds(110+i*130, 500, 100, 30);
			quesbtn[i].setBounds(110+i*130, 500, 100, 30);
		}
		LP4_1.setVisible(true);
		LP4_1.setLayout(null);// 레이아웃
		LP4_1.setBounds(0, 180, 720, 320);// 위치,크기
		LP4_1.setEnabled(false);
		LP4_1.setIcon(ld4_1);
		
		LP4_2.setVisible(true);
		LP4_2.setLayout(null);// 레이아웃
		LP4_2.setBounds(0, 180, 720, 320);// 위치,크기
		LP4_2.setEnabled(false);
		LP4_2.setIcon(ld4_2);
		
		if(LdRand == 1) {
			Ladderpage.add(LP4_1);
			resa[0].setText(""+resA[1]);
			resa[1].setText(""+resA[2]);
			resa[2].setText(""+resA[0]);
			resa[3].setText(""+resA[3]);
		} else {
			Ladderpage.add(LP4_2);
			resa[0].setText(""+resA[3]);
			resa[1].setText(""+resA[1]);
			resa[2].setText(""+resA[2]);
			resa[3].setText(""+resA[0]);
		}
	}

	public void name_ladder_page5() {
		
		set_N_L_page();
		
		for(int i = 0; i < per; i++) {
			n[i].setBounds(45+i*130, 150, 100, 30);
			a[i].setBounds(45+i*130, 500, 100, 30);
			quesbtn[i].setBounds(45+i*130, 500, 100, 30);
		}
		LP5_1.setVisible(true);
		LP5_1.setLayout(null);// 레이아웃
		LP5_1.setBounds(0, 180, 720, 320);// 위치,크기
		LP5_1.setEnabled(false);
		LP5_1.setIcon(ld5_1);
		
		LP5_2.setVisible(true);
		LP5_2.setLayout(null);// 레이아웃
		LP5_2.setBounds(0, 180, 720, 320);// 위치,크기
		LP5_2.setEnabled(false);
		LP5_2.setIcon(ld5_2);
		
		if(LdRand == 1) {
			Ladderpage.add(LP5_1);
			resa[0].setText(""+resA[0]);
			resa[1].setText(""+resA[4]);
			resa[2].setText(""+resA[3]);
			resa[3].setText(""+resA[1]);
			resa[4].setText(""+resA[2]);
		} else {
			Ladderpage.add(LP5_2);
			resa[0].setText(""+resA[2]);
			resa[1].setText(""+resA[0]);
			resa[2].setText(""+resA[1]);
			resa[3].setText(""+resA[4]);
			resa[4].setText(""+resA[3]);
		}
	}

	public void name_ladder_page6() {
		
		set_N_L_page();
		
		for(int i = 0; i < per; i++) {
			n[i].setBounds(70+i*100, 150, 70, 25);
			a[i].setBounds(70+i*100, 500, 70, 25);
			quesbtn[i].setBounds(70+i*100, 500, 70, 25);
		}
		LP6_1.setVisible(true);
		LP6_1.setLayout(null);// 레이아웃
		LP6_1.setBounds(0, 175, 720, 320);// 위치,크기
		LP6_1.setEnabled(false);
		LP6_1.setIcon(ld6_1);
		
		LP6_2.setVisible(true);
		LP6_2.setLayout(null);// 레이아웃
		LP6_2.setBounds(0, 175, 720, 320);// 위치,크기
		LP6_2.setEnabled(false);
		LP6_2.setIcon(ld6_2);
		
		if(LdRand == 1) {
			Ladderpage.add(LP6_1);
			resa[0].setText(""+resA[5]);
			resa[1].setText(""+resA[0]);
			resa[2].setText(""+resA[2]);
			resa[3].setText(""+resA[1]);
			resa[4].setText(""+resA[4]);
			resa[5].setText(""+resA[3]);
		} else {
			Ladderpage.add(LP6_2);
			resa[0].setText(""+resA[1]);
			resa[1].setText(""+resA[2]);
			resa[2].setText(""+resA[0]);
			resa[3].setText(""+resA[3]);
			resa[4].setText(""+resA[5]);
			resa[5].setText(""+resA[4]);
		}
	}

	public void name_ladder_page7() {
		
		set_N_L_page();
		
		for(int i = 0; i < per; i++) {
			n[i].setBounds(47+i*90, 150, 70, 25);
			a[i].setBounds(47+i*90, 500, 70, 25);
			quesbtn[i].setBounds(47+i*90, 500, 70, 25);
		}
		LP7_1.setVisible(true);
		LP7_1.setLayout(null);// 레이아웃
		LP7_1.setBounds(0, 175, 720, 325);// 위치,크기
		LP7_1.setEnabled(false);
		LP7_1.setIcon(ld7_1);
		
		LP7_2.setVisible(true);
		LP7_2.setLayout(null);// 레이아웃
		LP7_2.setBounds(0, 175, 720, 325);// 위치,크기
		LP7_2.setEnabled(false);
		LP7_2.setIcon(ld7_2);
		
		if(LdRand == 1) {
			Ladderpage.add(LP7_1);
			resa[0].setText(""+resA[4]);
			resa[1].setText(""+resA[1]);
			resa[2].setText(""+resA[5]);
			resa[3].setText(""+resA[0]);
			resa[4].setText(""+resA[2]);
			resa[5].setText(""+resA[6]);
			resa[6].setText(""+resA[3]);
		} else {
			Ladderpage.add(LP7_2);
			resa[0].setText(""+resA[1]);
			resa[1].setText(""+resA[0]);
			resa[2].setText(""+resA[2]);
			resa[3].setText(""+resA[4]);
			resa[4].setText(""+resA[3]);
			resa[5].setText(""+resA[5]);
			resa[6].setText(""+resA[6]);
		}
	}

	public void name_ladder_page8() {

		set_N_L_page();
		
		for(int i = 0; i < per; i++) {
			n[i].setBounds(42+i*80, 150, 70, 25);
			a[i].setBounds(42+i*80, 500, 70, 25);
			quesbtn[i].setBounds(42+i*80, 500, 70, 25);
		}
		LP8_1.setVisible(true);
		LP8_1.setLayout(null);// 레이아웃
		LP8_1.setBounds(0, 175, 720, 325);// 위치,크기
		LP8_1.setEnabled(false);
		LP8_1.setIcon(ld8_1);
		
		LP8_2.setVisible(true);
		LP8_2.setLayout(null);// 레이아웃
		LP8_2.setBounds(0, 175, 720, 325);// 위치,크기
		LP8_2.setEnabled(false);
		LP8_2.setIcon(ld8_2);
		
		if(LdRand == 1) {
			Ladderpage.add(LP8_1);
			resa[0].setText(""+resA[1]);
			resa[1].setText(""+resA[4]);
			resa[2].setText(""+resA[2]);
			resa[3].setText(""+resA[0]);
			resa[4].setText(""+resA[3]);
			resa[5].setText(""+resA[5]);
			resa[6].setText(""+resA[7]);
			resa[7].setText(""+resA[6]);
		} else {
			Ladderpage.add(LP8_2);
			resa[0].setText(""+resA[0]);
			resa[1].setText(""+resA[3]);
			resa[2].setText(""+resA[6]);
			resa[3].setText(""+resA[1]);
			resa[4].setText(""+resA[4]);
			resa[5].setText(""+resA[7]);
			resa[6].setText(""+resA[2]);
			resa[7].setText(""+resA[5]);
		}
	}

	public void name_ladder_page9() {
		
		set_N_L_page();

		for(int i = 0; i < per; i++) {
			n[i].setBounds(41+i*70, 150, 60, 25);
			a[i].setBounds(41+i*70, 500, 60, 25);
			quesbtn[i].setBounds(41+i*70, 500, 60, 25);
		}
		LP9_1.setVisible(true);
		LP9_1.setLayout(null);// 레이아웃
		LP9_1.setBounds(0, 175, 720, 325);// 위치,크기
		LP9_1.setEnabled(false);
		LP9_1.setIcon(ld9_1);
		
		LP9_2.setVisible(true);
		LP9_2.setLayout(null);// 레이아웃
		LP9_2.setBounds(0, 175, 720, 325);// 위치,크기
		LP9_2.setEnabled(false);
		LP9_2.setIcon(ld9_2);
		
		if(LdRand == 1) {
			Ladderpage.add(LP9_1);
			resa[0].setText(""+resA[3]);
			resa[1].setText(""+resA[6]);
			resa[2].setText(""+resA[1]);
			resa[3].setText(""+resA[0]);
			resa[4].setText(""+resA[2]);
			resa[5].setText(""+resA[4]);
			resa[6].setText(""+resA[5]);
			resa[7].setText(""+resA[8]);
			resa[8].setText(""+resA[7]);
		} else {
			Ladderpage.add(LP9_2);
			resa[0].setText(""+resA[2]);
			resa[1].setText(""+resA[4]);
			resa[2].setText(""+resA[6]);
			resa[3].setText(""+resA[5]);
			resa[4].setText(""+resA[0]);
			resa[5].setText(""+resA[1]);
			resa[6].setText(""+resA[8]);
			resa[7].setText(""+resA[7]);
			resa[8].setText(""+resA[3]);
		}
	}

	public void name_ladder_page10 () {

		set_N_L_page();
		
		for(int i = 0; i < per; i++) {
			n[i].setBounds(16+i*69, 150, 60, 25);
			a[i].setBounds(16+i*69, 500, 60, 25);
			quesbtn[i].setBounds(16+i*69, 500, 60, 25);
		}
		LP10_1.setVisible(true);
		LP10_1.setLayout(null);// 레이아웃
		LP10_1.setBounds(0, 175, 720, 325);// 위치,크기
		LP10_1.setEnabled(false);
		LP10_1.setIcon(ld10_1);
		
		LP10_2.setVisible(true);
		LP10_2.setLayout(null);// 레이아웃
		LP10_2.setBounds(0, 175, 720, 325);// 위치,크기
		LP10_2.setEnabled(false);
		LP10_2.setIcon(ld10_2);
		
		if(LdRand == 1) {
			Ladderpage.add(LP10_1);
			resa[0].setText(""+resA[2]);
			resa[1].setText(""+resA[6]);
			resa[2].setText(""+resA[1]);
			resa[3].setText(""+resA[5]);
			resa[4].setText(""+resA[3]);
			resa[5].setText(""+resA[0]);
			resa[6].setText(""+resA[9]);
			resa[7].setText(""+resA[7]);
			resa[8].setText(""+resA[8]);
			resa[9].setText(""+resA[4]);
		} else {
			Ladderpage.add(LP10_2);
			resa[0].setText(""+resA[0]);
			resa[1].setText(""+resA[4]);
			resa[2].setText(""+resA[8]);
			resa[3].setText(""+resA[3]);
			resa[4].setText(""+resA[2]);
			resa[5].setText(""+resA[5]);
			resa[6].setText(""+resA[7]);
			resa[7].setText(""+resA[9]);
			resa[8].setText(""+resA[1]);
			resa[9].setText(""+resA[6]);
		}
	}
	
	public void setRespage(int p) {
		for(int i = 0; i < p; i++) {
			eq[i] = new JLabel(equ);
			resn[i] = new JTextField();
			resa[i] = new JTextField();
		
			eq[i].setVisible(true);
			eq[i].setLayout(null);
			eq[i].setBounds(176, 85+i*39, 36, 15);
			
			resn[i].setBounds(87, 80+i*39, 85, 25);
			resn[i].setEditable(false);
			resn[i].setBackground(Color.white);
			resn[i].setFont(new Font("맑은 고딕", Font.BOLD, 13));
			resn[i].setHorizontalAlignment(JTextField.CENTER);
			
			resa[i].setFont(new Font("맑은 고딕", Font.BOLD, 13));
			resa[i].setBounds(217, 80+i*39, 82, 25);
			resa[i].setEditable(false);
			resa[i].setBackground(Color.white);
			resa[i].setHorizontalAlignment(JTextField.CENTER);
			
			respageFinish.setBounds(142,(80+i*39)+52, 110, 42);
			respageFinish.setVisible(true);
			respageFinish.setBorderPainted(false);
			respageFinish.setLayout(null);// 레이아웃
			respageFinish.setBorderPainted(false); // 버튼 테투리 해제
			respageFinish.setIcon(okBt);
			respageFinish.setRolloverIcon(okBt2); // 마우스가 버튼에 올라갈 때 이미지 변하게
			
			respageFinish.addActionListener(new ActionListener() { // sttbtn을 눌렀을 때 효과추가
				public void actionPerformed(ActionEvent e) {
					rp.setVisible(false); //화면에서 사라지게
				}
			});	
			
			Respage.add(respageFinish);
			Respage.add(eq[i]);
			Respage.add(resn[i]);
			Respage.add(resa[i]);
		}
		resTitle.setVisible(true);
		resTitle.setLayout(null);
		resTitle.setBounds(70, 13, 250, 60);
		Respage.add(resTitle);
	}

	public void PlMiButton() {
		
		plus.setLayout(null);//레이아웃
		plus.setBounds(420, 245, 45, 45);//위치,크기
		plus.setIcon(pBt);
		plus.setRolloverIcon(pBt2); // 마우스가 버튼에 올라갈 때 이미지 변하게
		plus.setBorderPainted(false); // 버튼 테투리 해제
		
		minus.setLayout(null);//레이아웃
		minus.setBounds(480, 245, 45, 45);//위치,크기
		minus.setIcon(mBt);
		minus.setRolloverIcon(mBt2); // 마우스가 버튼에 올라갈 때 이미지 변하게
		minus.setBorderPainted(false); // 버튼 테투리 해제
		
		/* 버튼 누르면 +1 */
		plus.addActionListener(new ActionListener() {	//btnstt을 눌렀을 때 효과추가
			public void actionPerformed(ActionEvent e) {
				per = Integer.parseInt(perTF.getText());
				if (per < 10) {
	    			per++;
				}
				perTF.setText(""+per);
			}
		});
		
		/* 버튼 누르면 -1 */
		minus.addActionListener(new ActionListener() {	//btnstt을 눌렀을 때 효과추가
			public void actionPerformed(ActionEvent e) {
				if (per > 2) {
					per--;
				}
	    		perTF.setText(""+per);
			}
		});
		Ifmpage.add(plus);
		Ifmpage.add(minus);
	}

	public void PlMi10Button() {
		plus10.setLayout(null);//레이아웃
		plus10.setBounds(420, 345, 45, 45);//위치,크기
		plus10.setIcon(pBt);
		plus10.setRolloverIcon(pBt2); // 마우스가 버튼에 올라갈 때 이미지 변하게
		plus10.setBorderPainted(false); // 버튼 테투리 해제
		
		minus10.setLayout(null);//레이아웃
		minus10.setBounds(480, 345, 45, 45);//위치,크기
		minus10.setIcon(mBt);
		minus10.setRolloverIcon(mBt2); // 마우스가 버튼에 올라갈 때 이미지 변하게
		minus10.setBorderPainted(false); // 버튼 테투리 해제
		
		/* 버튼 누르면 *10 */
		plus10.addActionListener(new ActionListener() {	//btnstt을 눌렀을 때 효과추가
			public void actionPerformed(ActionEvent e) {
				//String buttonName = e.getActionCommand();
				if(amo > 0) { //금액을 입력하기 전에는 작동 x
					if ((amo/10)%uni==0) {
		    			uni *= 10; // 20030원을 100원 단위로 못나누게
		    		}
				}
				uniTF.setText(""+uni);
			}
		});
		
		/* 버튼 누르면 *-10 */
		minus10.addActionListener(new ActionListener() {	//btnstt을 눌렀을 때 효과추가
			public void actionPerformed(ActionEvent e) {
				uni = Integer.valueOf(uniTF.getText());
				if(amo > 0) { //금액을 입력하기 전에는 작동 x
					if (uni > 10) {
						uni /= 10;
					}
				}
	    		uniTF.setText(""+uni);
			}
		});
		Ifmpage.add(plus10);
		Ifmpage.add(minus10);
	}
	
	//더치페이 계산 메서드 (값이 제대로 들어오게 하기 위해서 매개변수로 다시 받음)
	public void Cal_result(int a, int p, int u) { // a = 76000, p = 7, u = 100
		double divide; // 총금액 / 인원 수
		int diUni, rem; // divide / 단위 수, 버려지는 값
		int[] remUni; // 버려지는 값을 저장하는 배열
		resDch = new int[p]; // 더치페이한 총 금액 들어가는 배열★★★★★		
		
		divide = (double)(a / p); // 총금액/인원 : 10857.14285...
	    diUni = ((int)divide / u) * u; // 버림 : 10857 / 100 = 10800  <= u의자리까지 없애는 거!!
		
	    if (diUni*p==a) {  // diuni값이 다 똑같을 때
	    	for (int i = 0; i < p; i++) {
	    		resDch[i] = diUni;
	    	}
	    	
	    } else {  //diuni값이 모자랄 때 : 10800*7 = 75600
	    	rem = a - (diUni*p);  // 76000 - 75600 = 400
	    	remUni = new int[rem/u]; // 400 / 100 = 4 -> remUni배열의 길이 4
	    	
	    	for (int i = 0; i < rem/u; i++) { // 4까지 반복
	    		remUni[i] = rem/(rem/u); // 400 / 4 = 100
	    		resDch[i] = diUni + remUni[i]; // resDch[0]~[3] = 10900 
	    	}
	    	
	    	for (int i = rem/u; i < p; i++) {  // 나머지 뒤에 값들 diuni로 지정하는 for문
	    		resDch[i] = diUni; // resDch[4]~[6] = 10800 
	    	} 
	    }
	} // resDch의 최종적인 값 = 10900 10900 10900 10900 10800 10800 10800 = 10900*4 + 10800*3 = 43600 + 32400 = 76000
}