package z.practice.oop.ex1;

public class TriangleController {
	private Shape s = new Shape();
	
	public double calcArea(double height, double width) {
		double Area = (height * width) / 2;
		System.out.println("삼각형 면적 : " + Area);
		return Area;
	}
	
	public void paintColor(String color) {
		
	}
	
	public String print(double Area,double height, double width,String color) {
		return (s.getType()+Area+height+width+color);
	}
	
	

}
