package z.practice.oop.ex7;

public class Circle extends Point{
	private int radius;
	
	

	public Circle() {
		super();
	}

	public Circle(int x, int y, int radius) {
		super(x, y); //부모클래스의 필드는 부모가 생성될떄 초기화
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return super.toString()+" , " +radius;
	}

}
