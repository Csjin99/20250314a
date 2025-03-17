package z.practice.oop.ex7;

public class Point extends Object{
	private int x;
	private int y;
	
	
	public Point() {
	
	}


	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}

	
	// toString -> 클래싀의 모든 필드정보를 문자열로 반환하는 메서드
	//BOject클래스에 정의가 되어있는 메서드로 참조변수 출력시 자동으로 호출되는 메서드
	@Override //어노텐션
	public String toString() {
		return super.toString() + ", ";
	}

}
