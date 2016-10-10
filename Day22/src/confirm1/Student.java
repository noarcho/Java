package confirm1;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	// 여기에 코드를 작성하세요
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if(o.hashCode() == studentNum.hashCode())
			return true;
		else return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNum.hashCode();
	}
}
