package confirm5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataPrintExample {
	public static void main(String[] args) {
		Date now = new Date();

		// ���⼭ �ڵ带 �ۼ��ϼ���.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh�� mm��");

		System.out.println(sdf.format(now));
	}
}
