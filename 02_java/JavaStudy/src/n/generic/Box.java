package n.generic;

import java.util.Arrays;

public class Box<T> {
	
	private T[] ObArr;
	private int Size;
	
	public Box() {
		super();
	}

	public T[] getObArr() {
		return ObArr;
	}

	public void setObArr(T[] obArr) {
		ObArr = obArr;
	}

	public int getSize() {
		return Size;
	}

	public void setSize(int size) {
		Size = size;
	}

	@Override
	public String toString() {
		return "Box [ObArr=" + Arrays.toString(ObArr) + ", Size=" + Size + "]";
	}
	
	
	
	
}
