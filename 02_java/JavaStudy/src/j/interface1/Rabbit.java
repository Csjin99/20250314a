package j.interface1;

public class Rabbit implements Animal,Baby{

	@Override
	public void move() {
		System.out.println("깡총깡총");
		
	}

	@Override
	public void eat() {
		System.out.println("옴뇸뇸");
		
	}

	@Override
	public void makeSound() {
		System.out.println("꿀꿀 부르릉");
		
	}

}
