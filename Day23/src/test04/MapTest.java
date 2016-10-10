package test04;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Student> st = new HashMap<String, Student>();
		st.put("20090001", new Student(20090001, "����ǥ"));
		st.put("20090002", new Student(20090002, "���ܵ�"));
		st.put("20090003", new Student(20090003, "������"));
		
		System.out.println(st);
		
		st.remove("20090002");
		
		st.put("20090003", new Student(20090003, "������"));
		
		System.out.println(st.get("20090003"));
		
		for(Map.Entry<String, Student> s: st.entrySet()){
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("�й�:"+key);
			System.out.println("�л�����:"
					+ ""+value);
		}
	}
}
