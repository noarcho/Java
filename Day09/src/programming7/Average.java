package programming7;

public class Average {
	private int num1, num2, num3;
	
	public double getAverage(int a, int b){
		num1 = a;
		num2 = b;
		return (num1+num2)/2.0;
	}
	public double getAverage(int a, int b, int c){
		num1 = a;
		num2 = b;
		num3 = c;
		return (num1+num2+num3)/3.0;
	}

}
