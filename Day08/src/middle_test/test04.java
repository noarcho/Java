package middle_test;

import java.lang.reflect.Array;
import java.util.Scanner;

public class test04 {
	public static void main(String[] args) {
		
		int[] array1 = {10, 20, 30, 40};
		int[] array2 = new int[array1.length];
		
		//���� ���� : �Ѵ� ���� �ּҰ��� ����Ų��
		
		int[] array3 = array1;
		
		//���� ���� : �ΰ��� �ٸ� �ּҰ��� ����Ų��.
		for(int i = 0; i<array1.length;i++)
			array2[i] = array1[i];
		
		array2 = new int[array1.length];
		
		for(int n:array2){
			array1[n] = array2[n];
			}
		
		// �������� for ������ 3��(�ʱ�ȭ; ����; ����)�� ���� ��� for each�� ����(����:�迭)���� ����.
		// �Ϲ� for ������ ������ ��������������� for each�� �迭�� ������ �ڵ����� ��� ���ư��� �ȴ�.

	}
}