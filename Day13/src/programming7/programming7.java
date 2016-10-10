package programming7;

public class programming7 {
	public static void main(String[] args) {
		UnderGraduate u1 = new UnderGraduate("홍길동", "000001", "컴퓨터", 4, 4.0, "컴퓨터가 조아");
		Graduate g1 = new Graduate("고길동", "110030", "경제", 4, 4.4, "교육 조교", 0.7);
		
		System.out.println(u1.getName());
		System.out.println(u1.getStuNo());
		System.out.println(u1.getMajor());
		System.out.println(u1.getYear());
		System.out.println(u1.getGrade());
		System.out.println(u1.getClubname());
		
		System.out.println("---------------------------");
		
		System.out.println(g1.getName());
		System.out.println(g1.getStuNo());
		System.out.println(g1.getMajor());
		System.out.println(g1.getYear());
		System.out.println(g1.getGrade());
		System.out.println(g1.getAssistant_instructor());
		System.out.println(g1.getScholarship_rate());
	}
}

class Student {
	private String name;
	private String stuNo;
	private String major;
	private int year;
	private double grade;
	
	public Student(String name, String stuNo, String major, int year, double grade) {
		super();
		this.name = name;
		this.stuNo = stuNo;
		this.major = major;
		this.year = year;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}	
}

class UnderGraduate extends Student {
	private String clubname;

	public UnderGraduate(String name, String stuNo, String major, int year, double grade, String clubname) {
		super(name, stuNo, major, year, grade);
		this.clubname = clubname;
	}

	public String getClubname() {
		return clubname;
	}

	public void setClubname(String clubname) {
		this.clubname = clubname;
	}
	
	
	
}

class Graduate extends Student {
	private String assistant_instructor;
	private double scholarship_rate;
	
	public Graduate(String name, String stuNo, String major, int year, double grade, String assistant_instructor,
			double scholarship_rate) {
		super(name, stuNo, major, year, grade);
		if(assistant_instructor.equals("교육 조교") == true || assistant_instructor.equals("연구 조교") == true)
			this.assistant_instructor = assistant_instructor;			
		else this.assistant_instructor = "error";
		
		if(this.scholarship_rate >= 0 && this.scholarship_rate <= 1)
			this.scholarship_rate = scholarship_rate;
		else this.scholarship_rate = 0;
	}

	public String getAssistant_instructor() {
		return assistant_instructor;
	}

	public void setAssistant_instructor(String assistant_instructor) {
		this.assistant_instructor = assistant_instructor;
	}

	public double getScholarship_rate() {
		return scholarship_rate;
	}

	public void setScholarship_rate(double scholarship_rate) {
		this.scholarship_rate = scholarship_rate;
	}
}