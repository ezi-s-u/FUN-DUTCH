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
	ImageIcon sttBt = new ImageIcon(Main.class.getResource("../Button_Image/btnstt.png")); // sttbtn �ܺο��� ��������												// ���ϵ��� private�� ����
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

	/* FunAndDutch ������ */
	FunAndDutch() {
		
		setTitle("FUN_&_DUTCH"); //������ ����
		setSize(720,600); //������ ũ�� ����
		setResizable(false); //������ ũ������ ���ϰ�
		setLocationRelativeTo(null); //������ �����
		setVisible(true); //ȭ�鿡 ��Ÿ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ �ݾ��� �� �޸𸮿��� ���ŵǰ�
		
		setPanel();

		startpage();

		infomationpage();
	}
	
	JFrame rp = new JFrame();
	
	/* ��ư�� ���� */
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

	/* sttpage �г� ���� */
	JPanel Sttpage=new JPanel(){ Image background = new ImageIcon(Main.class.getResource("../image/start.png")).getImage();
		public void paintComponent(Graphics g){
			g.drawImage(background,0,0,null); // background�� �׷���
			setOpaque(false); //�̰� �ؾ� ������ �����
	}};

	/* Ifmpage �г� ���� */
	JPanel Ifmpage=new JPanel(){ Image background = new ImageIcon(Main.class.getResource("../image/infm.png")).getImage();
		public void paintComponent(Graphics g){																																					// �Լ�
			g.drawImage(background,0,0,null); // background�� �׷���
			setOpaque(false);
	}};

	/* namepage �г� ���� */
	JPanel Namepage=new JPanel(){ Image background=new ImageIcon(Main.class.getResource("../image/name.png")).getImage();
		public void paintComponent(Graphics g){																																					// �Լ�
			g.drawImage(background,0,0,null); // background�� �׷���
			setOpaque(false);
	}};
	
	JPanel Ladderpage=new JPanel(){ Image background=new ImageIcon(Main.class.getResource("../image/ladder.png")).getImage();
		public void paintComponent(Graphics g){
			g.drawImage(background,0,0,null); // background�� �׷���
			setOpaque(false);
	}};
	
	JPanel Respage=new JPanel(){ Image background=new ImageIcon(Main.class.getResource("../image/respage.png")).getImage();
		public void paintComponent(Graphics g){
			g.drawImage(background,0,0,null); // background�� �׷���
			setOpaque(false);
	}};

	JTextField amoTF = new JTextField(); // amount(�ѱݾ�) �Է¹޴� �ؽ�Ʈ�ʵ�
	JTextField perTF = new JTextField(); // personnel(�ο�) �Է¹޴� �ؽ�Ʈ�ʵ�
	JTextField uniTF = new JTextField(); // unit(������) �Է¹޴� �ؽ�Ʈ�ʵ�

	JTextField[] n = new JTextField[10]; // Ifmpage���� �̸� �Է¹޴� �ؽ�Ʈ�ʵ�
	JTextField[] resn = new JTextField[10]; // Respage�� �̸� ����ϴ� �ؽ�Ʈ�ʵ�
	
	JTextField[] a = new JTextField[10]; // Ifmpage���� ��ġ������ �ݾ� ����ϴ� �ؽ�Ʈ�ʵ�
	JTextField[] resa = new JTextField[10]; // Respage���� ��ġ������ �ݾ� ����ϴ� �ؽ�Ʈ�ʵ�
    
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
	
	JLabel amoOk = new JLabel(); //ifmbtn�� ������ �� ������ "�ݾ��� �ԷµǾ����ϴ�." ��
	JLabel amoNot = new JLabel(); //ifmbtn�� ������ �ʾ��� �� ������ "���� �ݾ��� �Էµ����ʾҽ��ϴ�.(�� �Է¹�ư ������)" ��
	
	JLabel LP2_1 = new JLabel(); // ��ٸ� �׸� ��
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
	
	JLabel resTitle = new JLabel(rt); //respage���� "��ٸ� Ÿ�� ���" ��
	
	JLabel[] eq = new JLabel[10]; //respage���� ȭ��ǥ ��
	
	/* ��꿡 �ʿ��� ���� ���� */
	static int amo; // �� �ݾ�
	static int per = 2; // �ο� ��
	static int uni = 10; // ������

	static int[] resDch; // ���������� ��ġ������ �ݾ� ���� �迭
	static int[] Rand; // ��ġ������ �ݾ��� �������� ������� ������ ���� �迭 
	static int[] resA = new int[10]; //���� �ε����� ���� resDch�����ϴ� �迭

	String[] name = new String[10]; // n�ؽ�Ʈ�ʵ忡�� ���� �̸� �� �����ϴ� �迭 (resn�� �ֱ�����)
	
	static int LdRand; // ��ٸ� �׸� 2���� �� �ϳ� �������� �������� 0~1���� ���� ��
	
	/* ���� ������ ���� �޼��� */
	public void startpage() {
		/* ���۹�ư ���� */
		sttbtn.setVisible(true);
		sttbtn.setLayout(null);// ���̾ƿ�
		sttbtn.setBounds(240, 400, 236, 67);// ��ġ,ũ��
		sttbtn.setIcon(sttBt);
		sttbtn.setRolloverIcon(sttBt2); // ���콺�� ��ư�� �ö� �� �̹��� ���ϰ�
		sttbtn.setBorderPainted(false); // ��ư ������ ����

		/* ��ư ������ ���� �г����� �̵��ϰ� */
		sttbtn.addActionListener(new ActionListener() { // sttbtn�� ������ �� ȿ���߰�
			public void actionPerformed(ActionEvent e) {
				Sttpage.setVisible(false);// â�� �� ���̰�
				Ifmpage.setVisible(true);// â�� ���̰�
			}
		});
		
		Sttpage.add(sttbtn); // sttpage �гο� ���� ��ư �߰�
		add(Sttpage);
	}

	/* ���� �Է� ������ ���� �޼��� */
	public void infomationpage() {
		/* �ѱݾ�, �ο� ��, ������ �Է¹޴� �ؽ�Ʈ�ʵ� ����*/
		amoTF.setFont(new Font("���� ���", Font.BOLD, 20));
		amoTF.setBounds(208, 145, 200, 45);
		amoTF.setVisible(true);
		amoTF.setBackground(Color.white);

		perTF.setFont(new Font("���� ���", Font.BOLD, 20));
		perTF.setBounds(208, 245, 200, 45);
		perTF.setVisible(true);
		perTF.setBackground(Color.white);
		perTF.setEditable(false);
		perTF.setText("" + per);

		uniTF.setFont(new Font("���� ���", Font.BOLD, 20));
		uniTF.setBounds(208, 345, 200, 45);
		uniTF.setVisible(true);
		uniTF.setBackground(Color.white);
		uniTF.setEditable(false);
		uniTF.setText("" + uni);

		/* ifmbtn�� ���ȴ��� Ȯ���ϴ� �� ���� */
		amoNot.setFont(new Font("���� ���", Font.BOLD, 11));
		amoNot.setBounds(208, 187, 600, 28);
		amoNot.setVisible(true);
		amoNot.setText("���� �ݾ��� �Էµ����ʾҽ��ϴ�.(�� �Է¹�ư ������)");
		
		amoOk.setFont(new Font("���� ���", Font.BOLD, 11));
		amoOk.setBounds(208, 187, 200, 25);
		amoOk.setVisible(false);
		amoOk.setText("�ݾ��� �ԷµǾ����ϴ�.");
		
	    ifmbtn.setLayout(null);//���̾ƿ�
		ifmbtn.setBounds(420, 145,144, 45);//��ġ,ũ��
		ifmbtn.setIcon(imBt);
		ifmbtn.setRolloverIcon(imBt2); // ���콺�� ��ư�� �ö� �� �̹��� ���ϰ�
		ifmbtn.setBorderPainted(false); // ��ư ������ ����
		ifmbtn.setVisible(true);

		ifmbtn.addActionListener(new ActionListener() {	//btnstt�� ������ �� ȿ���߰�
			public void actionPerformed(ActionEvent e) {
				amo = Integer.parseInt(amoTF.getText());
				amoNot.setVisible(false);
				amoOk.setVisible(true);
			}
		});

		PlMiButton();
		PlMi10Button(); // ���� ���� 10�� �ö󰡵��� ��
		
		/* �Է� �Ϸ� ��ư ���� */
		IfmButtonfinish.setVisible(true);
		IfmButtonfinish.setLayout(null);// ���̾ƿ�
		IfmButtonfinish.setBounds(240, 440, 210, 67);// ��ġ,ũ��
		IfmButtonfinish.setIcon(imfiniBt);
		IfmButtonfinish.setRolloverIcon(imfiniBt2); // ���콺�� ��ư�� �ö� �� �̹��� ���ϰ�
		IfmButtonfinish.setBorderPainted(false); // ��ư ������ ����

		/* ��ư ������ ���� �г����� �̵��ϰ� */
		IfmButtonfinish.addActionListener(new ActionListener() { // sttbtn�� ������ �� ȿ���߰�
			public void actionPerformed(ActionEvent e) {
				Ifmpage.setVisible(false);// â�� �� ���̰�
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
		
		/* �ؽ�Ʈ �ʵ� �гο� �ֱ� */
		Ifmpage.add(amoTF);
		Ifmpage.add(perTF);
		Ifmpage.add(uniTF);
		
		Ifmpage.add(amoNot);
		Ifmpage.add(amoOk);
		
		Ifmpage.add(ifmbtn);
		/* ifmbtn ��ư �гο� �ֱ� */
		Ifmpage.add(IfmButtonfinish);
		
		/* �����ӿ� �г� �ֱ� */
		add(Ifmpage);

	}
	
	/* Rand�� LdRand�� �������� �ִ� �޼���*/
	public void getRand(int p) {
		Rand = new int[p];
		
		for(int i = 0; i < p; i++) { // per = 3
			Rand[i]=(int)(Math.random()*p);  // 0 1 2
			for(int j = 0; j < i; j++) { // �ߺ�����
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
	
	/* �̸� �Է� �ؽ�Ʈ�ʵ�, �ݾ� ��� �ؽ�Ʈ�ʵ� ���� */
	public void set_Nametf_Amotf(int p) {
		for(int i = 0; i < p; i++) {
			n[i] = new JTextField(10);
			
			n[i].setFont(new Font("���� ���", Font.BOLD, 13));
			n[i].setVisible(true);
			n[i].setBackground(Color.white);
			
			a[i] = new JTextField(10);
			
			a[i].setFont(new Font("���� ���", Font.BOLD, 13));
			a[i].setVisible(true);
			a[i].setBackground(Color.white);
			a[i].setEditable(false);
		}

	}

	/* �г� �⺻ ���� �޼��� */
	public void setPanel () {
		Sttpage.setLayout(null);
		Sttpage.setBounds(0, 0, 720, 600);
		Sttpage.setVisible(true);
		
		Ifmpage.setLayout(null);
		Ifmpage.setBounds(0, 0, 720, 600);
		Ifmpage.setVisible(false); // �����ڿ��� ȣ���� �߱⶧���� ó������ �� ���̵���
		
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
	
	/* namepage, ladderpage �������� ���� ��ҵ� ���� �޼��� */
	public void set_N_L_page() {
		//Namepage
		set_Nametf_Amotf(per);  // �̸� �Է� �ؽ�Ʈ�ʵ�, �ݾ� ��� �ؽ�Ʈ�ʵ� ����
		getRand(per); // ���� ���� �޴�
		setRespage(per);
				
		for(int i = 0; i < per; i++) {
			n[i].setHorizontalAlignment(JTextField.CENTER);
			a[i].setHorizontalAlignment(JTextField.CENTER);
			Namepage.add(n[i]);
		}
				
		Namepage.add(Namefinish);
				
		Namefinish.setVisible(true);
		Namefinish.setLayout(null);// ���̾ƿ�
		Namefinish.setBounds(240, 300, 210, 67);// ��ġ,ũ��
		Namefinish.setBorderPainted(false); // ��ư ������ ����
		Namefinish.setIcon(imfiniBt);
		Namefinish.setRolloverIcon(imfiniBt2); // ���콺�� ��ư�� �ö� �� �̹��� ���ϰ�

			/* ��ư ������ ���� �г����� �̵��ϰ� */
		Namefinish.addActionListener(new ActionListener() { // sttbtn�� ������ �� ȿ���߰�
			public void actionPerformed(ActionEvent e) {
				Namepage.setVisible(false);// â�� �� ���̰�
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
			quesbtn[i].setLayout(null);// ���̾ƿ�
			quesbtn[i].setBorderPainted(false); // ��ư ������ ����
			quesbtn[i].setIcon(queBt);
			quesbtn[i].setRolloverIcon(queBt2); // ���콺�� ��ư�� �ö� �� �̹��� ���ϰ�
			Ladderpage.add(quesbtn[i]);
		}

		/* quesbtn��ư ������ �� ��ư�� �������鼭 ��ġ������ �ݾ��� ���̵��� */
		for(int i = 0; i < per; i++) {
			final int t = i;
			quesbtn[t].addActionListener(new ActionListener() { // sttbtn�� ������ �� ȿ���߰�
				public void actionPerformed(ActionEvent e) {
					quesbtn[t].setVisible(false);
					Ladderpage.add(a[t]);
							
					a[t].setText(""+resA[t]);
				}
			});
		}
				
		resultbtn.setVisible(true);
		resultbtn.setLayout(null);// ���̾ƿ�
		resultbtn.setBounds(270, 50, 170, 50);
		resultbtn.setIcon(resBt);
		resultbtn.setRolloverIcon(resBt2); // ���콺�� ��ư�� �ö� �� �̹��� ���ϰ�
		resultbtn.setBorderPainted(false); // ��ư ������ ����

		/* resultbtn��ư ������ ��ٸ� Ÿ�� ��� �������� �������� */
		resultbtn.addActionListener(new ActionListener() { // sttbtn�� ������ �� ȿ���߰�
			public void actionPerformed(ActionEvent e) {
				rp.setTitle("Result"); //������ ����
				if (per < 4) {
					rp.setSize(400,125+(per*70)); // rp������ ũ�⸦ ����������
				} else if(per < 6) {
					rp.setSize(400,125+(per*60));
				} else if (per < 9) {
					rp.setSize(400,125+(per*50)); 
				} else {
					rp.setSize(400,125+(per*47)); 
				}
				rp.setResizable(false); //������ ũ������ ���ϰ�
				rp.setLocationRelativeTo(null); //������ �����
				rp.setVisible(true); //ȭ�鿡 ��Ÿ����
				//rp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				rp.add(Respage);
			}
		});	
		Ladderpage.add(resultbtn);
		add(Ladderpage);
	}
	
	// 2����� �����̱� ������ 9�� �ʿ���
	public void name_ladder_page2() {
		
		set_N_L_page(); // �⺻ ����
		
		// �̸� �Է¹޴� �ؽ�Ʈ �ʵ� ��ġ, ũ�� ����
		n[0].setBounds(208, 150, 100, 30); // 1���̸�
		n[1].setBounds(400, 150, 100, 30); // 2���̸�
		
		// ��ġ������ �ݾ� ����ϴ� �ؽ�Ʈ �ʵ� ��ġ, ũ�� ����
		a[0].setBounds(208, 500, 100, 30); // 1���̸�
		a[1].setBounds(400, 500, 100, 30); // 2���̸�
		
		// ����ǥ ��ư ��ġ, ũ�� ����
		quesbtn[0].setBounds(208, 500, 100, 30);
		quesbtn[1].setBounds(400, 500, 100, 30);
		
		LP2_1.setVisible(true);
		LP2_1.setLayout(null);// ���̾ƿ�
		LP2_1.setBounds(0, 180, 720, 320);// ��ġ,ũ��
		LP2_1.setEnabled(false);
		LP2_1.setIcon(ld2_1);
		
		LP2_2.setVisible(true);
		LP2_2.setLayout(null);// ���̾ƿ�
		LP2_2.setBounds(0, 180, 720, 320);// ��ġ,ũ��
		LP2_2.setEnabled(false);
		LP2_2.setIcon(ld2_2);

		//�������� add ����
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
		LP3_1.setLayout(null);// ���̾ƿ�
		LP3_1.setBounds(0, 180, 720, 320);// ��ġ,ũ��
		LP3_1.setEnabled(false);
		LP3_1.setIcon(ld3_1);
		
		LP3_2.setVisible(true);
		LP3_2.setLayout(null);// ���̾ƿ�
		LP3_2.setBounds(0, 180, 720, 320);// ��ġ,ũ��
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
		LP4_1.setLayout(null);// ���̾ƿ�
		LP4_1.setBounds(0, 180, 720, 320);// ��ġ,ũ��
		LP4_1.setEnabled(false);
		LP4_1.setIcon(ld4_1);
		
		LP4_2.setVisible(true);
		LP4_2.setLayout(null);// ���̾ƿ�
		LP4_2.setBounds(0, 180, 720, 320);// ��ġ,ũ��
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
		LP5_1.setLayout(null);// ���̾ƿ�
		LP5_1.setBounds(0, 180, 720, 320);// ��ġ,ũ��
		LP5_1.setEnabled(false);
		LP5_1.setIcon(ld5_1);
		
		LP5_2.setVisible(true);
		LP5_2.setLayout(null);// ���̾ƿ�
		LP5_2.setBounds(0, 180, 720, 320);// ��ġ,ũ��
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
		LP6_1.setLayout(null);// ���̾ƿ�
		LP6_1.setBounds(0, 175, 720, 320);// ��ġ,ũ��
		LP6_1.setEnabled(false);
		LP6_1.setIcon(ld6_1);
		
		LP6_2.setVisible(true);
		LP6_2.setLayout(null);// ���̾ƿ�
		LP6_2.setBounds(0, 175, 720, 320);// ��ġ,ũ��
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
		LP7_1.setLayout(null);// ���̾ƿ�
		LP7_1.setBounds(0, 175, 720, 325);// ��ġ,ũ��
		LP7_1.setEnabled(false);
		LP7_1.setIcon(ld7_1);
		
		LP7_2.setVisible(true);
		LP7_2.setLayout(null);// ���̾ƿ�
		LP7_2.setBounds(0, 175, 720, 325);// ��ġ,ũ��
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
		LP8_1.setLayout(null);// ���̾ƿ�
		LP8_1.setBounds(0, 175, 720, 325);// ��ġ,ũ��
		LP8_1.setEnabled(false);
		LP8_1.setIcon(ld8_1);
		
		LP8_2.setVisible(true);
		LP8_2.setLayout(null);// ���̾ƿ�
		LP8_2.setBounds(0, 175, 720, 325);// ��ġ,ũ��
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
		LP9_1.setLayout(null);// ���̾ƿ�
		LP9_1.setBounds(0, 175, 720, 325);// ��ġ,ũ��
		LP9_1.setEnabled(false);
		LP9_1.setIcon(ld9_1);
		
		LP9_2.setVisible(true);
		LP9_2.setLayout(null);// ���̾ƿ�
		LP9_2.setBounds(0, 175, 720, 325);// ��ġ,ũ��
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
		LP10_1.setLayout(null);// ���̾ƿ�
		LP10_1.setBounds(0, 175, 720, 325);// ��ġ,ũ��
		LP10_1.setEnabled(false);
		LP10_1.setIcon(ld10_1);
		
		LP10_2.setVisible(true);
		LP10_2.setLayout(null);// ���̾ƿ�
		LP10_2.setBounds(0, 175, 720, 325);// ��ġ,ũ��
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
			resn[i].setFont(new Font("���� ���", Font.BOLD, 13));
			resn[i].setHorizontalAlignment(JTextField.CENTER);
			
			resa[i].setFont(new Font("���� ���", Font.BOLD, 13));
			resa[i].setBounds(217, 80+i*39, 82, 25);
			resa[i].setEditable(false);
			resa[i].setBackground(Color.white);
			resa[i].setHorizontalAlignment(JTextField.CENTER);
			
			respageFinish.setBounds(142,(80+i*39)+52, 110, 42);
			respageFinish.setVisible(true);
			respageFinish.setBorderPainted(false);
			respageFinish.setLayout(null);// ���̾ƿ�
			respageFinish.setBorderPainted(false); // ��ư ������ ����
			respageFinish.setIcon(okBt);
			respageFinish.setRolloverIcon(okBt2); // ���콺�� ��ư�� �ö� �� �̹��� ���ϰ�
			
			respageFinish.addActionListener(new ActionListener() { // sttbtn�� ������ �� ȿ���߰�
				public void actionPerformed(ActionEvent e) {
					rp.setVisible(false); //ȭ�鿡�� �������
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
		
		plus.setLayout(null);//���̾ƿ�
		plus.setBounds(420, 245, 45, 45);//��ġ,ũ��
		plus.setIcon(pBt);
		plus.setRolloverIcon(pBt2); // ���콺�� ��ư�� �ö� �� �̹��� ���ϰ�
		plus.setBorderPainted(false); // ��ư ������ ����
		
		minus.setLayout(null);//���̾ƿ�
		minus.setBounds(480, 245, 45, 45);//��ġ,ũ��
		minus.setIcon(mBt);
		minus.setRolloverIcon(mBt2); // ���콺�� ��ư�� �ö� �� �̹��� ���ϰ�
		minus.setBorderPainted(false); // ��ư ������ ����
		
		/* ��ư ������ +1 */
		plus.addActionListener(new ActionListener() {	//btnstt�� ������ �� ȿ���߰�
			public void actionPerformed(ActionEvent e) {
				per = Integer.parseInt(perTF.getText());
				if (per < 10) {
	    			per++;
				}
				perTF.setText(""+per);
			}
		});
		
		/* ��ư ������ -1 */
		minus.addActionListener(new ActionListener() {	//btnstt�� ������ �� ȿ���߰�
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
		plus10.setLayout(null);//���̾ƿ�
		plus10.setBounds(420, 345, 45, 45);//��ġ,ũ��
		plus10.setIcon(pBt);
		plus10.setRolloverIcon(pBt2); // ���콺�� ��ư�� �ö� �� �̹��� ���ϰ�
		plus10.setBorderPainted(false); // ��ư ������ ����
		
		minus10.setLayout(null);//���̾ƿ�
		minus10.setBounds(480, 345, 45, 45);//��ġ,ũ��
		minus10.setIcon(mBt);
		minus10.setRolloverIcon(mBt2); // ���콺�� ��ư�� �ö� �� �̹��� ���ϰ�
		minus10.setBorderPainted(false); // ��ư ������ ����
		
		/* ��ư ������ *10 */
		plus10.addActionListener(new ActionListener() {	//btnstt�� ������ �� ȿ���߰�
			public void actionPerformed(ActionEvent e) {
				//String buttonName = e.getActionCommand();
				if(amo > 0) { //�ݾ��� �Է��ϱ� ������ �۵� x
					if ((amo/10)%uni==0) {
		    			uni *= 10; // 20030���� 100�� ������ ��������
		    		}
				}
				uniTF.setText(""+uni);
			}
		});
		
		/* ��ư ������ *-10 */
		minus10.addActionListener(new ActionListener() {	//btnstt�� ������ �� ȿ���߰�
			public void actionPerformed(ActionEvent e) {
				uni = Integer.valueOf(uniTF.getText());
				if(amo > 0) { //�ݾ��� �Է��ϱ� ������ �۵� x
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
	
	//��ġ���� ��� �޼��� (���� ����� ������ �ϱ� ���ؼ� �Ű������� �ٽ� ����)
	public void Cal_result(int a, int p, int u) { // a = 76000, p = 7, u = 100
		double divide; // �ѱݾ� / �ο� ��
		int diUni, rem; // divide / ���� ��, �������� ��
		int[] remUni; // �������� ���� �����ϴ� �迭
		resDch = new int[p]; // ��ġ������ �� �ݾ� ���� �迭�ڡڡڡڡ�		
		
		divide = (double)(a / p); // �ѱݾ�/�ο� : 10857.14285...
	    diUni = ((int)divide / u) * u; // ���� : 10857 / 100 = 10800  <= u���ڸ����� ���ִ� ��!!
		
	    if (diUni*p==a) {  // diuni���� �� �Ȱ��� ��
	    	for (int i = 0; i < p; i++) {
	    		resDch[i] = diUni;
	    	}
	    	
	    } else {  //diuni���� ���ڶ� �� : 10800*7 = 75600
	    	rem = a - (diUni*p);  // 76000 - 75600 = 400
	    	remUni = new int[rem/u]; // 400 / 100 = 4 -> remUni�迭�� ���� 4
	    	
	    	for (int i = 0; i < rem/u; i++) { // 4���� �ݺ�
	    		remUni[i] = rem/(rem/u); // 400 / 4 = 100
	    		resDch[i] = diUni + remUni[i]; // resDch[0]~[3] = 10900 
	    	}
	    	
	    	for (int i = rem/u; i < p; i++) {  // ������ �ڿ� ���� diuni�� �����ϴ� for��
	    		resDch[i] = diUni; // resDch[4]~[6] = 10800 
	    	} 
	    }
	} // resDch�� �������� �� = 10900 10900 10900 10900 10800 10800 10800 = 10900*4 + 10800*3 = 43600 + 32400 = 76000
}