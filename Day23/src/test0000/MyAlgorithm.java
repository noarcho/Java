package test0000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MyAlgorithm {
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();

		list.add(0.5454);
		list.add(1.5454);
		list.add(2.5454);

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		for (double d : list) 
			System.out.println(d);


		Double d;
		Iterator e = list.iterator();
		while (e.hasNext()) {
			d = (double) e.next();
			System.out.println(d);
		}

	}
}
