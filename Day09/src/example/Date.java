package example;

public class Date {
	private int year;
	private String month;
	private int day;

	public void setDate(int input_year, String input_month, int input_day){
		year = input_year;
		month = input_month;
		day = input_day;
	}
	public void printDate(){
		System.out.println(year + "³â " + month + " " + day + "ÀÏ");
	}
}
