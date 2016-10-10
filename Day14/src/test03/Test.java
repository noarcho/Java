package test03;

public class Test {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 20);
		System.out.println(calcArea(r));

		Triangle t = new Triangle(10, 20);
		System.out.println(calcArea(t));

		//Circle c = new Circle(10);
		System.out.println(calcArea(new Circle(10)));

	}

	public static double calcArea(Shape s){ // �޼ҵ��� �Ű������� �θ��ڷ��������ߴ���
    	double result = 0;                  //
    	
    	
    	if(s instanceof Rectangle){
    		result = ((Rectangle) s).getWidth() + 
    				((Rectangle) s).getHeight();
    	}else if(s instanceof Triangle){
    		Triangle tri = (Triangle)s;
    		result = tri.getWidth() * tri.getHeight()/2;
    	}else if(s instanceof Circle){
    		
    	}
    	return result;
    }
}