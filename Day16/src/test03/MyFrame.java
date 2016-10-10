package test03;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private JButton btn = new JButton("버튼입니다.");
	
	public MyFrame() {
		setLayout(new FlowLayout());	// FlowLayout : 적당히 배치시켜라
		
		add(btn);
		
		setSize(300, 200);
		setTitle("세번째 제목");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);	// 필요한 설정 다해놓고
							// 마지막에 보여주기 위해
		                    // setVisible을 제일 마지막으로
	}
}
