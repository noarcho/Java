package test01;

import javax.swing.JFrame;

public class Test {
	public static void main(String[] args) {
		JFrame f = new JFrame();	// JFrame 객체 생성
		f.setTitle("제목");	// JFrame의 제목표시줄
		f.setSize(300, 200);	// JFrame 크기 지정
		f.setVisible(true);	// JFrame 표시 메소드
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// JFrame의 종료버튼 활성화(종료후 메모리 반환)
	}
}
