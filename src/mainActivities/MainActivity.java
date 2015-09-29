package mainActivities;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import myLib.selecMonster;
import myMonsters.Monster;

public class MainActivity extends JFrame implements ActionListener{

	static Monster plyMon,npcMon;
	static JFrame frm=new JFrame("Monster Game");
	static JLabel Player=new JLabel("Player's Status:",JLabel.CENTER),NPC=new JLabel("NPC's Status:",JLabel.CENTER);
	static JLabel status_lb,plyMonName,npcMonName;
	static JTextArea textArea=new JTextArea();
	JButton select_bt=new JButton(),end_bt=new JButton("離開"),reset_bt=new JButton("Reset");
	JButton ATT_btn=new JButton("攻擊"),MAG_btn=new JButton("治療");
	static JTextArea plyMonStatus,npcMonStatus,plyMonAblt,npcMonAblt;

	int plyMonATT,plyMonDEF,plyMonHP,plyMonMP;
	int npcMonATT,npcMonDEF,npcMonHP,npcMonMP;
	int round=1;
	
	Thread thread=new Thread();
	
	public static void main(String[] args) {
		MainActivity mainActivity=new MainActivity();
		mainActivity.pack();
		mainActivity.setVisible(true);
	    JFrame.setDefaultLookAndFeelDecorated(true);
	    JDialog.setDefaultLookAndFeelDecorated(true);
	    
	}

	public static void upGameStatus(String message) {
		status_lb.setText(message);
	}
	public static void addmessage(String message){
		textArea.append("\n"+message);
		textArea.setCaretPosition(textArea.getDocument().getLength()); 
	}
	public static void upMonsterStatus(){
		plyMonStatus.append(plyMon.getAblt());
	}
	
	public MainActivity(){
		setLayout(null);
		setPreferredSize(new Dimension(500, 550));  
		setDefaultCloseOperation(0);
//player 區域	
		Player.setSize(100,25);
		Player.setLocation(40, 370);
		Player.setFont(new Font("Arial", Font.HANGING_BASELINE,12));
		add(Player);
		plyMonName=new JLabel();
		plyMonName.setBounds(60,397,200,20);
		add(plyMonName);
		plyMonStatus=new JTextArea("wait...");
		plyMonStatus.setBounds(160,420,100,50);
		plyMonStatus.setEditable(false);
		plyMonStatus.setBackground(null);
		add(plyMonStatus);
		plyMonAblt=new JTextArea();
		plyMonAblt.setBounds(80,420,75,50);
		plyMonAblt.setEditable(false);
		plyMonAblt.setBackground(null);
		add(plyMonAblt);
//NPC 區域
		NPC.setSize(100,25);
		NPC.setLocation(40,20);
		NPC.setFont(new Font("Arial", Font.HANGING_BASELINE, 12));
		add(NPC);
		npcMonName=new JLabel();
		npcMonName.setBounds(60,48,200,20);
		add(npcMonName);
		npcMonStatus=new JTextArea("wait...");
		npcMonStatus.setBounds(160,77,100,50);
		npcMonStatus.setEditable(false);
		npcMonStatus.setBackground(null);
		add(npcMonStatus);
		npcMonAblt=new JTextArea();
		npcMonAblt.setBounds(80,77,75,50);
		npcMonAblt.setEditable(false);
		npcMonAblt.setBackground(null);
		add(npcMonAblt);
//行動按鈕區
		ATT_btn.setBounds(165, 350, 70, 25);
		MAG_btn.setBounds(275, 350, 70, 25);
		ATT_btn.setEnabled(false);
		MAG_btn.setEnabled(false);
		add(ATT_btn);
		add(MAG_btn);
		ATT_btn.addActionListener(this);
		MAG_btn.addActionListener(this);
		select_bt=new JButton("抽選召喚獸");
		select_bt.setBounds(280, 70, 100, 35);
		add(select_bt);
		select_bt.addActionListener(this);
		end_bt.setBounds(380,450,80,30);
		end_bt.addActionListener(this);
		end_bt.setBackground(Color.PINK);
		add(end_bt);
		reset_bt.setBounds(290,450,80,30);
		reset_bt.addActionListener(this);
		reset_bt.setBackground(Color.YELLOW);
		add(reset_bt);
//GameScreen 區域
		status_lb=new JLabel("--> welcome...");
		status_lb.setFont(new Font("Arial", Font.CENTER_BASELINE, 14));
		status_lb.setBounds(120,140,300,20);
		status_lb.setOpaque(true);
		add(status_lb);
		
		textArea=new JTextArea("Please click button to get a monster...");
		textArea.setOpaque(true);
		
		JScrollPane scrollPane=new JScrollPane(textArea);
		scrollPane.setBounds(101,165,300,180);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		add(scrollPane);
//結束視窗設定
		addWindowListener(new WindowAdapter() {
		      public void windowClosing(WindowEvent e) {
		        int result=JOptionPane.showConfirmDialog(frm,
		                   "確定要結束程式嗎?",
		                   "確認訊息",
		                   JOptionPane.YES_NO_OPTION,
		                   JOptionPane.WARNING_MESSAGE);
		        if (result==JOptionPane.YES_OPTION) {System.exit(0);}
		        }    
		      });
	}

	
// 按鈕事件
	@Override
	public void actionPerformed(ActionEvent e) {
	//選卡
		if(e.getSource()==select_bt){
			selectGo();
		}
	//攻擊
		else if(e.getSource()==ATT_btn){
			ATT_btn.setEnabled(false);
			MAG_btn.setEnabled(false);
			attGo(plyMon);
		}
	//恢復
		else if(e.getSource()==MAG_btn){
			ATT_btn.setEnabled(false);
			MAG_btn.setEnabled(false);
			recoverGo();
		}
	//中斷
		else if(e.getSource()==end_bt){
			int result=JOptionPane.showConfirmDialog(frm,
	                   "確定離開?",
	                   "確認訊息",
	                   JOptionPane.YES_NO_OPTION,
	                   JOptionPane.WARNING_MESSAGE);
	        if (result==JOptionPane.YES_OPTION) {System.exit(0);}
	        }    
	//重設
		else if(e.getSource()==reset_bt){
			select_bt.setEnabled(true);
			ATT_btn.setEnabled(false);
			MAG_btn.setEnabled(false);
			textArea.setText("Please click button to get a monster...");
		}		
	}
	
	private synchronized void attGo(Monster who){
		thread=new Thread(new Runnable() {
			public void run() {
				int Damage;
				int random;
				addmessage("玩家 驅使"+plyMonName.getText()+" 進行 攻擊--");
				random=(int)(Math.random()*4+2);
				Damage=who.getMagDamage(random)+npcMonDEF-plyMonATT+1;
				sleep500();
				addmessage("使出 Lv"+random+" 攻擊\n"+who.getMagName(random)+" ! ");
				sleep500();
				addmessage("造成 "+Damage+"點 傷害\n");
				sleep500();
				upNpcHPMP(Damage, 0);
				sleep500();	
				npcGo();
			}
		});
		thread.start();
	}
	
	private void recoverGo(){
		thread=new Thread(new Runnable() {
			public void run() {
				double random;
				random= ((Math.random()*299+1));
				addmessage(plyMonName.getText()+" 進行 治療--");
				sleep500();
				addmessage("恢復 "+((int)random+2000)+"點 HP\n消耗 100 MP\n");
				sleep500();
				upPlyHPMP((int)random+500, -100);
				npcGo();
			}
		});
		thread.start();
		
	}
	
	private void npcGo(){
		int Damage;
		int random;
		addmessage("NPC 驅使"+npcMonName.getText()+" 進行 攻擊--");
		random=(int)(Math.random()*3+2);
		Damage=npcMon.getMagDamage(random)+plyMonDEF-npcMonATT+1;
		sleep500();
		addmessage("使出 Lv"+random+" 攻擊\n"+npcMon.getMagName(random)+" ! ");
		sleep500();
		addmessage("造成 "+Damage+"點 傷害\n");
		sleep500();
		upPlyHPMP(Damage, 0);
		ATT_btn.setEnabled(true);
		if(plyMonMP>0)
			MAG_btn.setEnabled(true);
	}
	
	
	
	private void upPlyHPMP(int hp,int mp){
		plyMonHP+=hp;
		plyMonMP+=mp;
		plyMonStatus.setText("HP = "+plyMonHP+"\nMP = "+plyMonMP);

		if(plyMonMP<=0)
			MAG_btn.setEnabled(false);
		if(plyMonHP<=0)
			gameSet(1);
	}
	private void upNpcHPMP(int hp,int mp){
		npcMonHP+=hp;
		npcMonMP+=mp;
		npcMonStatus.setText("HP = "+npcMonHP+"\nMP = "+npcMonMP);
		
		if(npcMonHP<=0)
			gameSet(2);
	}
	
	private void gameSet(int result){
		switch(result){
		case 1:
			int game=JOptionPane.showConfirmDialog(MainActivity.this,
	                "You Lose~\n再度挑戰?",
	                "Game Result",
	                JOptionPane.YES_NO_OPTION,
	                JOptionPane.QUESTION_MESSAGE,new ImageIcon("sl.png"));
			if(game==JOptionPane.YES_OPTION){
				select_bt.setEnabled(true);
				ATT_btn.setEnabled(false);
				MAG_btn.setEnabled(false);
				textArea.setText("Please click button to get a monster...");
			}
			break;
		case 2:
			int game2=JOptionPane.showConfirmDialog(MainActivity.this,
	                "You Win!!!!!\nAgain?",
	                "Game Result",
	                JOptionPane.YES_NO_OPTION,
	                JOptionPane.QUESTION_MESSAGE,new ImageIcon("sl.png"));
			if(game2==JOptionPane.YES_OPTION){
				select_bt.setEnabled(true);
				ATT_btn.setEnabled(false);
				MAG_btn.setEnabled(false);
				textArea.setText("Please click button to get a monster...");
			}
			break;
			
		}
		thread.stop();
	}
	
	private void selectGo(){
		thread=new Thread(new Runnable() {
			public void run() {
				select_bt.setEnabled(false);
				
				int random;
				random=(int)(Math.random()*8+1);
				plyMon=selecMonster.selMonster(random);
				addmessage("Congrats! Your monster is:\n"+plyMon.getName());
				sleep500();
				plyMonName.setText(plyMon.getName());
				plyMonAblt.setText(plyMon.getAblt());
				plyMonStatus.setText(plyMon.getHPMP());
				plyMonATT=plyMon.getAtt();
				plyMonDEF=plyMon.getDEF();
				plyMonHP=plyMon.getHP();
				plyMonMP=plyMon.getMP();
				sleep500();
				
				addmessage("NPC 抽選...");
				sleep1sec();
				random=(int)(Math.random()*8+1);
				npcMon=selecMonster.selMonster(random);
				addmessage("NPC's monster is:\n"+npcMon.getName());
				sleep500();
				npcMonName.setText(npcMon.getName());
				npcMonAblt.setText(npcMon.getAblt());
				npcMonStatus.setText(npcMon.getHPMP());
				npcMonATT=npcMon.getAtt();
				npcMonDEF=npcMon.getDEF();
				npcMonHP=npcMon.getHP();
				npcMonMP=npcMon.getMP();
				
				addmessage("遊戲開始!\n--第"+round+"回合--");

				ATT_btn.setEnabled(true);
				MAG_btn.setEnabled(true);
			}
		});
		thread.start();
	}
	public void sleep500() {
		try {
			thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void sleep1sec() {
		try {
			thread.sleep(600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	private class mySwWok extends SwingWorker{
//
//		@Override
//		protected String doInBackground() throws Exception {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		@Override
//		protected void process(List chunks) {
//			// TODO Auto-generated method stub
//			super.process(chunks);
//		}
//
//		@Override
//		protected void done() {
//			// TODO Auto-generated method stub
//			super.done();
//		}
//		
//		
//	}
}
