package z.practice.oop.ex1;

public class SquareController {
	private Shape s = new Shape();
	
	
	public double calcPerimeter(double height, double width) {
		double Perimter = (height *2) + (width *2);
		return Perimter;
		
	}
	
	public double calcArea(double height, double width) {
		double Area = height * width;
		return Area;
	}
	
	public void paintColor(String color) {
		this.s.setColor(color);
	}
	public String print() {
		return null;
		
	}
	
}
