package lab1_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileErrorTest {
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("data.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("������ �߰ߵ��� �ʾҽ��ϴ�.");
			e.printStackTrace();
		}
		
	}
}
