package test01;

import javax.swing.JFrame;

public class Test {
	public static void main(String[] args) {
		JFrame f = new JFrame();	// JFrame ��ü ����
		f.setTitle("����");	// JFrame�� ����ǥ����
		f.setSize(300, 200);	// JFrame ũ�� ����
		f.setVisible(true);	// JFrame ǥ�� �޼ҵ�
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// JFrame�� �����ư Ȱ��ȭ(������ �޸� ��ȯ)
	}
}
